package 内部类;

public class Man {
    private ManWithKnowledge man;

    protected class ManWithKnowledge {
        public void haveKnowledge() {
            System.out.println("当今社会是需要知识的");
        }
    }

    // 我们想让它输出子类的haveKnowledge()方法
    public Man() {
        System.out.println("当我们有了一个孩子，我们更希望他可以当一个科学家，而不是网红");
        new ManWithKnowledge ().haveKnowledge();
    }
}

class InternetCelebrity extends Man {
    protected class ManWithKnowledge {
        public void haveKnowledge() {
            System.out.println("网红是当今社会的一种病态");
        }
    }

    public static void main(String[] args) {
        new InternetCelebrity();
    }
}
