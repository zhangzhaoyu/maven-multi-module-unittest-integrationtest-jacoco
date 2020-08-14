package cn.cincout.test.service;

import java.util.List;

/**
 * Created by zhaoyu on 20-7-26.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public interface UserService {
    /**
     * 查找
     * @param id
     * @return
     */
    User getById(int id);

    void save(User user);

    List<User> selectAll();
}
