package com.scutcms.DAO.access;

import com.scutcms.DAO.entity.User;
import com.scutcms.DAO.session.SessionFac;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class UserMapper {

    /**
     * @param
     * @return
     */
    public void insertUser(User user){
        Session session=SessionFac.INSTANCE.getSession();
        Transaction transaction=session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }
    public void updateUser(User user){
        Session session=SessionFac.INSTANCE.getSession();
        Transaction transaction=session.beginTransaction();
        User olduser=(User)session.get(User.class,user.getUsername());
        olduser.setReal_name(user.getReal_name());
        olduser.setSalt(user.getSalt());
        olduser.setToken(user.getToken());
        olduser.setTelephone(user.getTelephone());
        olduser.setPassword_md5(user.getPassword_md5());
        session.update(olduser);
        transaction.commit();
        session.close();
    }
    public void deleteUser(String username){
        Session session=SessionFac.INSTANCE.getSession();
        Transaction transaction=session.beginTransaction();
        User olduser=(User)session.get(User.class,username);
        session.delete(olduser);
        transaction.commit();
        session.close();
    }
    public User getUserByUsername(String username){
        Session session=SessionFac.INSTANCE.getSession();
        User user=(User)session.get(User.class,username);
        session.close();
        return user;
    }
}
