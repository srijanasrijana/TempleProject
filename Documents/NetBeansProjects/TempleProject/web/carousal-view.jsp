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
				<div id="featured"  style="background-color: white">
					<section class="container">
						<header>
	<header style="margin-left: 20px"><h2 style="margin-left:-30px"><ul>Gallery of Temple</ul></h2>
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
            	
            <div>
                <img src="${pageContext.request.contextPath}/images/a.jpg" height="200px" width="300px" >
                <img src="${pageContext.request.contextPath}/images/b.jpg" height="200px" width="300px">
                <img src="${pageContext.request.contextPath}/images/c.jpg" height="200px" width="300px">
          </div>
            </div>
	<!-- Main -->
                        
	<div id="main">
                                    
            <section class="container">
                
                <h2 style="color: #000">${carousaldata.get(0).status} Image Of Temple: </h2>
                <center>
             <c:if test="${not empty carousaldata.get(0).file}">
                 <img src="${pageContext.request.contextPath}/images/${carousaldata.get(0).file}" height="400" width="400"/> 
             </c:if></center> 

            <span class="glyphicon glyphicon-time"></span>
             </section>
                                
	</div>
<jsp:include page="index-footer.jsp"></jsp:include>
</div>