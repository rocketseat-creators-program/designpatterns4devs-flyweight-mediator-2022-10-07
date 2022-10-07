package mediatorTradutor.model;

import mediatorTradutor.mediator.Mediator;

public final class EnglishUser extends User {

    public EnglishUser(String name, Mediator mediator) {
        super(name, mediator, Language.ENGLISH);
    }

}
