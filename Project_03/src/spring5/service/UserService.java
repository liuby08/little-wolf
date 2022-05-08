package spring5.service;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spring5.dao.UserDao;

import javax.annotation.Resource;

/**
 * @Author liuwei
 * @CreateDate 2022-04-11 18:56
 */
//在注解里面value可以省略不写，默认为类名称，首字母小写
@Service
public class UserService {

    @Value(value = "abc")
    private String name;

    //@Autowired
    //@Qualifier(value = "userDaoImpl1")
//    @Resource     //根据类型注入
    @Resource(name = "userDaoImpl2")    //根据名称注入
    private UserDao userDao;

    public void add() {
        System.out.println(name);
        System.out.println("UserService add.......");
        userDao.add();
    }

}
