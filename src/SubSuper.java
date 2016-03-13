class Base {
    public double size;
    public String name;
    public Base(double size, String name) {
        this.size = size;
        this.name = name;
    }
}
public class SubSuper extends Base {
    public String color;

    public SubSuper(double size, String name, String color) {
        super(size, name);
        this.color = color;
    }

    public static void main(String[] args) {
        SubSuper subSuper = new SubSuper(5.6, "测试对象", "红色");
        System.out.println(subSuper.size + "__" + subSuper.name + "__" + subSuper.color);
    }
}
