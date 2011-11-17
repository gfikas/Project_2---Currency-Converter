package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class InfoReturn extends HttpServlet {
         public void doGet(HttpServletRequest request,
                              HttpServletResponse response)
                              throws IOException, ServletException {
                              
            response.setContentType("text/html");
            
            String url = (String) getServletContext().getAttribute("reportURL");
            
            response.sendRedirect(url);
         }
}