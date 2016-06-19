package test.scutcms.DAO.access;

import com.scutcms.DAO.access.UserMapper;
import com.scutcms.DAO.entity.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/6/18 0018.
 */
public class UserMapperTest {
    @Test
    public void getUserByUsername() throws Exception {
        User user=userMapper.getUserByUsername("14324");
        if(user!=null)
            assertEquals("add",user.getSalt());
    }

    @Test
    public void deleteUser() throws Exception {
        userMapper.deleteUser("213");
    }

    private UserMapper userMapper;
    @Before
    public void setUp() throws Exception {
        userMapper=new UserMapper();
    }

    @Test
    public void updateUser() throws Exception {
        User user=new User();
        user.setUsername("xiaofang");
        user.setPassword_md5("2222");
        user.setSalt("122");
        user.setReal_name("222");
        user.setTelephone("222");
        user.setToken("22");
        userMapper.updateUser(user);
    }

}