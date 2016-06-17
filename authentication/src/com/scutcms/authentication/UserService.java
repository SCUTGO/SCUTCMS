package scutcms.authentication;

/**
 * Created by anjouker on 16-6-17.
 */
public class UserService {
    UserService(){

    }

    public LoginResult login(String username, String password){
        return  LoginResult.SUCCESS;
    }

    public void logoff(String username){

    }
}
