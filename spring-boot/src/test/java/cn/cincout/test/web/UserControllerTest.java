package cn.cincout.test.web;

import cn.cincout.test.service.User;
import cn.cincout.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;

/**
 * Created by zhaoyu on 20-7-26.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void getUserById() throws Exception {
        User user = new User();
        user.setId(1);
        user.setName("yunqing");
        //Mock一个结果，当userService调用getById的时候，返回user
        doReturn(user).when(userService).getById(anyInt());


        //perform,执行一个RequestBuilders请求，会自动执行SpringMVC的流程并映射到相应的控制器执行处理
        mockMvc.perform(MockMvcRequestBuilders
                //构造一个get请求
                .get("/user/1")
                //请求类型 json
                .contentType(MediaType.APPLICATION_JSON))
                // 期望的结果状态 200
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}