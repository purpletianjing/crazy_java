import java.util.Locale;

public class Primitive2Wrapper {
    public static void main(String[] args) {
        boolean b1 = true;
        //通过构造器把b1基本类型变量包装成包装类对象
        Boolean b1Obj = new Boolean(b1);

        int it = 5;
        Integer itObj = new Integer(it);

        //把一个字符串转换成Boolean对象
        Float f1 = new Float("4.56");

        //把一个字符串转换成Boolean对象
        Boolean bObj = new Boolean("false");

        //出现java.lang.NumberFormatException异常
        Long lObj = new Long("ddd");

    }
}
