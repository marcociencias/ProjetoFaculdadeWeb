package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PaginaLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Bootstrap Example</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <h2>Tela de Login</h2>\n");
      out.write("  <p>Informar usuario e senha para acessar , caso não tenha seu cadastro click no link para cadastrar-se</p>\n");
      out.write("  <form class=\"form-inline\" action=\"LoginServlet\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label class=\"sr-only\" for=\"email\">Email:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"email\" placeholder=\"Usuario\"  name=\"usuario\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label class=\"sr-only\" for=\"pwd\">Password:</label>\n");
      out.write("      <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Senha\" name=\"senha\">\n");
      out.write("    </div>\n");
      out.write("    <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("  </form>\n");
      out.write("  <br>\n");
      out.write("    <div>\n");
      out.write("    <a class=\"nav-link\" href=\"CadastroCliente.jsp\">Ainda não tem um cadastro<span class=\"sr-only\"></span></a></center>               \n");
      out.write("    </div>\n");
      out.write("  <br>\n");
      out.write("    <div>\n");
      out.write("    <a class=\"nav-link\" href=\"CadastroClienteAlterar.jsp\">Alterar Cadastro<span class=\"sr-only\"></span></a></center>               \n");
      out.write("    </div>\n");
      out.write("  <br>\n");
      out.write("      <div>\n");
      out.write("    <a class=\"nav-link\" href=\"index.jsp\">Voltar<span class=\"sr-only\"></span></a></center>               \n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
