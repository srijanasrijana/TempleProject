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
                                    
					<section class="container" style="margin-right: -50px">
                                           
                                            <h2><u>${eventdata.get(0).eventName}</u></h2>
                                            
                                           
                                       
                                        <h6>Time to Visit in Event       : ${eventdata.get(0).eventTime}</h6>
                                        <h6 >Hall Name for Visiters : ${eventdata.get(0).hallName}</h6>
                                        <h6>Organizer of an Event:  ${eventdata.get(0).eventOrganizer}</h6>
                                            <div  style="margin-right:70px">  <hr>
                                                
                                                <center> <p>${eventdata.get(0).eventDescription}</p></center>
                                                
                                                
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