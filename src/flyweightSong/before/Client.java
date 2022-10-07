package flyweightSong.before;

import flyweightSong.before.service.SongService;

public class Client {

    public static void main(String[] args) {
        SongService player = new SongService();
        player.listenMusic("Ana", "Fear of the Dark;Iron Maiden;500");
        player.listenMusic("Erick", "Fear of the Dark;Iron Maiden;500");
        player.listenMusic("Ana", "Painkiller;Judas Priest;600");
        player.listenMusic("Ana", "Fear of the Dark;Iron Maiden;500");
        player.listenMusic("Erick", "Fear of the Dark;Iron Maiden;500");
        player.listenMusic("Erick", "Painkiller;Judas Priest;600");

        player.report();
    }
}
