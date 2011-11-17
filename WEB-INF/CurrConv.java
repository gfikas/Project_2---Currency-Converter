package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CurrConv extends HttpServlet {
         public void doGet(HttpServletRequest request,
                              HttpServletResponse response)
                              throws IOException, ServletException {
              
              String from = request.getParameter("from_cur");
        	  String amount = request.getParameter("amount");
        	  String to = request.getParameter("to_cur");
        	  Converter be = new Converter();
        	  String result = be.getExchangeRate(from, amount, to);
        	  
        	  String[] tok = result.split("\"");
        	  tok[1] = tok[1].replaceAll("�",",");
        	  
        	  /*response.setContentType("text/html");
              PrintWriter out = response.getWriter();
              out.println("You asked for:<br>");
        	  
        	  out.println("<br>" + amount + from + " to be converted to " + to);
        	  out.println("<br> The result is: " + result);*/
        	  
        	  request.setAttribute("styles", tok);
        	  RequestDispatcher view = request.getRequestDispatcher("result.jsp");
          	  view.forward(request, response);
         }
}