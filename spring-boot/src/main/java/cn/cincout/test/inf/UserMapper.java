package cn.cincout.test.inf;

import cn.cincout.test.service.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by zhaoyu on 2020/8/12.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public interface UserMapper {
    void save(User user);
    List<User> selectAll();
    User selectById(int id);
}
