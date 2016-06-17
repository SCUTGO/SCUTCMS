package scutcms.util;

import junit.framework.TestCase;

/**
 * Created by anjouker on 16-6-17.
 */
public class testTokenHelper extends TestCase {
    public void testcreateRandomToken(){
        assertTrue(TokenHelper.createRandomToken(32).length() == 32);
    }
}
