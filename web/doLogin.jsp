<%-- 
    Document   : doLogin
    Created on : Aug 9, 2016, 4:49:06 PM
    Author     : kimaiga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"language="java" import="java.sql.*" errorPage=""%>
<%@ include file="function.jsp"%>
<jsp:useBean id="dbConn" scope="request" class="db.DbConn"/>
<%
                        Connection conn=null;
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        conn = DriverManager.getConnection("jdbc:mysql://localhost/webvoter","root","303seminarian");
                        
			ResultSet rsOptions = null;
			PreparedStatement psOptions=null;
			
			String sUserID=nullconv(request.getParameter("voterid"));
			String sPassword=nullconv(request.getParameter("password"));
			String message="User login done successfully";
			String loginYes="";
                        
                        String query = "SELECT * FROM registration WHERE password='"+sPassword+"'and idnumber='"+sUserID+"'";
                        Statement st = conn.createStatement(); 
                        ResultSet rs = st.executeQuery(query);
                        
                        if (rs.next()) {
                            session.setAttribute("fullnames", rs.getString("fullnames"));
                            response.sendRedirect("voterdashboard.jsp");
                        } else{
                            message="No user or password matched" ;
                            response.sendRedirect("index.jsp?error="+message);
			}
			
			try{
                            if(psOptions!=null){
                                psOptions.close();
                            }
                            if(rsOptions!=null){
                                rsOptions.close();
                            }
                            if(conn!=null){
                                conn.close();
                            }
                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
			}
%>
