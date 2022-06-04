package 内部类;

public class Parcel5 {
    private Destination destination(String s) {
        class PDestination implements Destination {
            String label;

            public PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p5 = new Parcel5();
        Destination destination = p5.destination("China");
        System.out.println(destination.readLabel());
    }
}
