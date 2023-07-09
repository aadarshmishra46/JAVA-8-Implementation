package LamdaExprssion;
interface i3{
    int getLength(String s);
}
class Demo3 implements i3{
    @Override
    public int getLength(String s) {
        return s.length();
    }
}

public class StringLengthWithoutLamdaExpression {
    public static void main(String[] args) {
        i3 i=new Demo3();
        System.out.println(i.getLength("hello"));
    }
}


