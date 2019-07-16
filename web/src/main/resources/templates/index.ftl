<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>layout 后台大布局 - Layui</title>
    <link rel="stylesheet" href="/static/frame/layui-v2.4.5/layui/css/layui.css"  media="all">
    <#include "/templates/common/header.ftl" >

</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">layui 后台布局</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="javascript:;">控制台</a></li>
            <li class="layui-nav-item"><a href="">商品管理</a></li>
            <li class="layui-nav-item"><a href="">用户</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    贤心
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="leftNav">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">所有商品</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" data-url="/function/functionIndex" data-id='1' data-text="后台菜单">菜单管理</a></dd>
                        <dd><a href="javascript:;">列表二</a></dd>
                        <dd><a href="javascript:;">列表三</a></dd>
                        <dd><a href="">超链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">解决方案</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">列表一</a></dd>
                        <dd><a href="javascript:;">列表二</a></dd>
                        <dd><a href="">超链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">云市场</a></li>
                <li class="layui-nav-item"><a href="">发布商品</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body" >
        <!-- 内容主体区域 -->
        <iframe src="/main" class="main-body" frameborder="0" height="100%" width="100%"></iframe>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<#--注意 这个js的引用必须放在这里，否则桌面效果会么有-->
<script src="/static/frame/layui-v2.4.5/layui/layui.all.js"></script>
<#--注意 通过footer 在这里引入，会有问题-->
<#--<#include "/templates/common/footer.ftl" >-->
<script src="/static/js/common/rsaEncode.js"></script>

<script>
    /**
     *测试 rsa
     */
        // 加密 【加密字段长度不大于117】
    var publicKey_pkcs1 = 'MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDNIgtnBchoGkM5EziB0trxZRkPPCfgoEeTTer5GjWD3klsrdsGsGIdf6SvEzaMTeL7jzPVWR5xzQt8cHMx8zb861H2VyqjPyBD7vq1TM9x52TvLGKa9b2j9r/PkqakHuYMj1CqoMUQBtzVrPDuUA8551aPjb8eQucCRMg1U39WxQIDAQAB';


    var encrypt_rsa = new RSAKey();
    encrypt_rsa = KEYUTIL.getKey(publicKey_pkcs1);
    console.log('加密RSA:')
    console.log(encrypt_rsa)
    var encStr = encrypt_rsa.encrypt('123456')
    encStr = hex2b64(encStr);
    console.log("加密结果：" + encStr)

</script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });

    layui.use(['form', 'layedit', 'laydate','element','jquery'], function() {
        var form = layui.form,
            layer = layui.layer,
            element=layui.element,
            $=layui.jquery;


        element.on('nav(leftNav)', function(elem) {

            var id = elem.attr('data-id');
            var url = elem.attr('data-url');
            var text = elem.attr('data-text');

            // console.log(text);
            $(".main-body").attr("src",url);
            OA_LOG("id = " + id +"\nurl = " + url+"\ntext = " + text);
        });

    });

</script>
</body>
</html>