package flyweightSong.after;

import flyweightSong.after.service.SongService;

public class Client {

    public static void main(String[] args) {
        SongService player = new SongService();
        player.listenMusic("User A", "Fear of the Dark;Iron Maiden;500");
        player.listenMusic("User A", "Fear of the Dark;Iron Maiden;500");
        player.listenMusic("User A", "Fear of the Dark;Iron Maiden;500");
        player.listenMusic("User A", "Painkiller;Judas Priest;600");
        player.listenMusic("User B", "Painkiller;Judas Priest;600");
        player.listenMusic("User B", "Painkiller;Judas Priest;600");

        player.report();
    }
}
