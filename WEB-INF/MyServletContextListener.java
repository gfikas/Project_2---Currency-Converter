package com.example;

import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent event) {
		
		ServletContext sc = event.getServletContext();
		String report = sc.getInitParameter("p2_report");
		
		sc.setAttribute("reportURL",report);
	}
		
	public void contextDestroyed(ServletContextEvent event) {
	}
}