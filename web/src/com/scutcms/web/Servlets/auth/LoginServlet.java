package scutcms.web.Servlets.auth;

import org.json.JSONException;
import org.json.JSONStringer;
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
 *  Description:登录<br>
 *      返回用户登录信息
 *  request<br>
 *  {<br>
 *      "username":value,<br>
 *      "password":value,<br>
 *  }<br><br>
 *
 *  response<br>
 *      {<br>
 *          "result":result,<br>
 *          "token":token<br>
 *      }<br>
 *  result(int): 0(成功),1(用户名不存在),2(密码不存在),3(其他)<br>
 *
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
        LoginResult state=userService.login(username,password);
        JSONStringer stringer=new JSONStringer();
        int result=3;
        switch (state){
            case SUCCESS:
                result=0;
                break;
            case USERNAME_NO_VALID:
                result=1;
                break;
            case PASSWORD_NO_MATCH:
                result=2;
                break;
            case OTHER:
                result=3;
                break;
        }

        if(state==LoginResult.SUCCESS){
            String token=tokenService.createTokenforUser(username);
            stringer.key("token").value(token);
        }
        try{
            stringer.array();
            stringer.object().key("result").value(result);
            stringer.endArray();
        }catch (JSONException e){
            e.printStackTrace();
        }
        response.getOutputStream().write(stringer.toString().getBytes("UTF-8"));
        response.setContentType("text/json;charset=UTF-8");
    }
}