package LamdaExprssion;
class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}
public class TheadImplementationWithoutLamdaExpression {
    public static void main(String[] args) {
       Runnable r=new MyThread();
       Thread t= new Thread(r);
       t.start();
        for (int i=0;i<10;i++){
            System.out.println("Main Thread");
        }

    }
}
