package scutcms.authentication.Service;

/**
 * Created by anjouker on 16-6-17.
 */
public class TokenService {
    TokenService(){

    }

    /**
     * 为指定用户创建一个token
     * @param username 用户名
     * @return token值
     */
    public String createTokenforUser(String username){

    }

    /**
     * 检验指定用户的token是否正确
     * @param username 用户名
     * @param token token值
     * @return 如果参数token与用户匹配则返回true，否则返回false
     */
    public boolean isTokenValidforUser(String username, String token){

    }

    /**
     * 为指定设备创建一个token
     * @param deviceId 设备id
     * @return token值
     */
    public String createTokenforDevice(String deviceId){

    }

    /**
     * 检验指定设备的token是否正确
     * @param deviceId 设备id
     * @param token token值
     * @return 如果参数token与设备匹配则返回true，否则返回false
     */
    public boolean isTokenValidforDevice(String deviceId, String token){

    }

}
