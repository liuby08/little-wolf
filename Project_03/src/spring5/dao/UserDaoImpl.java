package spring5.dao;

import org.springframework.stereotype.Service;

/**
 * @Author liuwei
 * @CreateDate 2022-04-12 16:16
 */
@Service(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("dao1 add.......");
    }
}
