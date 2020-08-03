import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DomainClass2IntegrationTest {
    @Test
//  @Category( MyIntegrationTest.class) - when you use in the failsafe plugin: '<groups>MyIntegrationTest</groups>'
    public void testUnitIntegrationTestTwo() {
        DomainClass2 domainClass2 = new DomainClass2();
        assertEquals( 15131, domainClass2.convert2( 123));
    }
}
