package LamdaExprssionImpl;
interface i5{
    int squareIt(int a);
}
public class SquareItWithLamdaExpression {
    public static void main(String[] args) {
        i5 i=(a)->a*a;
        System.out.println(i.squareIt(5));
    }
}
