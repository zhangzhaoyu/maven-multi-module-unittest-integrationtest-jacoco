package cn.cincout.test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

/**
 * Created by zhaoyu on 2020/8/12.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@SpringBootTest
class SendMsgServiceImplITTest {
    @SpyBean
    private SendMsgService sendMsgService;

    @Test
    void sendMsgSuccess() {
        Assertions.assertTrue(sendMsgService.sendMsg("hello world"));
        verify(sendMsgService).sendMsg("hello world");
    }

    @Test
    void sendMsgException() {
        Mockito.when(sendMsgService.sendMsg(anyString())).thenThrow(RuntimeException.class);
        Assertions.assertThrows(RuntimeException.class, ()-> sendMsgService.sendMsg("hello world"));
        verify(sendMsgService).sendMsg("hello world");
    }
}