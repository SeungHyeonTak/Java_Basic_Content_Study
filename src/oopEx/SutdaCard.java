package oopEx;

public class SutdaCard {
    int num;
    boolean isWkang;

    public SutdaCard() {
        this.num = 1;
        this.isWkang = true;
    }

    public SutdaCard(int num, boolean isWkang) {
        this.num = num;
        this.isWkang = isWkang;
    }

    public String info() {
        return num + (isWkang ? "K" : "");
    }

    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}
