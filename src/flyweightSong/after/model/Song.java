package flyweightSong.after.model;

import flyweightSong.after.songFlyweight.SongFlyweight;

public class Song {

    private SongFlyweight songFlyweight;
    private Integer playerQty;

    public Song(SongFlyweight songFlyweight) {
        this.songFlyweight = songFlyweight;
        this.playerQty = 0;
    }

    public void listening() {
        playerQty++;
    }

    public SongFlyweight getMusicFlyweight() {
        return songFlyweight;
    }

    public void setMusicFlyweight(SongFlyweight songFlyweight) {
        this.songFlyweight = songFlyweight;
    }

    public Integer getPlayerQty() {
        return playerQty;
    }

    public void setPlayerQty(Integer playerQty) {
        this.playerQty = playerQty;
    }

    @Override
    public String toString() {
        return "Song [songFlyweight=" + songFlyweight + ", playerQty=" + playerQty + "]";
    }
}
