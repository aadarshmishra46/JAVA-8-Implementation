package LamdaExprssionImpl;
interface i{
    public void m1(int a,int b);
}
class Demo1 implements i{
    public void m1(int a,int b){
        System.out.println("sum Add Without Lamda Expression: "+ a+b);
    }
}
public class AddTwoNumberWithoutLamdaExpression {
    public static void main(String[] args) {
        i i1=new Demo1();
        i1.m1(5,7);
    }

}
