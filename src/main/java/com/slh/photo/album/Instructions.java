/*
 * Class to print the instructions for usage.
 */
package com.slh.photo.album;

/**
 *
 * @author Steve
 */
public class Instructions {

    public static String INSTRUCT1 = "Usage: photoAlbum [albumId]";
    static String INSTRUCT2 = "From the command line, type: photoAlbum albumID";
    static String INSTRUCT3 = "albumID = a number greater than 0 for the album id to retrieve";

    /* Print the instruction on the command line */
    public static void printInstructions() {
        System.out.println(INSTRUCT1);
        System.out.println(INSTRUCT2);
        System.out.println(INSTRUCT3);

    }
}
