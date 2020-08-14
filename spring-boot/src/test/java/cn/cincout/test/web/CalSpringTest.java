package cn.cincout.test.web;

import cn.cincout.test.Cal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

/**
 * Created by zhaoyu on 20-7-26.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class CalSpringTest {

    @SpyBean
    private Cal cal; // = spy(new Cal());

    @BeforeEach
    void before() {
        //this.cal = new Cal();
    }

    @Test
    void add() {
        // when(cal.add(anyInt(), anyInt())).thenReturn(2);
        Assertions.assertEquals(2, this.cal.add(1, 1));
    }
}