class Creature {
    public Creature() {
        System.out.println("Creature 无参数构造器");
    }
}

class Animal extends Creature {
    public Animal(String name) {
        System.out.println("Composite.Animal 带一个参数的构造器, "
                + "该动物的name为" + name);
    }

    public Animal(String name, int age) {
        this(name);
        System.out.println("Composite.Animal 带两个参数的构造器, "
                + "其age为" + age);
    }
}

public class Wolf extends Animal {
    public Wolf() {
        super("灰太狼", 3);
        System.out.println("Wolf无参数的构造器");
    }
    public static void main(String[] args) {
        new Wolf();
    }
}
