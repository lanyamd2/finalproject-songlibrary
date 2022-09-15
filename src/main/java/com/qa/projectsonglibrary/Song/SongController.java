package com.qa.projectsonglibrary.Song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
public class SongController {
    @Autowired
    SongService songService;

    //Home Page
    @GetMapping(path="/")
    public String welcomePage(){
        return "<html><body>"+
                "<h1>WELCOME TO SONG LIBRARY</h1>"+
                "<a href='http://localhost:8282/index.html'>View Instructions</a>"
                +"</body></html>";
    }

    @GetMapping("/songs")//retrieves all songs
    private List<Song> getAllSongs(){
        return songService.getAllSongs();
    }

    @GetMapping("/song/{id}")//retrieves details of a specific songs by id
    private Song getSongById(@PathVariable("id") int id){
        return songService.getSongById(id);
    }

    @GetMapping("/songtitle/{title}")//retrieves details of a specific song by title
    private List<Song> getSongByTitle(@PathVariable("title") String title){
        return songService.getSongByTitle(title);
    }

    @GetMapping("/songartist/{artist}")//retrieves details of a specific song by artist
    private List<Song> getSongByArtist(@PathVariable("artist") String artist){
        return songService.getSongByArtist(artist);
    }

    @GetMapping("/songlengthless/{length}")//retrieves details of songs less than a certain length
    private List<Song> getSongByLengthLessThan(@PathVariable("length") float length){
        return  songService.getSongByLengthLessThan(length);
    }

    @GetMapping("/songlengthgreater/{length}")//retrieves details of songs greater than a certain length
    private List<Song> getSongByLengthGreaterThan(@PathVariable("length") float length){
        return  songService.getSongByLengthGreaterThan(length);
    }

    @PostMapping("/newsong")
    private String saveSong(@RequestBody Song song){
        songService.saveOrUpdate(song);
        return "Saved! "+ song.toString();
    }

    @DeleteMapping("/deletesong/{id}")
    private String deleteSong(@PathVariable("id") int id){
        songService.delete(id);
        return "Deleted! ID: "+id;
    }

}
