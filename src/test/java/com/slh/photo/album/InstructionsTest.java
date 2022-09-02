/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.slh.photo.album;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Steve
 */
public class InstructionsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    public InstructionsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    /**
     * Test of printInstructions method, of class Instructions. Check for the String 'Usage:'
     */
    @Test
    public void testPrintInstructionsUsage() {
        System.out.println("printInstructions Usage");
        Instructions.printInstructions();
        Assertions.assertTrue(outContent.toString().contains(Instructions.INSTRUCT1));
    }

    /**
     * Test of printInstructions method, of class Instructions. Check for the second string of Instructions
     */
    @Test
    public void testPrintInstructionsLine2() {
        System.out.println("printInstructions Line2");
        Instructions.printInstructions();
        Assertions.assertTrue(outContent.toString().contains(Instructions.INSTRUCT2));
    }

    /**
     * Test of printInstructions method, of class Instructions. Check for the third string of Instructions
     */
    @Test
    public void testPrintInstructionsLine3() {
        System.out.println("printInstructions Line3");
        Instructions.printInstructions();
        Assertions.assertTrue(outContent.toString().contains(Instructions.INSTRUCT3));
    }
}
