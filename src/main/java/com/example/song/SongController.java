package com.example.song;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.SongService;
import com.example.song.Song;
/*
 * You can use the following import statements
 * 
 * 
 * 
 */

// Write your code here.
@RestController
public class SongController {
    SongService songService = new SongService();

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable int songId) {
        songService.deleteSong(songId);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song) {
        return songService.updateSong(songId, song);
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return songService.addSong(song);
    }

    @GetMapping("/songs")
    public ArrayList<Song> getSongs() {
        return songService.getSongs();
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId) {
        return songService.getSongById(songId);
    }
}