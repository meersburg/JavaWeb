import javax.servlet.*;
import java.io.IOException;

public class HelloServlet implements Servlet {
    public void init(ServletConfig config) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void destroy() {

    }

    public String getServletInfo() {
        return null;
    }

    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        System.out.println("hello servlet!");
    }
}
