<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">My Currency Converter</h1>
<p>
<%
    String[] styles = (String[])request.getAttribute("styles");
    out.print("<br>" + styles[1] + " = " + styles[3]);
    out.print("<br><form action=\"\"><input type=button value=\"Go Back\"onClick=\"window.location.href='http://gfikas.serveftp.com/Project_2/cur_conv.html'\"></form>");
%>
</body>
</html>
