<%-- 
    Document   : admin-worship
    Created on : May 10, 2017, 2:55:39 PM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="admin-header.jsp"></jsp:include>
<jsp:include page="admin-nav.jsp"></jsp:include>

 <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            WorshipForms
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="/admin/worship">Dashboard</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-edit"></i> Forms
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">

                 <form role="form" action="${pageContext.request.contextPath}/admin/worship/add" method="POST">

    
    <input type="hidden" name="id" name="id" value="${worshipvalue.get(0).wid}"/>
          
                            
                            <div class="form-group">
                                <label>Name of Puja:</label>
                                <input class="form-control" value="${worshipvalue.get(0).pujaName}"  name="pujaName" placeholder="Enter name of Puja">
                            </div>
                            
                            <div class="form-group">
                                <label>Puja By:</label>
                                <input class="form-control" value="${worshipvalue.get(0).pujaBy}"  name="pujaBy" placeholder="Enter Puja By">
                            </div>
                            
                            <div class="form-group">
                                <label>Puja Time:</label>
                                <input class="form-control" value="${worshipvalue.get(0).pujaTime}"  name="pujaTime" placeholder="Enter Puja Time">
                            </div>
                            
        <button type="submit" class="btn btn-sucess">Submit Button</button>
                            <button type="reset" class="btn btn-default">Reset Button</button>

                        </form>
                    </div>
                </div>
                
                
                
                
                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                          Worship  Detail
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="/admin/worship">Worship</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-table"></i> Worship Table
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">
                        <h2>Bordered Table</h2>
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>Wid</th>
                                        <th>PujaName</th>
                                        <th>PujaBy</th>
                                        <th>PujaTime</th>
                                        <th>Edit</th>
                                        <th>Delete</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${worshipdata}" var="worship">
                                    <tr>
                                        <td>${worship.wid}</td>
                                        <td>${worship.pujaName}</td>
                                        <td>${worship.pujaBy}</td>
                                        <td>${worship.pujaTime}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/admin/worship/edit/?id= ${worship.wid}">
                             <span class="glyphicon glyphicon-edit"></span>
                                </a>
                            </td>
                                        <td>
                                          <a href="${pageContext.request.contextPath}/admin/worship/delete/?id= ${worship.wid}">
                             <span class="glyphicon glyphicon-remove"></span>
                                </a>    
                                            
                                        </td>
                                        
                                        
                                    </tr>
                                    </c:forEach>
                                    
                                    
                                </tbody>
                                
                            </table>
                        </div>
                    </div>
           
                
                
                
                
                
      <jsp:include page="admin-footer.jsp"></jsp:include>
                        
                        
                        
                        

