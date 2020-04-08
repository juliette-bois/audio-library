package com.ipiecoles.java.audio.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Artist")
public class Artist {
    public Artist() {
    }

    public Artist(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "artist")
    private Set<Album> albums = new HashSet();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ArtistId;

    @Column(name = "Name")
    private String name;

    @Override
    public String toString() {
        return "Artist{" +
                "albums=" + albums +
                ", ArtistId=" + ArtistId +
                ", name='" + name + '\'' +
                '}';
    }
}
