package defaultConstructor;

public class ThisMethod {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    public ThisMethod(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
        System.out.println("1");
    }

    public ThisMethod() {
        this("소나타", 2021, "검은색", 160);
        System.out.println("2");
    }

    public String getModel() {
        return this.modelYear + "년식" + this.modelName + " " + this.color;
    }
}
