package mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

/**
 * Created by zhaoyu on 2020/8/12.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@ExtendWith(MockitoExtension.class)
class MockitoTest {
    @Mock
    private Cal cal;

    @BeforeEach
    void beforeEach() {
        //MockitoAnnotations.initMocks(this);
    }

    @Test
    void testList() {
        when(cal.add(anyInt(), anyInt())).thenReturn(2);
        Assertions.assertEquals(2, this.cal.add(1, 1));
    }
}
