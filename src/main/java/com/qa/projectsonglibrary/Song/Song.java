package com.qa.projectsonglibrary.Song;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="song")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String title;
    @Column
    private String artist;
    @Column
    private float length;

    /*//parameterized constructor
    public Song( String title, String artist, float length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }*/

    //toString
    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", length=" + length +
                '}';
    }

}
