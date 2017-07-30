<%-- 
    Document   : personal
    Created on : May 3, 2017, 12:54:27 PM
    Author     : Dell PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="index-header.jsp"></jsp:include>
<jsp:include page="font_nav.jsp"></jsp:include>
<!-- Featured -->
				<div id="featured">
					<section class="container">
						<header>
							<h2>Register</h2>
							
						</header>
					</section>
				</div>
				
			<!-- Main -->
				<div id="main">
					<section class="container">
                                             <form id="signupform"  method="POST" action="${pageContext.request.contextPath}/register/add" class="form-horizontal" role="form">

          <div id="signupalert" style="display:none" class="alert alert-danger">
            <p>Error:</p>
            <span></span>
        </div>



        <div class="form-group" >
            <label for="email" class="col-md-3 control-label">Email</label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="email" placeholder="Email Address">
            </div>
        </div>

        <div class="form-group">
            <label for="firstname" class="col-md-3 control-label">First Name</label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="firstname" placeholder="First Name">
            </div>
        </div>
        <div class="form-group">
            <label for="lastname" class="col-md-3 control-label">Last Name</label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="lastname" placeholder="Last Name">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-md-3 control-label">Password</label>
            <div class="col-md-9">
                <input type="password" class="form-control" name="password" placeholder="Password">
            </div>
        </div>

        <div class="form-group">
            <label for="icode" class="col-md-3 control-label"> Address</label>
            <div class="col-md-9">
                <input type="text" class="form-control" name="address" placeholder="enter address">
            </div>
        </div>

        <div class="form-group">
            <!-- Button -->                                        
            <div class="col-md-offset-3 col-md-9">
                <!--                                        <button id="btn-signup" type="button" class="btn btn-success"><i class="icon-hand-right"></i> &nbsp Sign Up</button>-->
                <button type="submit" class="btn btn-success">Sign Up</button>
                 
            </div>
        </div>

<!--        <div style="border-top: 1px solid #999; padding-top:20px"  class="form-group">-->

                                                      

        </div>



    </form>
                                        </section>
				</div>

    


              <jsp:include page="index-footer.jsp"></jsp:include>
  