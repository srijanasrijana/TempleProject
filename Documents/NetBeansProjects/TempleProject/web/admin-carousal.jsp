<%-- 
    Document   : carousal
    Created on : May 23, 2017, 11:40:34 AM
    Author     : srijana
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
                            Forms
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.html">Carousal</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-edit"></i> Forms
                            </li>
                        </ol>
                    </div>
                </div>
         
         
 <div class="row">
<div class="col-lg-6">
                        
                        
<form role="form"  action="${pageContext.request.contextPath}/admin/carousal/add" method="POST" enctype="multipart/form-data">
  <div class="form-group"> 
        
    <div class="form-group">                   
    <label>Status:</label>
        <label>
       <input type="radio" name="status" id="OptionasRadio1"   value="Active" 
        <c:if test="${carousalvalue.get(0).status.equals('Active')}"></c:if>checked >Active     
        </label>
        <label>
       <input type="radio" name="status" id="OptionasRadio2"   value="Inactive" 
        <c:if test="${carousalvalue.get(0).status.equals('Inactive')}"></c:if>checked >InActive
        </label>
       </div>
                 
       <div class="form-group">
       <label>Image:</label>
       <input  type="file"    name="file"
        <c:if test="${not empty carousalvalue.get(0).file}">
        <img src="${pageContext.request.contextPath}/images/${"carousalvalue.get(0).file"}"/> 
        </c:if> >
        </div>
     <button type="submit" class="btn btn-success">Submit Button</button>
 </div> 
    
</form>    
   
 </div>
 </div>
     
   <!-- Page Heading -->
       <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                          Carousal Detail
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.html">Carousal</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-table"></i> carousal Table
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
                                        <th>id</th>
                                        <th>Status</th>
                                        <th>File</th>
                                        
                                        <th>Edit</th>
                                        <th>Delete</th>
                                    </tr>
                                </thead>
                                
                                
                                <tbody>
                                <c:forEach items="${carousaldata}" var="caro">
                                    
                                    <tr>
                                        
                                     <td>${caro.id}</td>
                                        <td>${caro.status}</td>
                                        <td>
                                            
                                             <a href="${pageContext.request.contextPath}/images/${caro.file}" target="_blank">
                                            <img height="50" width="50"  src=" ${pageContext.request.contextPath}/images/${caro.file}">
                                             </a>
                                            
                                            </td>  
                                        
                                         
                                        
                                        
                                      <td><a href="${pageContext.request.contextPath}/admin/carousal/edit/?id=${caro.id}">
                                                <span class="glyphicon glyphicon-edit"></span>
                                            </a>
                                </td>
                                         <td><a href="${pageContext.request.contextPath}/admin/carousal/delete/?id=${caro.id}">
                                                <span class="glyphicon glyphicon-remove"></span>
                                            </a>
                                    </td> 
                                       
                                        
                                    </tr> 
                                </c:forEach>
                                    
                                </tbody>
                                
                                
                            </table>
                    
            
            
             </div>
           </div>
                    
                    </div>
     
     
     </div>
</div>

          




<jsp:include page="admin-footer.jsp"></jsp:include>


