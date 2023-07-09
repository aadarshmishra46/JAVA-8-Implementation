package LamdaExpressionWithCollectionFramework;

import java.util.*;

public class ArrayListSortUsingLamda {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(10);
        l.add(3);
        l.add(4);
        l.add(5);

   //     Collections.sort(l,(a,b)-> a.compareTo(b));
        Collections.sort(l,(a,b)-> a>b?-1:a<b?1:0);
       // Arrays.sort(l.toArray());
        System.out.println(l);
    }
}
