<%-- 
    Document   : worship-view
    Created on : May 29, 2017, 7:36:18 PM
    Author     : srijana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="index-header.jsp"></jsp:include>
<jsp:include page="font_nav.jsp"></jsp:include>
			

<div class="container">

			<!-- Featured -->
				<div id="featured"  style="background-color: white">
					<section class="container">
						<header>
	<header style="margin-left: 20px"><h2 style="margin-left:-30px"><ul>Worhip in Temple</ul></h2>
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
            
           
							<section>
							<a class="image full"><img src="${pageContext.request.contextPath}/images/banner.jpg" alt="" />b</a>
						</section>
						
							
     </header>
					</section>
				</div>
				
			<!--Main--> 
				<div id="main">
                                    <div class="col-lg-6">
					<section class="container" >
                                            <center>
                                             <h2 style="margin-left: -60px">${worshipdata.get(0).pujaName}</h2>
                                        
                                        </center>
                                        <div class="table-responsive">
                            <table class="table table-bordered table-responsive">
                                <thead>
                                    <tr>
                                        
                                        
                                        
                                         <th style="background-color: green">PujaBy   <h6>${worshipdata.get(0).pujaBy}</h6></th>
                                         <th  style="background-color: green">PujaTime   <h6>${worshipdata.get(0).pujaTime}</h6></th>
                                    </tr>
                                </thead>
<!--                                        <h6>${worshipdata.get(0).pujaBy}</h6>
                                        
                                              <h6>${worshipdata.get(0).pujaTime}</h6>-->
                                        </table>
                                        
                                             
                                        <span class="glyphicon glyphicon-time"></span>
                                        </div>
						 
					</section>
                                </div>
                    
            
            
            

                
           
               
            
	  <jsp:include page="index-footer.jsp"></jsp:include>
          
</div>