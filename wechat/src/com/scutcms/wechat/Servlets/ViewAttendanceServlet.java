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
 * Decription:查看考勤信息
 * @see javax.servlet.http.HttpServlet
 */
@WebServlet(name = "ViewAttendanceServlet",urlPatterns = "/viewAttendance")
public class ViewAttendanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
