<html>
<head>
    <title>Welcome!</title>
</head>
<body>
<form name="form"  action="/login" method="POST">
    <div class="form-group">
        <label for="username">账号</label>
        <input type="text" class="form-control" name="username" id="username" value="" placeholder="账号" />
    </div>
    <div class="form-group">
        <label for="password">密码</label>
        <input type="password" class="form-control" name="password" id="password" placeholder="密码" />
    </div>
    <input type="submit" id="login" value="Login" class="btn btn-primary" />
</form>
</body>
</html>