package scutcms.web.Servlets.auth;

import net.sf.json.JSONException;
import net.sf.json.util.JSONStringer;
import scutcms.authentication.Enum.*;
import scutcms.authentication.Service.*;

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
 *  Decription:登录<br>
 *      返回用户登录信息
 *  request<br>
 *  {<br>
 *      "username":value,<br>
 *      "password":value,<br>
 *  }<br><br>
 *
 *  response<br>
 *      {<br>
 *          "result":result<br>
 *      }<br>
 *  @see javax.servlet.http.HttpServlet
 */


@WebServlet(name = "LoginServlet")
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
        LoginResult result=userService.login(username,password);
        JSONStringer stringer=new JSONStringer();

        if(result==LoginResult.SUCCESS){
            tokenService.createTokenforUser(username);
        }
        try{
            stringer.array();
            stringer.object().key("result").value(request);
            stringer.endArray();
        }catch (JSONException e){
            e.printStackTrace();
        }
        response.getOutputStream().write(stringer.toString().getBytes("UTF-8"));
        response.setContentType("text/json;charset=UTF-8");
    }
}