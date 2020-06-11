package xiaomifan.maven.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiaomifan.maven.mapper.UserMapper;
import xiaomifan.maven.pojo.User;
import xiaomifan.maven.services.UserServices;

/**
 * @author 小米饭
 * @date 2020/6/8
 * @descrition：xiaomifan.maven.services.Impl
 **/
@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
          this.userMapper.insertUser(user);
    }
}
