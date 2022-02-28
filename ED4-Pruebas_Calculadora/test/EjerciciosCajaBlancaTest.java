import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lionel Tarazón Alcocer <ltarazona@ausiasmarch.net>
 */
public class EjerciciosCajaBlancaTest {
    
    public EjerciciosCajaBlancaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testHay_mayor_tira() {
        System.out.println("hay_mayor_tira");
        assertEquals(false, EjerciciosCajaBlanca.hay_mayor_tira(new char[]{}, 'a'));
        assertEquals(false, EjerciciosCajaBlanca.hay_mayor_tira(new char[]{'a'}, 'a'));
        assertEquals(true, EjerciciosCajaBlanca.hay_mayor_tira(new char[]{'b'}, 'a'));
        //fail("The test case is a prototype.");
    }

    @Test
    public void testBuscar_en() {
        System.out.println("buscar_en");
        assertEquals(0, EjerciciosCajaBlanca.buscar_en(new char[]{}, 'a'));
        assertEquals(1, EjerciciosCajaBlanca.buscar_en(new char[]{'a'}, 'a'));
        assertEquals(0, EjerciciosCajaBlanca.buscar_en(new char[]{'b'}, 'a'));
        assertEquals(1, EjerciciosCajaBlanca.buscar_en(new char[]{'a','b'}, 'a'));
        //fail("The test case is a prototype.");
    }
    
}
