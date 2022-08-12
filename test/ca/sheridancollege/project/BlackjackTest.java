/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author UMANG
 */
public class BlackjackTest {
    
    public BlackjackTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isStatus method, of class Blackjack.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        Blackjack instance = null;
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawCard method, of class Blackjack.
     */
    @Test
    public void testDrawCard() {
        System.out.println("drawCard");
        Blackjack instance = null;
        instance.drawCard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of steady method, of class Blackjack.
     */
    @Test
    public void testSteady() {
        System.out.println("steady");
        Blackjack instance = null;
        instance.steady();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of split method, of class Blackjack.
     */
    @Test
    public void testSplit() {
        System.out.println("split");
        Blackjack instance = null;
        instance.split();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of declareWinner method, of class Blackjack.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        Blackjack instance = null;
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
