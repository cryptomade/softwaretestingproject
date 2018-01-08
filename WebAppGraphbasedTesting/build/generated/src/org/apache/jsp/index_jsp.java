package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<p style=\"text-align:center;font-size:150%;font-weight:bold\">Graph Based Testing Algorithm 1 </p>\n");
      out.write("\n");
      out.write("<table id = \"tableForm\" border=\"1\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\"  bgcolor=\"#ffccff\">\n");
      out.write("<tr>\n");
      out.write("  <td width=\"33%\">\n");
      out.write("    <table border=\"0\">\n");
      out.write("      <tr align=\"center\">\n");
      out.write("        </tr>\n");
      out.write("\t <tr><td>\n");
      out.write("     \n");
      out.write("      </td></tr>\n");
      out.write("      <tr align = center>\n");
      out.write("        <td>\n");
      out.write("          <p> &nbsp;</p>\n");
      out.write("\n");
      out.write("      <form action = \"UploadFile\" method = \"post\"\n");
      out.write("         enctype = \"multipart/form-data\">\n");
      out.write("         <input type = \"file\" name = \"file\" size = \"100\" />\n");
      out.write("         <br />\n");
      out.write("         <input type = \"submit\" value = \"Upload File\" />\n");
      out.write("      </form>\n");
      out.write("<p style=\"text-align:left;font-weight:bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("       \n");
      out.write("\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("  </td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<table width=\"100%\">\n");
      out.write("<tr><td></tr> <tr><td></tr>\n");
      out.write("<tr><td></tr> <tr><td></tr>\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<tr><td></tr> <tr><td></tr>\n");
      out.write("<tr>\n");
      out.write("  <td align=right width = \"15%\"><b>Test Paths:</b></td>\n");
      out.write(" <td width=\"85%\" colspan=\"3\"> Algorithm 1: Slower, more test paths, shorter test paths\t\n");
      out.write("  <form action = \"Download\" method = \"post\"\n");
      out.write("         enctype = \"multipart/form-data\">\n");
      out.write("  &nbsp;<input type=\"submit\" value=\"Prime Path Coverage\" name=\"action\">\n");
      out.write("                    </form>\n");
      out.write("   </td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("  <td align=right width = \"15%\"></td>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
