package mediatorTradutor.model;

import mediatorTradutor.mediator.Mediator;

public final class PortugueseUser extends User {

    public PortugueseUser(String name, Mediator mediator) {
        super(name, mediator, Language.PORTUGUESE);
    }

}
