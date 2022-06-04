package 反射;

import java.lang.reflect.Constructor;

public class SmallPineapple {
    public String name;
    public int age;
    private double weight;

    public SmallPineapple() {
    }

    public SmallPineapple(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void getInfo(){
        System.out.println("["+name+"的年龄是:"+age+"]");
    }

    public static void main(String[] args) throws Exception{
        Class<SmallPineapple> clazz1 = SmallPineapple.class;
        Constructor<SmallPineapple> ctr = clazz1.getConstructor(String.class, int.class);
        SmallPineapple smallPineapple = ctr.newInstance("张三", 18);
        smallPineapple.getInfo();
    }
}
