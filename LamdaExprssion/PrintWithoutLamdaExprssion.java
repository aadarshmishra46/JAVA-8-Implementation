package LamdaExprssion;
interface intern {
    public void m1();
}
class Demo implements intern{
    public void m1(){
        System.out.println("m1() method implementation");
    }
}
public class PrintWithoutLamdaExprssion {
    public static void main(String[] args) {
        intern i=new Demo();
        i.m1();

    }
}
