
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body class="homepage">
		<div id="page-wrapper">

			<!-- Header -->
				<div id="header">
					<div class="container">

						<!-- Logo -->
							<div id="logo">
                                <a class="pennant"><img src="${pageContext.request.contextPath}/images/ohm.png" alt="logo" /></a>
								<h1><a href="index.html">Temple Website</a></h1>
							</div>

						<!-- Nav -->
                <nav id="nav">
                    <ul>
                        <li class="active" margin-left="200px"><a href="${pageContext.request.contextPath}/index">Home</a></li>
<!--                        <li>
                            <a href="#" class="icon fa-caret-down">About</a>
                            <ul>
             
                                <li><a href="Introduction.html">Introduction</a></li>
                                <li><a href="Mission.html">Mission</a></li>
                                <li><a href="Vision.html">Visison</a></li>
                                <li><a href="etc.html">etc.</a></li>
                            </ul>
                        </li>-->
                        <li>
                            <a  href="${pageContext.request.contextPath}/index"  class="icon fa-caret-down">Events</a>
                            <ul>
                                <c:forEach items="${eventdata}" var="event">


                                    <li><a href="${pageContext.request.contextPath}/event/view/?id=${event.eid}">${event.eventName}</a></li>

                                </c:forEach>

                            </ul>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/indexs" class="icon fa-caret-down">Worships</a>
                            <ul>
                                <c:forEach items="${worshipdata}" var="worship">



                                    <li><a href="${pageContext.request.contextPath}/worship/view/?id=${worship.wid}">${worship.pujaName}</a></li>

                                </c:forEach>



                            </ul>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/index1" class="icon fa-caret-down">Carousel</a>
                            <ul>
                               <c:forEach items="${carousaldata}" var="caro">


                                    <li><a href="${pageContext.request.contextPath}/carousal/view/?id=${caro.id}">${caro.status}</a></li>

                                </c:forEach> 
                               
                            </ul>
                        </li>
                        <li><a href="${pageContext.request.contextPath}/index2" class="icon fa-caret-down">Environment</a>
                        <ul>
                               <c:forEach items="${environmentdata}" var="environment">


                                    <li><a href="${pageContext.request.contextPath}/environment/view/?id=${environment.eid}">${environment.templeName}</a></li>

                                </c:forEach> 
                               
                            </ul>
                        
                        </li>
                        
                        
                        
                        <li><a href="${pageContext.request.contextPath}/login">Sin-In</a></li>
                        <li><a href="${pageContext.request.contextPath}/register">Register</a></li>

                    </ul>
                </nav>
					</div>
				</div>

                </div>
		
	</body>
</html>