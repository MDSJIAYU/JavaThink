package 字符串;

public class StringDemo1 {
    public static void main(String[] args) {
        String a = new String("ab");
        String b = new String("ab");
        String c = "ab";
        String d = "a";
        String e = new String("b");
        String f = d + e;
        System.out.println(a.intern() == b);
        System.out.println(a.intern() == b.intern());
        System.out.println(a.intern() == c);
        System.out.println(a.intern() == f);
    }
}
