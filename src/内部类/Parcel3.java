package 内部类;

public class Parcel3 {
    public class Contents{
        public Parcel3 doThis(){
            return Parcel3.this;
        }
        @Override
        public String toString(){
            return "Contents";
        }
    }
    public Parcel3 contents(){
        return new Contents().doThis();
    }
    @Override
    public String toString(){
        return "Parcel3";
    }

    public static void main(String[] args) {
        Parcel3 pl3 = new Parcel3();
        Contents contents = pl3.new Contents();
        Parcel3 pl4 = pl3.contents();
        System.out.println(pl3);
        System.out.println(contents);
        System.out.println(pl4);
    }
}
