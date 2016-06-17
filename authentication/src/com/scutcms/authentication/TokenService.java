package scutcms.authentication;

/**
 * Created by anjouker on 16-6-17.
 */
public class TokenService {
    TokenService(){

    }

    public TokenResult isTokenValid(String Token){
        return TokenResult.NO_VALID;
    }
}
