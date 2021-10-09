package DesignPattern.state;

public class LapTop {
    private PowerState powerState;

    public LapTop() {
        this.powerState = new Off();  // 처음 상태는 전원이 꺼져있을때를 나타냄
    }

    public void pushButton() {
        powerState = powerState.powerPush();
    }
}
