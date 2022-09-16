package com.qa.projectsonglibrary.SongTests;

import com.qa.projectsonglibrary.Song.Song;
import static org.junit.jupiter.api.Assertions.*;
import com.qa.projectsonglibrary.Song.SongService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SongServiceTest {
    @Autowired
    private SongService songService;

    @Test
    void saveOrUpdate(){
        Song song = new Song(1,"Rollercoaster","Bleachers",3.08f);
        songService.saveOrUpdate(song);
        assertEquals("Rollercoaster",songService.getSongById(song.getId()).getTitle());
    }
}
