package spring5.dao;

import org.springframework.stereotype.Service;

/**
 * @Author liuwei
 * @CreateDate 2022-04-12 19:15
 */
@Service(value = "userDaoImpl2")
public class UserDaoImpl2 implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDaoImpl2 add....");
    }
}
