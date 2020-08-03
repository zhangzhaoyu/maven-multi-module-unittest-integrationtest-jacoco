import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DomainClass2Test {
    @Test
//  @Category( MyUnitTest.class) -- see parent.pom '
    public void testUnitTestOne() {
        DomainClass2 domainClass2 = new DomainClass2();
        assertEquals( 15131, domainClass2.convert( 123));
    }
}
