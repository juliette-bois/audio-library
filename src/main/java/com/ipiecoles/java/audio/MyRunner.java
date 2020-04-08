package com.ipiecoles.java.audio;

import com.ipiecoles.java.audio.model.Album;
import com.ipiecoles.java.audio.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private AlbumRepository albumRepository;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("test");
        Album album = albumRepository.findWithArtistByTitle("Balls to the Wall");
        System.out.println(album);
    }

    public static void print(Object t) {
        System.out.println(t);
    }
}
