package flyweightSong.after.service;

import flyweightSong.after.model.Song;
import flyweightSong.after.songFlyweight.FlyweightFactory;

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
            song = new Song(FlyweightFactory.getInstance().getMusic(desc));
            userPlayList.put(desc, song);
        }
        System.out.printf("%s is listening '%s'%n",
                user, song.getMusicFlyweight().getName());
        song.listening();
    }

    public void report() {
        Set<String> users = memory.keySet();
        for(String user: users) {
            int timeCounter = 0;
            System.out.println("---------");
            System.out.println(user + " has listen...");
            Collection<Song> musics = memory.get(user).values();
            for(Song music: musics) {
                System.out.println(String.format("%s/%s %d times",
                        music.getMusicFlyweight().getArtist(),
                        music.getMusicFlyweight().getName(),
                        music.getPlayerQty()));
                timeCounter += (music.getPlayerQty() * music.getMusicFlyweight().getDurationInSeconds());
            }
            System.out.println(String.format("%s has listen music for %d seconds", user, timeCounter));
        }
        System.out.println("Total of musics in flyWeight's memory: " + FlyweightFactory.getInstance().getSize());
    }
}
