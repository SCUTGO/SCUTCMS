package scutcms.web.Filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by loong on 16-6-19.
 */

/**
 * Decription:此过滤器用来过滤长度不合要求的密码
 * @see javax.servlet.Filter
 */
@WebFilter(filterName = "PasswordFilter",urlPatterns = "/login")
public class PasswordFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String password=req.getParameter("password");
        if(password.length()<8&&password.length()>18){
            //
            return;
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
    }

}
