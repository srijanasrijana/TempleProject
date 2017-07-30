<%-- 
    Document   : event-view
    Created on : May 27, 2017, 2:01:13 PM
    Author     : srijana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>





<jsp:include page="index-header.jsp"></jsp:include>
<jsp:include page="font_nav.jsp"></jsp:include>





<div class="container">
<!-- Featured -->
<div id="featured" style="background-color: white">
   <section class="container" >
        <hr>
        <header style="margin-left: 20px"><h2 style="margin-left:-800px"><ul>Events of Temple</ul></h2>
            <p Align="Justify" style="color:black">Dedicated to Lord Shiva, Pashupatinath is one of the four most
                important religious sites in Asia for devotees of Shiva. Built in the 5th century and later
                renovated by Malla kings, the site itself is said to have existed from the beginning of the
                millennium when a Shiva lingam was discovered here. 
               <br>
                The largest temple complex in Nepal, it stretches on both sides of the Bagmati River which is 
                holy by Hindus.  The main pagoda style temple has a gilded roof, four sides covered in silver,
                and wood carvings of the finest quality. Temples dedicated to several other Hindu and Buddhist 
                deities surround the temple of Pashupatinath. 
            </p>
            
           
            
       </header>
    </section>
</div>
				
			<!-- Main -->
                        
				<div id="main" >
                                    
                                    
                                    
                                   
                                    
					<section class="container" ">
                                           
                                            <h2 style="background: #E5E5DB"><u>${environmentdata.get(0).templeName}</u></h2>
                                            
                                           
                                       
                                        <h6 style="background-color: green"><center> Address Of Visitors :  ${environmentdata.get(0).visitorsAddress}</center></h6>
                                    
                                        <h6 style="background-color: #198B66"><center>Condition Of Temple surrounding : ${environmentdata.get(0).envCondition}</center></h6>
                                    
                                        <h6 style="background-color: #2e6da4"><center>Visitors in Temple : ${environmentdata.get(0).templeVisitors}</center></h6>
                                        <h6 style="background-color: #aaa"> <center>Organizor of Temple :  ${environmentdata.get(0).templeOrganizor}</center></h6>
                                        <h6 style="background-color: #f0ad4e"><center>Time to open Temple : ${environmentdata.get(0).openTime}</center></h6>
                                        <br><br>
                                        <center>
                            <c:if test="${not empty environmentdata.get(0).envFile}">
                 <img src="${pageContext.request.contextPath}/images/${environmentdata.get(0).envFile}" height="400" width="400"/> 
                            </c:if></center>                
                                        
                                     
                                        
                                        
                                            <div  style="margin-right:70px">  <hr>
                                                
                                                <center> <p>${environmentdata.get(0).templeScope}</p></center>
                                                
                                                
                                            </div>
                                                <span class="glyphicon glyphicon-time">
                                                    
                                                </span>
                                                
                                                <section>
							<a class="image full"><img src="images/banner.jpg" alt="" /></a>
						</section>
                                        	
					</section>
                                
				</div>


			       <jsp:include page="index-footer.jsp"></jsp:include>
</div>