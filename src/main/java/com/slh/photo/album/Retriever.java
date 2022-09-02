package com.slh.photo.album;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Steve
 */
public class Retriever {

    private static final String ENDPOINT = "https://jsonplaceholder.typicode.com/photos?albumId=";

    public List<AlbumInfo> retrieveAlbumInfo(int id) {
//        System.out.println("PhotoAlbum.retriteveAlbum(" + id + ")");
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest req = HttpRequest.newBuilder().
//        uri(URI.create(ENDPOINT + id)).build();
        List<AlbumInfo> albumList = null;
        try {
//            HttpResponse res = client.send(req, HttpResponse.BodyHandlers.ofString());
            ObjectMapper mapper = new ObjectMapper();
//            System.out.println("REPONSE BODY+" + res.body().toString());
            //info = mapper.readValue(new URL(ENDPOINT + id), AlbumInfo.class);
            CollectionType javaType = mapper.getTypeFactory()
                    .constructCollectionType(List.class, AlbumInfo.class);
            albumList = mapper.readValue(new URL(ENDPOINT + id), javaType);
        } catch (IOException ex) {
            Logger.getLogger(Retriever.class.getName()).log(Level.SEVERE, null, ex);
        }
        return albumList;
    }

}
