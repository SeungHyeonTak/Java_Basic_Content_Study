package oopEx;

class Airplane {
    // 은닉화 하지 않은 소스
    public Airplane() {
    }

    public String nameOfAirp = "C10111";  // 비행기 이름
    public int fuel = 10000;  // liter
    public int goPerL = 10;  // Km/liter
}

class Airplane1 {
    private String nameOfAirp = "C1011";
    private int fuel = 10000;
    private int goPerL = 10;

    public Airplane1(String nameOfAirp, int fuel, int goPerL) {
        this.nameOfAirp = nameOfAirp;
        this.goPerL = goPerL;
    }

    public void setFuel(int fuel) {
        if (fuel < 1000) {
            System.out.println("연료부족으로 위험");
            this.fuel = 0;
            return;
        }
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public int getGoPerL() {
        return goPerL;
    }

    public String getNameOfAirp() {
        return nameOfAirp;
    }

    public String toString() {
        String s = "";
        if (fuel > 999) {
            s = "비행기 이름 : " + nameOfAirp;
            s += "비행거리 : " + goPerL * fuel;
        } else {
            s = "이 비행기는 출발할 수 없는 비행기 입니다.";
        }
        return s;
    }
}

public class Characteristics2 {
    public static void main(String[] args) {
        Airplane air858 = new Airplane();
        air858.nameOfAirp = "손오공";
        air858.fuel = 6000;
        air858.goPerL = 11;
        System.out.println("비행기 이름 : " + air858.nameOfAirp);
        System.out.println("비행거리 : " + air858.goPerL * air858.fuel + "km/n");
    }
}
