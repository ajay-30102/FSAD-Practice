package one;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*; 


public class Caluculatortest {
	Caluculator c;

    @BeforeEach
    void setUp() throws Exception {
        c = new Caluculator(); 
    }

    @AfterEach
    void tearDown() throws Exception {
        c = null; }

    @Test
    void testAdd() {
        assertEquals(5, c.add(2, 3), "ADD method not working");
    }

    @Test
    void testSubtract() {
        assertEquals(7, c.subtract(10, 3), "SUBTRACT method not working");
    }
    

}
