import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DomainClass1Test {
    @Test
//  @Category( MyUnitTest.class)
    public void testUnitTestOne() {
        DomainClass1 domainClass1 = new DomainClass1();
        assertEquals( 15131, domainClass1.convert( 123));
    }
}
