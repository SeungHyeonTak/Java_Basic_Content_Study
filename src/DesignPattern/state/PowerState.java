package DesignPattern.state;

interface PowerState {
    PowerState powerPush();
}


class On implements PowerState {

    @Override
    public PowerState powerPush() {
        System.out.println("전원이 꺼짐");
        return new Off();
    }
}

class Off implements PowerState {

    @Override
    public PowerState powerPush() {
        System.out.println("전원이 켜짐");
        return new On();
    }
}