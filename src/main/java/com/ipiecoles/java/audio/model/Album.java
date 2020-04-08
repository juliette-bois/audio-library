package com.ipiecoles.java.audio.model;

import javax.persistence.*;

@Entity
@Table(name="Album")
public class Album {
    public Album() {
    }

    public Album(String title) {
        this.title = title;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long AlbumId;

    @Column(name = "Title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "ArtistId")
    private Artist artist;

    @Override
    public String toString() {
        return "Album{" +
                "AlbumId=" + AlbumId +
                ", title='" + title + '\'' +
                ", artist=" + artist +
                '}';
    }
}
