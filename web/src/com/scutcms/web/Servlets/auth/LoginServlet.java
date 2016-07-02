package scutcms.web.Servlets.auth;

import net.sf.json.JSONObject;
import scutcms.authentication.Enum.*;
import scutcms.authentication.Service.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Created by loong on 16-6-19.
 */

/**
 *  Decription:登录<br>
 *      1.用户名和密码正确时，进入主页("/主页.jsp")（或下一页面）<br>
 *          a.将用户信息写入tokenCookie,usernameCookie,passwordCookie,并返回cookie<br>
 *          b.返回json数据<br>
 *      2.用户名或密码错误时，返回登录页面("/login.jsp")<br><br>
 *
 *  request<br>
 *  {<br>
 *      "username":value,<br>
 *      "password":value,<br>
 *  }<br><br>
 *  @see javax.servlet.http.HttpServlet
 */


@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        TokenService tokenService=new TokenService();
        UserService userService=new UserService();

        String username=request.getParameter("username");
        String password=request.getParameter("password");
        LoginResult state=userService.login(username,password);

        if(state==LoginResult.USERNAME_NO_VALID){
            response.getWriter().println("用户不存在，请重新输入！");
            //用户名错误，重新跳转到登录页面
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
        else if(state==LoginResult.PASSWORD_NO_MATCH){
            response.getWriter().println("用户名和密码不匹配，请重新输入！");
            //密码错误，重新跳转到登录页面
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
        else if(state==LoginResult.SUCCESS) {
            /**
             * 创建token
             */
            String token = tokenService.createTokenforUser(username);

            /**
             * 创建cookie,写入token、用户名和密码<br>
             * 1.将token写入cookie
             */
            Cookie tokenCookie = new Cookie("token", URLEncoder.encode("utf-8",token));
            response.addCookie(tokenCookie);
            /**
             * 2.将用户名写入cookie
             */
            Cookie usernameCookie = new Cookie("username", URLEncoder.encode("utf-8",username));
            response.addCookie(usernameCookie);
            /**
             * 3.将密码写入cookie
             */
            Cookie passwordCookie = new Cookie("password", URLEncoder.encode("utf-8",password));
            response.addCookie(passwordCookie);

            response.sendRedirect("/主页.jsp");
        }
    }
}