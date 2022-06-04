package 内部类;

public class Parcel6 {
    // 吃椰子的方法
    private void eatCoconut(boolean flag) {
        // 如果可以吃椰子的话
        if (flag) {
            class Coconut {
                private String pipe;

                public Coconut(String pipe) {
                    this.pipe = pipe;
                }

                // 喝椰子汁的方法
                String drinkCoconutJuice() {
                    System.out.println("喝椰子汁");
                    return pipe;
                }
            }
            // 提供一个吸管，可以喝椰子汁
            Coconut coconut = new Coconut("用吸管喝");
            coconut.drinkCoconutJuice();
        }

        /**
         * 如果可以吃椰子的话，你才可以用吸管喝椰子汁
         * 如果不能接到喝椰子汁的指令的话，那么你就不能喝椰子汁
         */
        // Coconut coconut = new Coconut("用吸管喝");
        // coconut.drinkCoconutJuice();
    }

    public static void main(String[] args) {
        Parcel6 p6 = new Parcel6();
        p6.eatCoconut(true);
    }
}
