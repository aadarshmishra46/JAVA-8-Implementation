public class LamdaExprssion {
    public static void main(String[] args) {
        LamdaExprssion l=new LamdaExprssion();
        l.print();
        Runnable helloLamdaPrint = () -> {
            System.out.println("hello lamda print");
        };
        System.out.println();
    }
    public void print(){
        System.out.println("Normal Print");
    }

}
