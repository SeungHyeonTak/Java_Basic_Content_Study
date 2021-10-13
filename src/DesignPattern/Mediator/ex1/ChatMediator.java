package DesignPattern.Mediator.ex1;

public class ChatMediator extends Mediator {
    @Override
    void mediate(String data) {
        for (Colleague colleague : colleagues) {
            // 중재가능성.
            colleague.handle(data);
        }
    }
}
