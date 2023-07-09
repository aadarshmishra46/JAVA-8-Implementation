package LamdaExpressionWithCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int age;
    String name;

     public Student(int age, String name) {
         this.age =age;
         this.name =name;
     }

     @Override
     public String toString() {
         return "Student [age = "+age +", name= "+name +"] ";
     }


}
public class CustomizeClassSortingUsingLamda {
    public static void main(String[] args) {

        ArrayList<Student> al= new ArrayList<>(
        );
       al.add(new Student(1,"Aadarsh"));
       al.add(new Student(10,"Deepak"));
       al.add(new Student(3,"Seetal"));
       al.add(new Student(2,"Poonm"));
        Collections.sort(al,(a,b)->a.age>b.age?-1:a.age<b.age?1:0);
        System.out.println(al);


    }

     
}
