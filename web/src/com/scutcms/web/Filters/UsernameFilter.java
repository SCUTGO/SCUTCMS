package scutcms.web.Filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by loong on 16-6-19.
 */

/**
 * Decription:此过滤器用来过滤长度不合要求的用户名
 * @see javax.servlet.Filter
 */
@WebFilter(filterName = "UsernameFilter",urlPatterns = "/login")
public class UsernameFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String username=req.getParameter("username");
        if(username.length()<4&&username.length()>18){
            //
            return;
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
