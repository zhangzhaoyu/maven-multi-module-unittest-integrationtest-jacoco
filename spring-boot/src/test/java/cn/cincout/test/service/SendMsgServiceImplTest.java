package cn.cincout.test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

/**
 * Created by zhaoyu on 2020/8/12.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@ExtendWith(MockitoExtension.class)
class SendMsgServiceImplTest {
    @Mock
    private SendMsgServiceImpl sendMsgService;

    @Test
    void sendMsg() {
        Mockito.when(sendMsgService.sendMsg(anyString())).thenReturn(true);
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