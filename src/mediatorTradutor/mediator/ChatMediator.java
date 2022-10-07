package mediatorTradutor.mediator;

import mediatorTradutor.model.User;

public class ChatMediator extends Mediator {

    public String getMessage(String message, User to, User from) {
        return message;
    }

}
