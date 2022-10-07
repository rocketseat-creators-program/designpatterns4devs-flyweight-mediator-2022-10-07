package mediatorTradutor;

import mediatorTradutor.mediator.Mediator;
import mediatorTradutor.mediator.TradutorMediator;
import mediatorTradutor.model.EnglishUser;
import mediatorTradutor.model.PortugueseUser;
import mediatorTradutor.model.User;

public class Client {

    public static void main(String[] args) {
        // Mediator chatRoom = new ChatMediator();
        Mediator chatRoom = new TradutorMediator();

        User ana = new EnglishUser("Ana", chatRoom);
        User erick = new PortugueseUser("Erick", chatRoom);
        User beatriz = new EnglishUser("Beatriz", chatRoom);
        User carla = new PortugueseUser("Carla", chatRoom);

        chatRoom.addUser(ana);
        chatRoom.addUser(beatriz);
        chatRoom.addUser(carla);

        ana.sendMessage("Hello");
        carla.sendMessage("Oi", ana);

        chatRoom.removeUser(beatriz);

        ana.sendMessage("How are you?", carla);
        carla.sendMessage("Estou bem, obrigado.", ana);

        chatRoom.addUser(erick);

        erick.sendMessage("Oi");

        chatRoom.removeUser(carla);
    }
}
