package mediatorTradutor.mediator;

import mediatorTradutor.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Mediator {

    protected Map<String, User> users = new HashMap<String, User>();

    public void addUser(User user) {
        System.out.printf("'%s' is in the room%n", user.getName());
        users.put(user.getName(), user);
    }

    public void removeUser(User user) {
        System.out.printf("'%s' is out%n", user.getName());
        users.remove(user.getName());
    }

    public void sendMessage(String message, User to, User from) {
        if (to == null) {
            for (User user : users.values()) {
                if (Objects.equals(user.getName(), from.getName()))
                    continue;
                user.receiveMessage(getMessage(message, user, from), from);
            }
        } else {
            to.receiveMessage(getMessage(message, to, from), from);
        }
    }

    protected abstract String getMessage(String message, User to, User from);
}

