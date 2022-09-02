package com.slh.photo.album;

import java.util.List;
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
public class RetrieverTest {

    public RetrieverTest() {
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

    /*
        Test when the albumId does not exit.
        Should receive an empty list
     */
    @Test
    public void testZeroPhotos() {
        int id = 100000;
        Retriever retriever = new Retriever();
        List<AlbumInfo> result = retriever.retrieveAlbumInfo(id);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(result.size(), 0);
    }

    @Test
    public void testManyPhotos() {
        int id = 10;
        Retriever retriever = new Retriever();
        List<AlbumInfo> resultMany = retriever.retrieveAlbumInfo(id);
        Assertions.assertNotNull(resultMany);
        Assertions.assertEquals(resultMany.size(), 50);
    }

}
