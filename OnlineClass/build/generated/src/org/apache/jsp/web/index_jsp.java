package org.apache.jsp.web;

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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("  <body text=\"white\"  class =\"watermark\" style=\"background: url('file:///C:/Users/USER/Documents/NetBeansProjects/ProjectOnlineclassRoom/Exasol.jpg')\">\n");
      out.write("    <center>\n");
      out.write("        <form method=\"get\" action=\"continue.jsp\">\n");
      out.write("            <h1>    Welcome  </h1>\n");
      out.write("            <marquee><h2>Online ClassRoom </h2></marquee>\n");
      out.write("            <h2 align=\"center\">PROJECT BY \n");
      out.write("                <br><br>\n");
      out.write("                Khandaker Rowiam SOWAD - 18511074\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                SHAHADAT HOSSAIN SHAWON -18511090\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                MD. ABIR HASAN MUNNA    -18511091\n");
      out.write("               <br>\n");
      out.write("                <br>\n");
      out.write("                IMAMUL HUDA             -18511107\n");
      out.write("            </h2>\n");
      out.write("           <input type=\"submit\" value=\"CONTINUE\" style=\"font-size:20pt;color:white;background-color:green;border:2px solid #336600;padding:3px\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
