package DesignPattern.Mediator.ex1;

public abstract class Colleague {
    protected Mediator mediator;

    public boolean join(Mediator mediator) {
        if (mediator == null)
            return false;
        this.mediator = mediator;
        return mediator.addColleague(this);
    }

    public void sendData(String data) {
        if (mediator != null)
            mediator.mediate(data);
    }

    abstract public void handle(String data);
}
