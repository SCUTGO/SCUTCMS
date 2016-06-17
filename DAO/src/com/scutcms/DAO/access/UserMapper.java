package com.scutcms.DAO.access;

import com.scutcms.DAO.entity.User;
import com.scutcms.DAO.session.SessionFac;
import org.hibernate.Transaction;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class UserMapper {

    public void insertUser(User user){
        Transaction tx=SessionFac.INSTANCE.getSession().beginTransaction();
        SessionFac.INSTANCE.getSession().save(user);
        tx.commit();
    }
}
