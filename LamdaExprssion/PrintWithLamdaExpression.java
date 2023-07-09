package LamdaExprssion;
interface inter{
    public void m1();

}
public class PrintWithLamdaExpression {
    public static void main(String[] args) {
     intern i=()-> System.out.println("m1() method implementation");
     i.m1();
    }
}
