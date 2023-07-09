package LamdaExpressionWithCollectionFramework;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetSortUsingLamda {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<>(
                (a,b)->a>b?-1:a<b?1:0  // using lamda reverse sorting order
        );
        t.add(10);
        t.add(12);
        t.add(5);
        t.add(4);
        t.add(4);
        System.out.println("default natural sorting order : "+t);



    }
}
