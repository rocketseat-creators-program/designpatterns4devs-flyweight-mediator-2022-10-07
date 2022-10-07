package flyweightSong.before.service;

import flyweightSong.before.model.Song;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SongService {

    private Map<String, Map<String, Song>> memory;

    public SongService() {
        memory = new HashMap<String, Map<String, Song>>();
    }

    public void listenMusic(String user, String desc) {
        Map<String, Song> userPlayList = memory.computeIfAbsent(user, k -> new HashMap<>());

        Song song = userPlayList.get(desc);
        if(song == null) {
            song = getMusicByString(desc);
            userPlayList.put(desc, song);
        }
        System.out.println(String.format("%s is listening '%s'",
                user, song.getName()));
        song.listenning();
    }

    private Song getMusicByString(String desc) {
        String[] musicData = desc.split(";");
        return new Song(musicData[0], musicData[1], new Integer(musicData[2]));
    }

    public void report() {
        int musicInMemory = 0;
        Set<String> users = memory.keySet();
        for(String user: users) {
            int timeCounter = 0;
            System.out.println("---------");
            System.out.println(user + " has listen...");
            Collection<Song> songs = memory.get(user).values();
            for(Song song: songs) {
                System.out.println(String.format("%s/%s %d times",
                        song.getArtist(), song.getName(), song.getPlayerQty()));
                timeCounter += (song.getPlayerQty() * song.getDurationInSeconds());
                musicInMemory++;
            }
            System.out.println(String.format("%s has listen music for %d seconds", user, timeCounter));
        }
        System.out.println("Total of musics in spotify memory: " + musicInMemory);
    }
}
