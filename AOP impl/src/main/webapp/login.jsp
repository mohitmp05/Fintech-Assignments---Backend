<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Login</title>
  <link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

<div class="container text-center">
  <div>
    <h1>Login Now</h1>
  </div>
  <form action="login" method="POST" style="max-width:600px; margin:0 auto;">
  <div class="m-3">
    <div class="form-group row">
      <label class="col-form-label col-4">Email</label>
      <div class="col-8">
        <input type="email" class="form-control" name="email" value="${Customer.email}" required/>
      </div>
    </div>

      <div class="form-group row">
        <label class="col-form-label col-4">Password</label>
        <div class="col-8">
          <input type="password" class="form-control" name="password" value="${Customer.password}" required />
        </div>
        </div>
            
              <br><input type="submit" value="Submit"><br>


          
    <!-- <div>
      <button type="submit" class="btn btn-primary">Sign Up</button>
    </div> -->

  </div>
</form>
</div>

</body>
</html>