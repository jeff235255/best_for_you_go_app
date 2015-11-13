<!DOCTYPE html>
<html>
<head>
  <title>Sign up – BestForYou – Goal-Tracking App © 2015</title>
  <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="/css/common.css">
  <link rel="stylesheet" type="text/css" href="/css/sign_in.css">
  <link rel="stylesheet" type="text/css" href="/css/sign_up.css">
</head>
<body>
  <div class="sign-up-container">
    <div class="logo-content">
      <div class="logo-header">
        <img src="images/jinjiplus_app_logo.png">
      </div>
    </div>
  </div>
  <div class="sign-up-form rows">
    <div class="m-t-large col-lg-10 col-lg-offset-1">
      <section class="panel">
        <form action="/login" method="post" novalidate="novalidate" id="new-user">
          <div class="form-group f-group">
            <h4 class="text-primary text-left">Enter your information details below</h4>
            <div class="input-group">
              <div class="input-group-addon">
                <i class="fa fa-info"></i>
              </div>
              <input class="form-control" type="text" name="first_name_user" placeholder="First name">
            </div>
            <div class="input-group">
              <div class="input-group-addon">
                <i class="fa fa-info"></i>
              </div>
              <input class="form-control" type="text" name="last_name_user" placeholder="Last name">
            </div>
            <div class="input-group">
              <div class="input-group-addon">
                <i class="fa fa-user"></i>
              </div>
              <input class="form-control" type="text" name="username_user" placeholder="User name">
            </div>
            <div class="input-group">
              <div class="input-group-addon">
                <i class="fa fa-envelope-o"></i>
              </div>
              <input class="form-control" type="email" name="email_user" placeholder="Email">
            </div>
            <div class="input-group">
              <div class="input-group-addon">
                <i class="fa fa-key"></i>
              </div>
              <input class="form-control" type="password" name="password_user" placeholder="Password">
            </div>
            <div class="input-group">
              <div class="input-group-addon">
                <i class="fa fa-key"></i>
              </div>
              <input class="form-control" type="password" name="re_password_user" placeholder="Re-type Password">
            </div>
           
          </div>
          <div class="form-group clear f-group text-primary">
            Agree Terms And Privacy Policy
          </div>
          <div class="form-group f-group">
            <button class="btn btn-info btn-full" type="submit">Sign up</button>
          </div> 
          <div class="form-group f-group">
            <h4 class="text-primary">Already have an account?</h4>
          </div>
          <div class="form-group f-group">
            <a class="btn btn-default btn-full sign-up" href="/sign_in"> Sign in </a>
          </div>
        </form>
      </section>
    </div>
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