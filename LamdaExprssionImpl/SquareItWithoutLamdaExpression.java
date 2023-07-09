package LamdaExprssionImpl;
interface i4{
    int squareIt(int a);

}
class Demo4 implements i4{
    public int squareIt(int a){
        return a*a;
    }
}
public class SquareItWithoutLamdaExpression {
    public static void main(String[] args) {
        i4 i= new Demo4();
        System.out.println(i.squareIt(4));
    }
}
