package CapgeminiAssignment;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

class Assignment3Q2{
 public static void main(String args[]){

    HashSet<String> seta=new HashSet();    //Creating HashSet and adding elements
           set.add("One");
           set.add("Two");
           set.add("Three");
           set.add("Four");
           set.add("Five");
           System.out.println("Hash set is unordered");
           Iterator<String> i=seta.iterator();
           while(i.hasNext())
           {
           System.out.println(i.next());
           }

           LinkedHashSet<String> setb=new LinkedHashSet();
           set1.add("One");
           set1.add("Two");
           set1.add("Three");
           set1.add("Four");
           set1.add("Five");
           System.out.println("Linked Hash set is ordered");
           Iterator<String> t=setb.iterator();
           while(t.hasNext())
           {
           System.out.println(t.next());
           }
 }
}
