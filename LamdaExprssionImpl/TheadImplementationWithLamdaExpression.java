package LamdaExprssionImpl;

public class TheadImplementationWithLamdaExpression {
    public static void main(String[] args) {
        Runnable r=()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread using lamda Expression");
            }
        };
        Thread t=new Thread(r);
        t.run();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }

    }
}
