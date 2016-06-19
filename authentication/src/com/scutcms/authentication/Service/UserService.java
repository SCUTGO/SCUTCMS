package scutcms.authentication.Service;

import com.scutcms.DAO.entity.User;
import scutcms.authentication.Enum.LoginResult;

import java.util.ArrayList;

/**
 * Created by anjouker on 16-6-17.
 */
public class UserService {
    UserService(){

    }

    /**
     * 该类位于服务层，用于处理用户登录。
     * @param username 登录用户名
     * @param password 登录密码
     * @return 返回值为一个枚举类型，可能的结果有SUCCESS,USERNAME_NO_VALID,PASSWORD_NO_MATCH,OTHER，
     * 分别对应成功，用户名不存在，密码不正确，其他。
     */
    public LoginResult login(String username, String password){
        return  LoginResult.SUCCESS;
    }

    /**
     * 该类位于服务层，用于处理用户登出。用户登出之后讲销毁其token。
     * @param username 登录用户名
     */
    public void logoff(String username){

    }

    /**
     * 该类位于服务层，用于添加用户。
     * @param user 需要添加的用户对象
     */

    public void addUser(User user){

    }

    /**
     * 该类位于服务层，用于删除用户。
     * @param user 需要删除的用户对象
     */

    public void deleteUser(User user){

    }

    /**
     * 该类位于服务层，用于更新用户。
     * @param user 需要更新的用户对象
     */

    public void updateUser(User user){
    	
    }

    /**
     * 该类位于服务层，用于获取所有用户列表。
     * @return 返回值为一个包含所有用户的数组。
     */

    public ArrayList<User> getAllUser(){
        return null;
    }

    /**
     * 检查User对象中的字段数据是否合法
     * @param user User对象
     * @return 如果所有字段中的数据均合法则返回true，否则返回false
     */
    private boolean verifyUserData(User user){
        return true;
    }
}
