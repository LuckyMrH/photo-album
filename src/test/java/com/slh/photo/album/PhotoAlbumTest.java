package com.slh.photo.album;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 *
 * @author Steve
 */
@TestInstance(Lifecycle.PER_CLASS)
public class PhotoAlbumTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    public PhotoAlbumTest() {
    }

    @BeforeAll
    public void setUpClass() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterAll
    public void tearDownClass() {
        System.setOut(standardOut);

    }

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {

    }

    /**
     * Test of main method, of class PhotoAlbum.
     */
    @Test
    public void testMainWithArgs() {
        String[] args = new String[]{"75"};
        PhotoAlbum.main(args);
        String output = outputStream.toString();

        // Sanity check to ensure out output includes "Main"
        Assertions.assertTrue(output.contains("3701"));
    }
}
