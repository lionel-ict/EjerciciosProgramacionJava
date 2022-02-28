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
public class CalculadoraTest2 {
    
    public static Calculadora instance;
    
    public CalculadoraTest2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance = new Calculadora(20,10);
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
        assertEquals(30, instance.suma());
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        assertEquals(10, instance.resta());
    }

    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        assertEquals(200, instance.multiplica());
    }

    @Test
    public void testDivide() {
        System.out.println("divide");
        assertEquals(2, instance.divide());
    }
    
}
