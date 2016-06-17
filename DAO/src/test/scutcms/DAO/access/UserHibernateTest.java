package test.scutcms.DAO.access;

import com.scutcms.DAO.access.UserMapper;
import com.scutcms.DAO.entity.User;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class UserHibernateTest extends TestCase{
    @Test
    public void testinsertUser() throws Exception {
        UserMapper test=new UserMapper();
        User user = new User();
        user.setUsername("xiaofang");
        user.setPassword_md5("dfjhdskjfhdsjfhadskjlfdsfh");
        user.setSalt("sdfdfasdgdasgfagdghdh");

        test.insertUser();
    }

}