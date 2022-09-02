/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.slh.photo.album;

import java.util.List;

/**
 *
 * @author Steve
 */
public class PhotoAlbum {

    static String END_POINT = "http://jsonplaceholder.typicode.com/photos";

    Retriever retriever = new Retriever();

    public static void main(String[] args) {
        Retriever retriever = new Retriever();
        if (args.length != 1) {
            Instructions.printInstructions();
        }
        int albumId = Integer.parseInt(args[0]);
        //System.out.println("PhotoAlbum retreiving ID=" + albumId);
        List<AlbumInfo> info = retriever.retrieveAlbumInfo(albumId);
        info.forEach(x -> System.out.println("[" + x.getId() + "] " + x.getTitle()));
    }

    Retriever getRetriever() {
        return retriever;
    }
}
