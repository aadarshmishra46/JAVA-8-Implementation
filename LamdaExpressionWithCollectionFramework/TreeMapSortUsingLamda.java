package LamdaExpressionWithCollectionFramework;

import java.util.TreeMap;

public class TreeMapSortUsingLamda {
    public static void main(String[] args) {
        TreeMap<Integer,String> t=new TreeMap<>(
                (a,b)->a>b?-1:a<b?1:0
        );
        t.put(100,"Aadarsh");
        t.put(200,"Deepak");
        t.put(20,"Pinny");
        t.put(150,"Kusau");
        System.out.println(t);
    }
}
