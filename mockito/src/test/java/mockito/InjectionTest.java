package mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.verify;

/**
 * Created by zhaoyu on 2020/8/12.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@ExtendWith(MockitoExtension.class)
class InjectionTest {

    @Mock
    private List<String> names;

    @Mock
    private Type type;

    @InjectMocks
    private Injection injection;

    @Test
    void testInject() {
        injection.init();
        verify(type).getName();
    }

}

class Injection {
    private List<String> names;
    private Type type;

    public List<String> getNames() {
        return names;
    }

    public void init() {
        this.type.getName();
    }
}

class Type {
    private String name;

    public String getName() {
        return name;
    }
}
