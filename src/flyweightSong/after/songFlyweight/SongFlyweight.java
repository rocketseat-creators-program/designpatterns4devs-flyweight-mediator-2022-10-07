package flyweightSong.after.songFlyweight;

public class SongFlyweight {

    private String name;
    private String artist;
    private Integer durationInSeconds;

    public SongFlyweight(String name, String artist, Integer durationInSeconds) {
        this.name = name;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    @Override
    public String toString() {
        return "SongFlyweight [name=" + name + ", artist=" + artist
                + ", durationInSeconds=" + durationInSeconds + "]";
    }
}
