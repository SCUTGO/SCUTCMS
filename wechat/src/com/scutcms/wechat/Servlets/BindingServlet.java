package scutcms.wechat.Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by loong on 16-6-19.
 */

/**
 *  Decription:将职工账号与微信绑定
 *  @see javax.servlet.http.HttpServlet
 *
 */
@WebServlet(name = "BindingServlet",urlPatterns = "/binding")
public class BindingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
