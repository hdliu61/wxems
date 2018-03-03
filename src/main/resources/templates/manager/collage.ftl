<html>
<head>
    <title>教学管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <#include "/taglib.ftl">
</head>
<body class="flat-blue">
<div class="app-container">
    <div class="row content-container">
        <div class="container-fluid">
            <div class="inner-container">
                <div class="page-title">
                    <span class="title">管理学院</span>
                </div>
                <div class="row myrow">
                    <div class="col-xs-12">
                        <div class="card">
                            <div class="card-header">
                                <div class="card-title">
                                    <div class="title">
                                        所有学院
                                        <button type="button" class="btn btn-default" data-toggle="modal" onclick="showmodal();">新增</button>
                                    </div>
                                </div>
                            </div>
                            <div class="card-body">
                                <table class="table table-bordered table-striped table-hover table-condensed">
                                    <thead>
                                    <tr>
                                        <th>编号</th>
                                        <th>学院</th>
                                        <th>描述</th>
                                        <th>院长</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>

                                    <#list colleges as college>
                                        <tr>
                                            <th scope="row">${(college.id)!''}</th>
                                            <td>${(college.name)!''}</td>
                                            <td>${(college.description)!''}</td>
                                            <td>${(college.dean)!''}</td>
                                            <td><a  class="btn btn-xs btn-default" onclick="showmodal(${(college.id)!''});">查看/修改</a>
                                                <a class="btn btn-xs btn-danger" onclick="deleteCollage(${(college.id)!''});">删除</a></td>
                                        </tr>
                                    </#list>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div id="modal1" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                    <h4 class="modal-title" id="myModalLabel">新增学院</h4>
                </div>
                <div class="modal-body">
                    <div class="card-body">
                        <form class="form-horizontal" id="addcollageform">
                            <div class="form-group">
                                <label for="name" class="col-sm-2 control-label">学院名</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="name" name="name" placeholder="XX学院">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="description" class="col-sm-2 control-label">描述</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="description" name="description" placeholder="一句话描述">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="dean" class="col-sm-2 control-label">院长</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="dean" name="dean" placeholder="院长工号/姓名">
                                </div>
                            </div>
                            <input type="hidden" name="id" id="collageid">
                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <script>
                        function testmethod() {
                            $.ajax({url:"/manager/collageAddUpdate",type:"POST",data: $("#addcollageform").serialize(), dataType: "text",success:function (retmsg) {
                                    if(retmsg=="1"){
                                        alert("ok");
                                        $('#modalDefault').modal('hide');
                                        document.getElementById('innercontent').contentWindow.location.reload(true);
                                    }
                                }})
                        }
                        function modalInit() {
                            if($("#collageid").val()!=""){
                                $.ajax({url:"/manager/selectCollage",type:"POST",data: {id:$("#collageid").val()}, dataType: "json", async:false,success:function (retmsg) {
                                        $("#name").val(retmsg.name);
                                        $("#description").val(retmsg.description);
                                        $("#dean").val(retmsg.dean);
                                    }})
                            }
                        }
                    </script>
                    <button type="button" class="btn btn-warning" data-dismiss="modal">放弃</button>
                    <button type="button" class="btn btn-primary" onclick="testmethod();">保存</button>
                </div>
            </div>
        </div>
    </div>
    <script>
        function showmodal(id){
            if(arguments.length>0 && id){
                $("#collageid").val(id);
                $("#myModalLabel").html("修改学院");

            }else{
                $("#collageid").val("");
                $("#myModalLabel").html("新增学院");
            }
            window.parent.topTest($('#modal1').html());
        }

        function deleteCollage(id){
            if(confirm("确定要删除编号为["+id+"]的学院吗？")){
                $.ajax({url:"/manager/deleteCollage",type:"POST",data: {id:id}, dataType: "text", async:false,success:function (retmsg) {
                        if(retmsg==undefined || retmsg=="0"){
                            alert("删除失败");
                        }else{
                            location.href=location.href;
                        }
                    }})
            }
        }
    </script>
</body>
</html>