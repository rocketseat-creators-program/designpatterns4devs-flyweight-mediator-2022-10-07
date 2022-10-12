package flyweightSong.after.songFlyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static FlyweightFactory instance = new FlyweightFactory();
    private static Map<String, SongFlyweight> songFlyweightRepository;

    private FlyweightFactory() {
        songFlyweightRepository = new HashMap<String, SongFlyweight>();
    }

    public static FlyweightFactory getInstance() {
        return instance;
    }

    public SongFlyweight getMusic(String desc) {
        SongFlyweight songFlyweight = songFlyweightRepository.get(desc);
        if(songFlyweight == null) {
            System.out.println("Creating new Flyweight for " + desc);
            songFlyweight = getSongByString(desc);
            songFlyweightRepository.put(desc, songFlyweight);
        }
        return songFlyweight;
    }

    private SongFlyweight getSongByString(String desc) {
        String[] songData = desc.split(";");
        return new SongFlyweight(songData[0], songData[1], Integer.valueOf(songData[2]));
    }

    public Integer getSize() {
        return songFlyweightRepository.size();
    }
}
