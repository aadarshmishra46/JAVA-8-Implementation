package LamdaExprssionImpl;
@FunctionalInterface
interface i2{
     int getLength(String s);
}
public class StringLengthWithLamdaExpression {
    public static void main(String[] args) {
        i2 i=(s)->s.length();
        System.out.println( i.getLength("Aadarsh"));
    }
}
