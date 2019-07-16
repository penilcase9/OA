<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>菜单管理</title>
    <#include "/templates/common/header.ftl" >

</head>
<body>

<h1>菜单列表</h1>
<table id="functionTable" lay-filter="functionList"></table>


<button class="layui-btn" lay-filter="newFunBtn">新增菜单</button>


<#include "/templates/common/footer.ftl" >
<script>

    layui.use(['form', 'layedit', 'laydate','element','jquery','table'], function(){
        var form = layui.form,
            table = layui.table,
            layer = layui.layer,
            element=layui.element,
            $=layui.jquery;
        

        //第一个实例
        table.render({
            elem: '#functionTable'
            ,height: 312
            ,url: '/function/functionList' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'functionid', title: 'ID', width:80, sort: true, fixed: 'left'}
                ,{field: 'funname', title: '菜单名称', width:80}
                ,{field: 'funtype', title: '菜单类型', width: 177}
                ,{field: 'effectdate', title: '生效日期', width: 180, sort: true}
                ,{field: 'expiredate', title: '失效日志', width: 180, sort: true}
                ,{field: 'state', title: '状态', width: 80}
            ]]
        });
        
        $(".layui-btn").on('click',function (elem) {
            // var id = elem.attr('data-id');
            // var url = elem.attr('data-url');
            // var text = elem.attr('data-text');
            OA_LOG("点击按钮");
            var that = this;
            //多窗口模式，层叠置顶
            layer.open({
                type: 2 //此处以iframe举例
                ,title: '当你选择该窗体时，即会在最顶端'
                ,area: ['800px', '600px']
                ,shade: 0
                ,maxmin: true
                ,offset: [ //为了演示，随机坐标
                    // Math.random()*($(window).height()-300)
                    // ,Math.random()*($(window).width()-390)
                    0
                    ,0
                ]
                ,content: '/function/functionEditPage'
                ,zIndex: layer.zIndex //重点1
                ,success: function(layero){
                    layer.setTop(layero); //重点2
                }
            });


        });

    });
</script>

</body>
</html>