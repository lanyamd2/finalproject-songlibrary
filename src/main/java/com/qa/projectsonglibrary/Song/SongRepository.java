package com.qa.projectsonglibrary.Song;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SongRepository extends CrudRepository<Song, Integer> {
    //find song by title
    List<Song> findSongByTitle(String title);

    @Query("SELECT s from Song s WHERE s.title = ?1")
    List<Song> findSongByTitleJPQL(String title);

    @Query(value = "SELECT * from Song s where s.title =?1", nativeQuery = true)
    List<Song> findSongByTitleSQL(String title);


    //find song by artist
    List<Song> findSongByArtist(String artist);

    @Query("SELECT s from Song s WHERE s.artist = ?1")
    List<Song> findSongByArtistJPQL(String artist);

    @Query(value = "SELECT * from Song s where s.title =?1", nativeQuery = true)
    List<Song> findSongByArtistSQL(String artist);

    //find song by length less than
    List<Song> findSongByLengthLessThan(float length);

    @Query("SELECT s from Song s")
    List<Song> findSongByLengthLessThanJPQL(float length);

    @Query("SELECT s from Song s")
    List<Song> findSongByLengthLessThanSQL(float length);

    //find song by length greater than
    List<Song> findSongByLengthGreaterThan(float length);

    @Query("SELECT s from Song s")
    List<Song> findSongByLengthGreaterThanJPQL(float length);

    @Query("SELECT s from Song s")
    List<Song> findSongByLengthGreaterThanSQL(float length);









}
