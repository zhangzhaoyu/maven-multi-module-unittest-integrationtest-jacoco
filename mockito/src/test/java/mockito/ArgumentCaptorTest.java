package mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by zhaoyu on 2020/8/12.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@ExtendWith(MockitoExtension.class)
public class ArgumentCaptorTest {
    @Captor
    private ArgumentCaptor<List<String>> captor;

    @Test
    void shouldContainCertainListItem() {
        List asList = Arrays.asList("someElement_test", "someElement");
        final List mockedList = mock(List.class);
        mockedList.addAll(asList);

        verify(mockedList).addAll(captor.capture());
        final List<String> capturedArgument = captor.getValue();
        assertThat(capturedArgument, hasItem("someElement"));
    }
}
