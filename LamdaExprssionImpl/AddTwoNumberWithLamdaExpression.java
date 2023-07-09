package LamdaExprssionImpl;
@FunctionalInterface
interface i1{
    public void m1(int a,int b);
}
public class AddTwoNumberWithLamdaExpression {
    public static void main(String[] args) {

        i1 i=(a,b)-> System.out.println("sum with lamda expression: "+a+b);
        i.m1(5,7);
    }
}
