<!DOCTYPE html>
<html>
<head>
  <title>First app with golang</title>
  <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
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
    <form action="/login" method="post">
      <div style="height: 120px; width: 200px; border: 1px solid #ccc; padding: 10px;">
        <p>Favorites</p>
        <input type="checkbox" name="interest" value="football">Football <br>
        <input type="checkbox" name="interest" value="basketball">Basketball<br>
        <input type="checkbox" name="interest" value="tenis">Tenis<br>
      </div> 
      username: <input type="text" name="username">
      Password:<input type="password" name="password">
      <input type="submit" value="Login">
    </form>
  </div>
</body>
</html>