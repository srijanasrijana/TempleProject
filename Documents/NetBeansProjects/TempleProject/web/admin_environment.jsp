<%-- 
    Document   : Register
    Created on : Jun 10, 2017, 1:58:39 PM
    Author     : srijana
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<jsp:include page="admin-header.jsp"></jsp:include>
<jsp:include page="admin-nav.jsp"></jsp:include>
 <!-- Contact Details Column -->
          
  <div id="page-wrapper">

    <div class="container-fluid">

       <!-- Page Heading -->
         <div class="row">
            <div class="col-lg-12">
               <h1 class="page-header">PashuPatinath Temple</h1>
                  <ol class="breadcrumb">
                      <li> <i class="fa fa-dashboard"></i>  <a href="/admin/event">Temple</a></li>
                         <li class="active">
                            <i class="fa fa-edit"></i> Environment
                        </li>
                    </ol>
              </div>
           </div>
            <!-- /.row -->

            <div class="row">
              <div class="col-lg-6">
                  <form role="form" action="${pageContext.request.contextPath}/admin/environment/add" method="POST">
                    <input type="hidden" name="id" value="${environmentvalue.get(0).eid}"/>
                   
               <div class="form-group">
                        <label> Temple Area</label>
                        <input class="form-control" value="${environmentvalue.get(0).templeName}" name="name" placeholder="Enter Temple name">
                    </div>
                    
                    <div class="form-group">
                        <label>Visitors Address</label>
                        <input class="form-control" value="${environmentvalue.get(0).visitorsAddress}" name="address" placeholder="Enter address of Temple Visitors">
                    </div>
                    
                     <div class="form-group">
                                <label>Environment Of Temple</label>
                                <select class="form-control"  value="${environmentvalue.get(0).envCondition}" name="condition" >
                                   <option> Condition of Temple</option>
                                    <option> Excellent</option>
                                    <option>Very Good</option>
                                    <option>Good</option>
                                    <option>Nice</option>
                                    <option>Very Poor</option>
                                </select>
                       </div>
                         
                                   
                                   
          
                       <div class="form-group">
                       <label>Image:</label
                       <!--For Image Edit-->
                      <input  type="file"    name="file"
                              <c:if test="${not empty environmentvalue.get(0).envFile}">
                                  <img height="100" width="100" 
                                  src="${pageContext.request.contextPath}/images/${"environmentvalue.get(0).envFile"}" /> 
                            </c:if>
                              
                       </div>
                      
                                   <br>         
                     <div class="form-group">                   
                    <label>Visitors In Temple:</label>
                    <br>
                    <label>
                        <input type="radio" name="visitors" id="OptionasRadio1"   value="National" 
                    <c:if test="${environmentvalue.get(0).templeVisitors.equals('Active')}"></c:if>checked>National
                            
                    </label>
                    <label>
                   <input type="radio" name="visitors" id="OptionasRadio2"   value="International"
                      <c:if test="${environmentvalue.get(0).templeVisitors.equals('Active')}"></c:if>unchecked>International
                    </label>
                   </div>
                    <div class="form-group">
                        <label>Temple Organizer</label>
                        <input class="form-control" value="${environmentvalue.get(0).templeOrganizor}" name="organizer" placeholder="Enter Temple organizer">
                    </div>
                   <div class="form-group">
                        <label>Time</label>
                        <input class="form-control" value="${environmentvalue.get(0).openTime}" name="time" placeholder="Enter time to enter">
                    </div>
                    <div class="form-group">
                                <label> Scope Of Area</label>
                                <textarea class="form-control" value="${environmentvalue.get(0).templeScope}" name="scope" rows="3"></textarea>
                    </div>
                            
                     <button type="submit" class="btn btn-success">Submit Button</button>
                    <button type="reset" class="btn btn-default">Reset Button</button>

                </form>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-12">
                <h2>Temple Environment</h2>
                <div class="table-responsive">
                    <table class="table table-bordered table-hover">
                        <thead>
                            <tr>
                                <th>Eid</td>
                                <th>Temple Area</th>
                                <th>Visitors Address</th>
                                <th>Condition</th>
                                <th>Image</th>
                                <th>Visitors</th>
                                <th>Organizor</th>
                                <th>Time</th>
                                <th>Scope</th>
                                 
                               
                               
                                 <th>Delete</th>
                                  <th>Edit</th>
                             
                            </tr>
                            
                            
                        </thead>
                        
                        
                        <tbody>
                            <c:forEach items="${environmentdata}" var="environment" >
                                <tr>
                                    <td>${environment.eid}</td>
                                    <td>${environment.templeName}
                                    
                                    </td>
                                    <td>${environment.visitorsAddress}</td>
                                    <td>${environment.envCondition}</td>
                                    
                                    
                                    
                                    
                                    
                                     <td>
                                       <a href="${pageContext.request.contextPath}/images/${environment.envFile}" target="_blank">
                                       <img height="100" width="100"  src=" ${pageContext.request.contextPath}/images/${environment.envFile}">
                                         </a>
                                      </td>  
                                        
                                    
                                    
                                    <td>${environment.templeVisitors}</td>
                                    
                                    
                                    <td>${environment.templeOrganizor}</td>
                                    <td>
                                    <span class="glyphicon glyphicon-time"></span>
                                    ${environment.openTime}
                                    </td>
                                    <td>${environment.templeScope}</td>
                                    
                                    
                                     <td><a href="${pageContext.request.contextPath}/admin/environment/delete/?id=${environment.eid}">
                                            <span class="glyphicon glyphicon-remove"></span>
                                        </a></td>
                                    
                                    <td><a href="${pageContext.request.contextPath}/admin/environment/edit/?id=${environment.eid}">
                                            <span class="glyphicon glyphicon-edit"></span>
                                        </a></td>
                                        
                                        
                                    
                                </tr>
                                
                            </c:forEach>
                            
                        </tbody>
                     
                    </table>
                </div
            </div>

        </div>

    </div>
</div>
</div>
        <hr>
        
        <jsp:include page="admin-footer.jsp"></jsp:include>