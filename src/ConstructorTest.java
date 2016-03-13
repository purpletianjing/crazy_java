
public class ConstructorTest {
    public String name;
    public String color;
    public double weight;

    public ConstructorTest() {

    }

    public ConstructorTest(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public ConstructorTest(String name, String color, double weight) {
        //通过this调用另一个重载的构造器的初始化代码
        this(name, color);
        this.weight = weight;
    }
}
