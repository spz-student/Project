/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-04 01:50:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.bank;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;
import java.util.*;

public final class chongzhi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/pages/common/head.jsp", Long.valueOf(1522301372000L));
    _jspx_dependants.put("/WEB-INF/pages/common/foot.jsp", Long.valueOf(1522391298000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<base href=\"");
      out.print(request.getContextPath());
      out.write("/\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t\tCharisma v1.0.0\r\n");
      out.write("\r\n");
      out.write("\t\tCopyright 2012 Muhammad Usman\r\n");
      out.write("\t\tLicensed under the Apache License v2.0\r\n");
      out.write("\t\thttp://www.apache.org/licenses/LICENSE-2.0\r\n");
      out.write("\r\n");
      out.write("\t\thttp://usman.it\r\n");
      out.write("\t\thttp://twitter.com/halalit_usman\r\n");
      out.write("\t-->\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<title>SL会员商城</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<meta name=\"description\" content=\"Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.\">\r\n");
      out.write("\t<meta name=\"author\" content=\"Muhammad Usman\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- The styles -->\r\n");
      out.write("\t<link href=\"statics/css/bootstrap-cerulean.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t  body {\r\n");
      out.write("\t\tpadding-bottom: 40px;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  .sidebar-nav {\r\n");
      out.write("\t\tpadding: 9px 0;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  .navbar .nav li a{\r\n");
      out.write("\t    border:0px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.custom-setting{}\r\n");
      out.write("\t.clear{clear: both;}\r\n");
      out.write("\tdiv .modal-body label {\r\n");
      out.write("\t\tcolor:black;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<link href=\"statics/css/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"statics/css/charisma-app.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"statics/css/jquery-ui-1.8.21.custom.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href='statics/css/fullcalendar.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/css/fullcalendar.print.css' rel='stylesheet'  media='print'>\r\n");
      out.write("\t<link href='statics/css/chosen.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/css/uniform.default.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/css/colorbox.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/css/jquery.cleditor.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/css/jquery.noty.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/css/noty_theme_default.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/css/elfinder.min.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/css/elfinder.theme.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/css/jquery.iphone.toggle.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/css/opa-icons.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/css/uploadify.css' rel='stylesheet'>\r\n");
      out.write("\t<!-- 华丽丽滴分割线 北大青鸟 start 2014-->\r\n");
      out.write("\t<!-- add by bdqn_hl 2014-2-28 start-->\r\n");
      out.write("\t<link href='statics/localcss/userlist.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/localcss/rolelist.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/localcss/authoritymanage.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/localcss/dicmanage.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/localcss/affiche.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/localcss/information.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/localcss/addgoodspack.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/localcss/mymessage.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='statics/localcss/messagelist.css' rel='stylesheet'>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<!-- add by bdqn_hl 2014-2-28 end-->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 华丽丽滴分割线 北大青鸟 end 2014 -->\r\n");
      out.write("\t<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\t  <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t<!-- The fav icon -->\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"statics/img/favicon.ico\">\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tvar tt = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mList}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<!-- topbar starts -->\r\n");
      out.write("\t<div class=\"navbar\">\r\n");
      out.write("\t\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".top-nav.nav-collapse,.sidebar-nav.nav-collapse\">\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<a class=\"brand\" href=\"admin/main\"> <img alt=\"Charisma Logo\" src=\"statics/img/logo20.png\" /> <span>SL会员商城</span></a>\r\n");
      out.write("\t\t\t\t<div class=\"btn-group pull-right\" >\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">你好，");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${User.loginname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">角色：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${User.roleName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"admin/main\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"user/shopingCard\">购物车</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"admin/logon\">注销</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal hide fade\" id=\"myModal\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">×</button>\r\n");
      out.write("\t\t\t\t\t\t<h3>修改密码</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>请输入原密码：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input id=\"oldpassword\"  type=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <span style=\"color:red;font-weight: bold;\">*</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>请输入新密码：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input id=\"newpassword\"  type=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <span style=\"color:red;font-weight: bold;\">*新密码必须6位以上</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>再次输入新密码：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input id=\"aginpassword\"  type=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <span style=\"color:red;font-weight: bold;\">*</span>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p id=\"modifypwdtip\">\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"btn\" data-dismiss=\"modal\">取消</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" id=\"modifySavePassword\" class=\"btn btn-primary\">修改</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- topbar ends -->\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<!-- left menu starts -->\r\n");
      out.write("\t\t\t<div class=\"span2 main-menu-span\">\r\n");
      out.write("\t\t\t\t<div class=\"well nav-collapse sidebar-nav\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-tabs nav-stacked main-menu\" id=\"menus\"></ul>\r\n");
      out.write("\t\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t\t<label id=\"for-is-ajax\" class=\"hidden-tablet\" for=\"is-ajax\"><input id=\"is-ajax\" type=\"checkbox\"> Ajax on menu</label>\r\n");
      out.write("\t\t\t\t \t-->\r\n");
      out.write("\t\t\t\t</div><!--/.well -->\r\n");
      out.write("\t\t\t</div><!--/span-->\r\n");
      out.write("\t\t\t<!-- left menu ends -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<noscript>\r\n");
      out.write("\t\t\t\t<div class=\"alert alert-block span10\">\r\n");
      out.write("\t\t\t\t\t<h4 class=\"alert-heading\">Warning!</h4>\r\n");
      out.write("\t\t\t\t\t<p>You need to have <a href=\"http://en.wikipedia.org/wiki/JavaScript\" target=\"_blank\">JavaScript</a> enabled to use this site.</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</noscript>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"content\" class=\"span10\">\r\n");
      out.write("\t\t\t<!-- content starts -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"box span12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"box-header well\">\r\n");
      out.write("\t\t\t\t\t\t<h2><i class=\"icon-info-sign\"></i>汇款充值</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"box-content\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\"  method=\"post\" action=\"accountsAction_update.action\" id=\"form1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"\" class=\"col-md-2 control-label\">汇款金额：</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-4 \">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"money\" type=\"text\" class=\"form-control\" onkeyup=\"if(this.value==this.value2)return;if(this.value.search(/^\\d*(?:\\.\\d{0,2})?$/)==-1)this.value=(this.value2)?this.value2:'';else this.value2=this.value;\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"msg12\"  style=\"color: red;\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"\" class=\"col-md-2 control-label\">二级密码：</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-4 \">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"mima\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${User.loginpwd2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"loginpwd2\" type=\"password\" class=\"form-control\" />\t<span class=\"msg12\" style=\"color: red;\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"mtype\" value=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t<!-- \t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"\" class=\"col-md-2 control-label\">备注：</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea class=\"form-control\" rows=\"10\" cols=\"30\" id=\"digest\" name=\"remark\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- data-toggle='modal' data-target='#myModal' -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-10 col-md-offset-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" class=\"btn btn-success\" name=\"sub\" value=\"充值\"/>\r\n");
      out.write("\t\t\t\t\t\t\t <input type=\"reset\" class=\"btn btn-primary\" value=\"重置\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t<!--此处的提交只是显示模态框的-->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<!-- Modal -->\r\n");
      out.write("\t\t\t\t\t<div class=\"modal fade\" id=\"CZsucc\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t\t  <div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t      <div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("\t\t\t\t\t        <h4 class=\"modal-title\" id=\"myModalLabel\">友情提示</h4>\r\n");
      out.write("\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t      <div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <h3>充值成功！！！</h3> \r\n");
      out.write("\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t      <div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- content ends -->\r\n");
      out.write("\t\t\t</div><!--/#content.span10-->\r\n");
      out.write("\t\t\t\t</div><!--/fluid-row-->\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p class=\"pull-right\">Powered by: <a href=\"#\">ACCP 34</a></p>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</head>\r\n");
      out.write("\t<!--/.fluid-container-->\r\n");
      out.write("<!-- external javascript\r\n");
      out.write("\t================================================== -->\r\n");
      out.write("\t<!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- jQuery -->\r\n");
      out.write("\t<script src=\"statics/js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("\t<!-- jQuery UI -->\r\n");
      out.write("\t<script src=\"statics/js/jquery-ui-1.8.21.custom.min.js\"></script>\r\n");
      out.write("\t<!-- transition / effect library -->\r\n");
      out.write("\t<script src=\"statics/js/bootstrap-transition.js\"></script>\r\n");
      out.write("\t<!-- alert enhancer library -->\r\n");
      out.write("\t<script src=\"statics/js/bootstrap-alert.js\"></script>\r\n");
      out.write("\t<!-- modal / dialog library -->\r\n");
      out.write("\t<script src=\"statics/js/bootstrap-modal.js\"></script>\r\n");
      out.write("\t<!-- custom dropdown library -->\r\n");
      out.write("\t<script src=\"statics/js/bootstrap-dropdown.js\"></script>\r\n");
      out.write("\t<!-- scrolspy library -->\r\n");
      out.write("\t<script src=\"statics/js/bootstrap-scrollspy.js\"></script>\r\n");
      out.write("\t<!-- library for creating tabs -->\r\n");
      out.write("\t<script src=\"statics/js/bootstrap-tab.js\"></script>\r\n");
      out.write("\t<!-- library for advanced tooltip -->\r\n");
      out.write("\t<script src=\"statics/js/bootstrap-tooltip.js\"></script>\r\n");
      out.write("\t<!-- popover effect library -->\r\n");
      out.write("\t<script src=\"statics/js/bootstrap-popover.js\"></script>\r\n");
      out.write("\t<!-- button enhancer library -->\r\n");
      out.write("\t<script src=\"statics/js/bootstrap-button.js\"></script>\r\n");
      out.write("\t<!-- accordion library (optional, not used in demo) -->\r\n");
      out.write("\t<script src=\"statics/js/bootstrap-collapse.js\"></script>\r\n");
      out.write("\t<!-- carousel slideshow library (optional, not used in demo) -->\r\n");
      out.write("\t<script src=\"statics/js/bootstrap-carousel.js\"></script>\r\n");
      out.write("\t<!-- autocomplete library -->\r\n");
      out.write("\t<script src=\"statics/js/bootstrap-typeahead.js\"></script>\r\n");
      out.write("\t<!-- tour library -->\r\n");
      out.write("\t<script src=\"statics/js/bootstrap-tour.js\"></script>\r\n");
      out.write("\t<!-- library for cookie management -->\r\n");
      out.write("\t<script src=\"statics/js/jquery.cookie.js\"></script>\r\n");
      out.write("\t<!-- calander plugin -->\r\n");
      out.write("\t<script src='statics/js/fullcalendar.min.js'></script>\r\n");
      out.write("\t<!-- data table plugin -->\r\n");
      out.write("\t<script src='statics/js/jquery.dataTables.min.js'></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- chart libraries start -->\r\n");
      out.write("\t<script src=\"statics/js/excanvas.js\"></script>\r\n");
      out.write("\t<script src=\"statics/js/jquery.flot.min.js\"></script>\r\n");
      out.write("\t<script src=\"statics/js/jquery.flot.pie.min.js\"></script>\r\n");
      out.write("\t<script src=\"statics/js/jquery.flot.stack.js\"></script>\r\n");
      out.write("\t<script src=\"statics/js/jquery.flot.resize.min.js\"></script>\r\n");
      out.write("\t<!-- chart libraries end -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- select or dropdown enhancer -->\r\n");
      out.write("\t<script src=\"statics/js/jquery.chosen.min.js\"></script>\r\n");
      out.write("\t<!-- checkbox, radio, and file input styler -->\r\n");
      out.write("\t<script src=\"statics/js/jquery.uniform.min.js\"></script>\r\n");
      out.write("\t<!-- plugin for gallery image view -->\r\n");
      out.write("\t<script src=\"statics/js/jquery.colorbox.min.js\"></script>\r\n");
      out.write("\t<!-- rich text editor library -->\r\n");
      out.write("\t<script src=\"statics/js/jquery.cleditor.min.js\"></script>\r\n");
      out.write("\t<!-- notification plugin -->\r\n");
      out.write("\t<script src=\"statics/js/jquery.noty.js\"></script>\r\n");
      out.write("\t<!-- file manager library -->\r\n");
      out.write("\t<script src=\"statics/js/jquery.elfinder.min.js\"></script>\r\n");
      out.write("\t<!-- star rating plugin -->\r\n");
      out.write("\t<script src=\"statics/js/jquery.raty.min.js\"></script>\r\n");
      out.write("\t<!-- for iOS style toggle switch -->\r\n");
      out.write("\t<script src=\"statics/js/jquery.iphone.toggle.js\"></script>\r\n");
      out.write("\t<!-- autogrowing textarea plugin -->\r\n");
      out.write("\t<script src=\"statics/js/jquery.autogrow-textarea.js\"></script>\r\n");
      out.write("\t<!-- multiple file upload plugin -->\r\n");
      out.write("\t<script src=\"statics/js/jquery.uploadify-3.1.min.js\"></script>\r\n");
      out.write("\t<!-- history.js for cross-browser state change on ajax -->\r\n");
      out.write("\t<script src=\"statics/js/jquery.history.js\"></script>\r\n");
      out.write("\t<!-- application script for Charisma demo -->\r\n");
      out.write("\t<script src=\"statics/js/charisma.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t<script src=\"statics/js/json2.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 华丽丽滴分割线 北大青鸟 start 2014-->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- add by bdqn_hl 2013-2-27 start multiple file ajaxfileupload plugin-->\r\n");
      out.write("\t<script src=\"statics/js/ajaxfileupload.js\"></script>\r\n");
      out.write("\t<!-- add by bdqn_hl 2013-2-27 end-->\r\n");
      out.write("\t<!-- add by bdqn_hl 2013-3-17 start WdatePicker plugin-->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"statics/medire/WdatePicker.js\"></script>\r\n");
      out.write("\t<!-- add by bdqn_hl 2013-3-17 end-->\r\n");
      out.write("\t\r\n");
      out.write("\t</html>");
      out.write("\r\n");
      out.write("\t<script src=\"statics/localjs/chongzhi.js\"></script>\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}