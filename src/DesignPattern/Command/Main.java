package DesignPattern.Command;

public class Main {
    public static void main(String[] args) {
        RobotKit robotKit = new RobotKit();

        robotKit.addCommand(new MoveForwardCommand(2));  // 2칸 전진
        robotKit.addCommand(new TurnCommand(Robot.Direction.LEFT));  // 왼쪽으로 회전
        robotKit.addCommand(new MoveForwardCommand(1));  // 1칸 전진
        robotKit.addCommand(new TurnCommand(Robot.Direction.RIGHT));  // 오른쪽으로 회전
        robotKit.addCommand(new PickupCommand());

        robotKit.start();
    }
}
