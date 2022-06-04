package 内部类;

public class Food {
    private class InnerFruit implements Fruit {
        public void meakFruit() {
            System.out.println("种一个水果");
        }
    }

    private class InnerMeat implements Meat {
        public void makeMeat() {
            System.out.println("煮一块肉");
        }
    }

    public Fruit fruit() {
        return new InnerFruit();
    }

    public Meat meat() {
        return new InnerMeat();
    }

    public static void main(String[] args) {
        Food food = new Food();
        InnerFruit innerFruit = (InnerFruit) food.fruit();
        innerFruit.meakFruit();
        InnerMeat innerMeat = (InnerMeat) food.meat();
        innerMeat.makeMeat();
    }
}
