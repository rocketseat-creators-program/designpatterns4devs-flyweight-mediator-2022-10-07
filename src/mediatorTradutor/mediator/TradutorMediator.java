package mediatorTradutor.mediator;

import mediatorTradutor.model.User;
import mediatorTradutor.service.Tradutor;

public class TradutorMediator extends Mediator {

    private Tradutor tradutor = new Tradutor();

    protected String getMessage(String message, User to, User from) {
        return tradutor.getTranslation(from.getLanguage(), to.getLanguage(), message);
    }
}
