package hw2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("1");
        Human human2 = new Human("2");
        Human human3 = new Human("3");
        Human human4 = new Human("4");
        Human human5 = new Human("5");

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.acceptToMarket(human5);
        market.update();
    }
}