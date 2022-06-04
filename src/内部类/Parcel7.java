package 内部类;

public class Parcel7 {
    private Contents contents() {
        return new Contents() {
            private int value = 11;

            @Override
            public int getValue() {
                return value;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p7 = new Parcel7();
        System.out.println(p7.contents().getValue());
    }
}
