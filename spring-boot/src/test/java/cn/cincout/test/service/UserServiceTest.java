package cn.cincout.test.service;

import cn.cincout.test.inf.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

/**
 * Created by zhaoyu on 2020/8/12.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    private UserMapper userMapper;
    @InjectMocks
    private UserServiceImpl userService;

    @Test
    void getById() {
        when(userMapper.selectById(anyInt())).thenReturn(new User());
        User user = userService.getById(1);
        Assertions.assertNotNull(user);
        verify(userMapper).selectById(1);
    }

    @Test
    void save() {
        User user = new User();
        doThrow(RuntimeException.class).when(userMapper).save(user);
        Assertions.assertThrows(RuntimeException.class, () -> userService.save(user));
    }

    @Test
    void selectAll() {
    }
}