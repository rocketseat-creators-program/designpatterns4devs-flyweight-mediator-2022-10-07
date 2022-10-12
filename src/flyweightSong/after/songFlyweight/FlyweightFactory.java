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
        SongFlyweight mf = songFlyweightRepository.get(desc);
        if(mf == null) {
            System.out.println("Creating new Flyweight for " + desc);
            mf = getSongByString(desc);
            songFlyweightRepository.put(desc, mf);
        }
        return mf;
    }

    private SongFlyweight getSongByString(String desc) {
        String[] songData = desc.split(";");
        return new SongFlyweight(songData[0], songData[1], Integer.valueOf(songData[2]));
    }

    public Integer getSize() {
        return songFlyweightRepository.size();
    }
}
