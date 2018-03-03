<!DOCTYPE html>
<html>

<head>
    <title>教学管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <#include "/taglib.ftl">
    <script type="text/javascript">
        $(function () {
            if (top.location !== self.location) {//防止session超时导致登录页被嵌套
                top.location = self.location;
            };
            window.setInterval("iframeLoad()", 200);
        });
        function iframeLoad(istop) {
            if (istop) {
                $("#innercontent").height(200);
            }
            try {
                $("#innercontent").height(document.getElementById("innercontent").contentWindow.document.body.scrollHeight);
                $("#innercontent").attr("Ec", "false");
            } catch (e) {
                $("#innercontent").attr("Ec", "true");
                $("#innercontent").css("height", $(".sidebar-inverse").height() - 100);
            }
            if ($("#innercontent").attr("Ec") == "true") {
                $("#innercontent").attr("scrolling", "yes");
            }
        }
        function topTest(innermodal) {
            $('#modalDefault').html(innermodal);
            try{modalInit();}catch (e){console.log(e)}
            $('#modalDefault').modal('show');
        }

    </script>
</head>

<body class="flat-blue">
<#--<body class="flat-blue">-->
<div class="app-container">
    <div class="row content-container">
        <nav class="navbar navbar-default navbar-fixed-top navbar-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-expand-toggle">
                        <i class="fa fa-bars icon"></i>
                    </button>
                    <ol class="breadcrumb navbar-breadcrumb">
                        <li class="active" id="innertitle">我的首页</li>
                    </ol>
                    <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                        <i class="fa fa-th icon"></i>
                    </button>
                </div>
                <ul class="nav navbar-nav navbar-right">
                    <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                        <i class="fa fa-times icon"></i>
                    </button>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                           aria-expanded="false"><i class="fa fa-comments-o"></i></a>
                        <ul class="dropdown-menu animated fadeInDown">
                            <li class="title">
                                Notification <span class="badge pull-right">0</span>
                            </li>
                            <li class="message">
                                No new notification
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown profile">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                        ${(user.name)!''}<span class="caret"></span></a>
                        <ul class="dropdown-menu animated fadeInDown">
                            <li class="profile-img">
                                <img src="img/default_avatar.jpg" class="profile-img">
                            </li>
                            <li>
                                <div class="profile-info">
                                    <h4 class="username">${(user.name)!''}</h4>
                                    <p>工号/学号${(user.sn)!''}</p>
                                    <div class="btn-group margin-bottom-2x" role="group">
                                        <a href="#" class="btn btn-default"><i class="fa fa-user"></i> Profile</a>
                                        <a href="logout" class="btn btn-default"><i class="fa fa-sign-out"></i>
                                            Logout</a>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="side-menu sidebar-inverse">
            <nav class="navbar navbar-default" role="navigation">
                <div class="side-menu-container">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#">
                            <div class="icon fa fa-paper-plane"></div>
                            <div class="title">教学管理系统</div>
                        </a>
                        <button type="button" class="navbar-expand-toggle pull-right visible-xs">
                            <i class="fa fa-times icon"></i>
                        </button>
                    </div>
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="index.html" target="innercontent">
                                <span class="icon fa fa-tachometer"></span><span class="title">首页</span>
                            </a>
                        </li>

                        <li class="panel panel-default dropdown">
                            <a data-toggle="collapse" href="#dropdown-college">
                                <span class="icon fa fa-file-text-o"></span><span class="title">学院/学期</span>
                            </a>
                            <!-- Dropdown level 1 -->
                            <div id="dropdown-college" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul class="nav navbar-nav">
                                        <li><a href="/manager/collagePage" target="innercontent">学院维护</a></li>
                                        <li><a href="/manager/termPage" target="innercontent">学期维护</a></li>
                                        <li><a href="/manager/collagetermPage" target="innercontent">学院学期管理</a></li>
                                    </ul>
                                </div>
                            </div>
                        </li>

                        <li class="panel panel-default dropdown">
                            <a data-toggle="collapse" href="#dropdown-course">
                                <span class="icon fa fa-table"></span><span class="title">课程</span>
                            </a>
                            <!-- Dropdown level 1 -->
                            <div id="dropdown-course" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul class="nav navbar-nav">
                                        <li><a href="https://www.baidu.com" target="innercontent">百度</a>
                                        </li>
                                        <li><a href="https://www.bing.com" target="innercontent">bing</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                        <li class="panel panel-default dropdown">
                            <a data-toggle="collapse" href="#dropdown-class">
                                <span class="icon fa fa-file-text-o"></span><span class="title">班级</span>
                            </a>
                            <!-- Dropdown level 1 -->
                            <div id="dropdown-class" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul class="nav navbar-nav">
                                        <li><a href="form/ui-kits.html">Form UI Kits</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                        <li class="panel panel-default dropdown">
                            <a data-toggle="collapse" href="#dropdown-homework">
                                <span class="icon fa fa-file-text-o"></span><span class="title">作业</span>
                            </a>
                            <!-- Dropdown level 1 -->
                            <div id="dropdown-homework" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul class="nav navbar-nav">
                                        <li><a href="form/ui-kits.html">Form UI Kits</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                        <li class="panel panel-default dropdown">
                            <a data-toggle="collapse" href="#dropdown-statistics">
                                <span class="icon fa fa-file-text-o"></span><span class="title">统计</span>
                            </a>
                            <!-- Dropdown level 1 -->
                            <div id="dropdown-statistics" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul class="nav navbar-nav">
                                        <li><a href="form/ui-kits.html">Form UI Kits</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                        <li class="panel panel-default dropdown">
                            <a data-toggle="collapse" href="#dropdown-safity">
                                <span class="icon fa fa-file-text-o"></span><span class="title">安全</span>
                            </a>
                            <!-- Dropdown level 1 -->
                            <div id="dropdown-safity" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <ul class="nav navbar-nav">
                                        <li><a href="form/ui-kits.html">Form UI Kits</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                        <li>
                            <a href="license.html">
                                <span class="icon fa fa-thumbs-o-up"></span><span class="title">社区</span>
                            </a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </nav>
        </div>
        <!-- Main Content -->
        <div class="container-fluid">
            <div class="side-body padding-top">
                <iframe src="about:blank" id="innercontent" frameborder="0" scrolling="no" marginheight="0"
                        height="200px" width="100%" name="innercontent" onload="iframeLoad(true)"></iframe>
            </div>
        </div>
    </div>
    <footer class="app-footer">
        <div class="wrapper">
            <span class="pull-right">2.1 <a href="#"><i class="fa fa-long-arrow-up"></i></a></span> © 2015 Copyright.
            More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a
                href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
        </div>
    </footer>


    <div class="modal fade" id="modalDefault" tabindex="-1" style="display: none;"></div>
</body>

</html>
