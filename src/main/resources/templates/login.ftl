<html>
<head>
    <title>登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <#include "/taglib.ftl">
</head>
<body class="flat-blue login-page">
<div class="container">
    <div class="login-box">
        <div>
            <div class="login-form row">
                <div class="col-sm-12 text-center login-header">
                    <h4 class="login-title">融合微信的教学管理系统</h4>
                </div>
                <div class="col-sm-12">
                    <div class="login-body">
                        <div class="progress hidden" id="login-progress">
                            <div class="progress-bar progress-bar-success progress-bar-striped active" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%">
                                Log In...
                            </div>
                        </div>
                        <form action="/login" method="post">
                            <div class="control">
                                <input type="text" class="form-control" value="" name="username" />
                            </div>
                            <div class="control">
                                <input type="password" class="form-control" value="" name="password" />
                            </div>
                            <div class="login-button text-center">
                                <input type="submit" class="btn btn-primary" value="登录">
                            </div>
                        </form>
                    </div>
                    <div class="login-footer">
                        <span class="text-right"><a href="#" class="color-white">忘记密码?</a></span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>