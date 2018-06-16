<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

        <style>
            /* Remove the navbar's default margin-bottom and rounded borders */ 
            .navbar {
                margin-bottom: 0;
                border-radius: 0;
            }

            /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
            .row.content {height: 450px}

            /* Set gray background color and 100% height */
            .sidenav {
                padding-top: 20px;
                background-color: #f1f1f1;
                height: 100%;
            }

            /* Set black background color, white text and some padding */
            footer {
                background-color: #555;
                color: white;
                padding: 15px;
            }

            /* On small screens, set height to 'auto' for sidenav and grid */
            @media screen and (max-width: 767px) {
                .sidenav {
                    height: auto;
                    padding: 15px;
                }
                .row.content {height:auto;} 
            }
        </style>
        <%
            if (session.getAttribute("Message") == "admin") {
        %>
            <script>alert("<%=session.getAttribute("Message")%>");</script>
        <%
                session.removeAttribute("Message");
        }%>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a onclick="logout()" href="index.jsp"><span class="mouse-change glyphicon glyphicon-log-in"></span> Logout </a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <hr>
        <h2 class="intro-text text-center">
            <strong>Employees Leaves detail</strong>
        </h2>
        <hr>
        
                
                    <center>
                        <div class="box">
                            <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
                                               url="jdbc:mysql://localhost/emplev"
                                               user="root"  password="root"/>

                            <sql:query dataSource="${snapshot}" var="result">
                                SELECT * from leaveinfo;
                            </sql:query>

                            <table border="1" width="100%">
                                <tr>
                                    <th width="10%">Employee ID</th>
                                    <th width="20%">Name</th>
                                    <th width="20%">Email</th>
                                    <th width="10%">Start Date</th>
                                    <th width="10%">End Date</th>
                                    <th width="30%">Reason</th>
                                    <th width="10%">Days</th>
                                </tr>
                                <c:forEach var="row" items="${result.rows}">
                                    <tr>
                                        <td><c:out value="${row.eid}"/></td>
                                        <td><c:out value="${row.ename}"/></td>
                                        <td><c:out value="${row.email}"/></td>
                                        <td><c:out value="${row.sdate}"/></td>
                                        <td><c:out value="${row.edate}"/></td>
                                        <td><c:out value="${row.reason}"/></td>
                                        <td><c:out value="${row.days}"/></td>
                                    </tr>
                                </c:forEach>
                            </table>

                            <button class="btn btn-primary" style="width: 100px;margin-top: 2%" onclick="goBack()">Go Back</button>
                        </div>

                    </center>
                   
          


        <script>
            function logout() {
                alert("You have Successfully Logout!");
            }
        </script>
    </body>
</html>
