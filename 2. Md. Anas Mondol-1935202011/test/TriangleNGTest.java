/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Md. Anas Mondol
 */
public class TriangleNGTest {
    
    public TriangleNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of Adding method, of class Triangle.
     */
    @Test
    public void testAdding() {
        System.out.println("Adding");
        float w = 0.0F;
        float h = 0.0F;
        double a = 0.0;
        Triangle instance = new Triangle();
        instance.Adding(w, h, a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showing method, of class Triangle.
     */
    @Test
    public void testShowing() {
        System.out.println("showing");
        Triangle instance = new Triangle();
        instance.showing();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
