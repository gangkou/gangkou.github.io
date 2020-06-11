package xiaomifan.maven.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xiaomifan.maven.mapper.UserMapper;
import xiaomifan.maven.pojo.User;

/**
 * @author 小米饭
 * @date 2020/6/4
 * @descrition：xiaomifan.maven.test.maven
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class test {

    @Autowired
    public UserMapper userMapper;

    @Test
    public void insertuserTest(){
//        User user=new User();
//        user.setUserid("1234");
//        user.setMoney("100");
//        user.setUsername("张三");
//        this.userMapper.insertUser(user);
//        this.userMapper.deleteUser("2");
        System.out.println(this.userMapper.selectbyusername("莫言"));
    }

}
