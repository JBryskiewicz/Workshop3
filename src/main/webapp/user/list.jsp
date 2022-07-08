<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 07.07.2022
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/header.jsp" %>
            <!-- Begin Page Content -->
            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="d-sm-flex align-items-center justify-content-between mb-4">
                    <h1 class="h3 mb-0 text-gray-800">UsersCRUD</h1>
                    <a href="<c:url value="/users/add"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
                        <i class="fas fa-download fa-sm text-white-50"></i> Add Users</a>
                </div>
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">List of users</h6>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table">
                                <tr>
                                    <th>Id</th>
                                    <th>User Name</th>
                                    <th>E-mail</th>
                                    <th>Action</th>
                                </tr>
                                <c:forEach items="${users}" var="user">
                                <tr>
                                    <td>${user.id}</td>
                                    <td>${user.userName}</td>
                                    <td>${user.email}</td>
                                    <td>
                                        <a href='<c:url value="/users/del?id=${user.id}"/>'>Delete</a>
                                        <a href='<c:url value="/users/edit?id=${user.id}"/>'>Edit</a>
                                        <a href='<c:url value="/users/show?id=${user.id}"/>'>Show</a>
                                    </td>
                                </tr>
                                </c:forEach>
                            </table>
                        </div>
                    </div>
                </div>

            </div>
            </div>
            <!-- /.container-fluid -->
            </div>
        <!-- End of Main Content -->
<%@ include file="/footer.jsp" %>
