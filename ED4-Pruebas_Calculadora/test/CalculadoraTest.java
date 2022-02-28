/*
 * Proyecto ED4-Pruebas_Calculadora - Archivo CalculadoraTest.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

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
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora(20,10);
        int expResult = 30;
        int result = instance.suma();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora instance = new Calculadora(20,10);
        int expResult = 10;
        int result = instance.resta();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        Calculadora instance = new Calculadora(20,10);
        int expResult = 200;
        int result = instance.multiplica();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDivide() {
        System.out.println("divide");
        Calculadora instance = new Calculadora(20,10);
        int expResult = 2;
        int result = instance.divide();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
