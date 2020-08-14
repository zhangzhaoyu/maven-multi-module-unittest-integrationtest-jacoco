package cn.cincout.test.service;

import cn.cincout.test.inf.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaoyu on 2020/8/12.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public User getById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
