package com.qa.projectsonglibrary.Song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SongService {
    @Autowired
    SongRepository songRepository;

    public List<Song> getAllSongs(){
        List<Song> songs=new ArrayList<>();
        songRepository.findAll().forEach(song -> songs.add(song));
        return songs;
    }

    public Song getSongById(int id){
        return songRepository.findById(id).get();
    }

    public List<Song> getSongByTitle(String title){
        return songRepository.findSongByTitle(title);
    }

    public List<Song> getSongByArtist(String artist){
        return songRepository.findSongByArtist(artist);
    }

    public List<Song> getSongByLengthLessThan(float length){
        return songRepository.findSongByLengthLessThan(length);
    }

    public List<Song> getSongByLengthGreaterThan(float length){
        return songRepository.findSongByLengthGreaterThan(length);
    }

    public void saveOrUpdate(Song song){
        songRepository.save(song);
    }

    public void delete(int id){
        songRepository.deleteById(id);
    }





}
