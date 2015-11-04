<!DOCTYPE html>
<html>
<head>
  <title>First app with golang</title>
  <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
  <div class="login-container">
    <div class="logo-content">
      <div class="logo-header">
        <img src="images/jinjiplus_app_logo.png">
      </div>
    </div>
  </div>
  <div class="login-form">
    <form action="/login" method="post" novalidate="novalidate">
      <div class="form-group">
        <div class="input-group">
          <div class="input-group-addon">
            <i class="fa fa-user"></i>
          </div>
          <input class="form-control" type="text" name="username" placeholder="Eg. Username or test@example.com">
        </div>
      </div>
      <div class="form-group">
        <div class="input-group">
          <div class="input-group-addon">
            <i class="fa fa-key"></i>
          </div>
          <input class="form-control" type="password" name="password" placeholder="Password">
        </div>
      </div>
      <div class="form-group">
        <button class="btn btn-info btn-full" type="submit">Sign in</button>
      </div>
      <div class="form-group">
        <a class="facebook-button btn btn-default btn-lg btn-block btn-icon" href="/auth/auth/facebook"><i class="fa fa-facebook"></i>Sign in with Facebook</a>
      </div>
      <div class="form-group">
        <a class="google-button btn btn-default btn-lg btn-block" href="/auth/auth/google_oauth2"><i class="fa fa-google-plus-square"></i>Sign in with Google
        </a>
      </div>
      <div class="line line-dashed">
        <p class="text-muted text-center">Do you have an account?</p>
        <a class="btn btn-info btn-full sign-up" href="/sign_up"> Create an account </a>
      </div>
      <div class="login-bottom-links">
        <a class="link" href="/password/new">Forgot password?</a>
      </div>
      
    </form>
  </div>
  <footer id="footer">
    <div class="text-center padder clearfix">
      <p class="social-footer text-primary">
        Golang – App Made Easier © 2015
        <br>
        <br>
        <a class="btn btn-lg" href="https://twitter.com/locnpq" target="_blank"><i class="fa fa-twitter"></i></a>
        <a class="btn btn-lg" href="https://www.facebook.com/jeff235255" target="_blank"><i class="fa fa-facebook"></i></a>
      </p>
    </div>
  </footer>
</body>
</html>