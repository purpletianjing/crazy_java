class Root {
    static {
        System.out.println("Root的静态初始化");
    }
    {
        System.out.println("Root的普通初始化");
    }
    public Root() {
        System.out.println("Root的无参数构造器");
    }
}

class Mid extends Root {
    static {
        System.out.println("Mid 的静态初始化");
    }
    {
        System.out.println("Mid 的普通初始化");
    }
    public Mid() {
        System.out.println("Mid的无参数构造器");
    }
    public Mid(String msg) {
        this();
        System.out.println("Mid 的带参数构造器,其参数为:" + msg);
    }
}

class Leaf extends Mid {
    static {
        System.out.println("Leaf的静态初始化");
    }
    {
        System.out.println("Leaf的普通初始化");
    }
    public Leaf() {
        super("疯狂Java讲义");
        System.out.println("执行Leaf的构造器");
    }
}

public class Test {
    public static void main(String[] args) {
        new Leaf();
        new Leaf();
    }
}
