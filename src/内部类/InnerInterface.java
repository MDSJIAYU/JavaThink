package 内部类;

public interface InnerInterface {
    void f();

    class InnerClass implements InnerInterface {
        @Override
        public void f() {
            System.out.println("实现了接口的方法");
        }

        public static void main(String[] args) {
            new InnerClass().f();
        }
    }
}
