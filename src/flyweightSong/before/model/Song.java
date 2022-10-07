package flyweightSong.before.model;

public class Song {

    private String name;
    private String artist;
    private Integer durationInSeconds;
    private Integer playerQty;

    public Song(String name, String artist, Integer durationInSeconds) {
        this.name = name;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
        this.playerQty = 0;
    }

    public void listenning() {
        playerQty++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public Integer getPlayerQty() {
        return playerQty;
    }

    public void setPlayerQty(Integer playerQty) {
        this.playerQty = playerQty;
    }

    @Override
    public String toString() {
        return "Song [name=" + name + ", artist=" + artist + ", durationInSeconds=" + durationInSeconds
                + ", playerQty=" + playerQty + "]";
    }
}
