package xiaomifan.maven.mapper;



import xiaomifan.maven.pojo.User;

import java.util.List;

/**
 * @author 小米饭
 * @date 2020/5/18
 * @descrition：xiaomifan.manger.mapper
 **/

public interface UserMapper {
    void insertUser(User user);
    List<User> selectUserAll();
    void deleteUser(String userid);
    User selectbyusername(String username);
}
