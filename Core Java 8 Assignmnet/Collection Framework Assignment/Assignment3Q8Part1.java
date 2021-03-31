package CapgeminiAssignment;

import java.util.ArrayList;
import java.util.Iterator;


public class Assignment3Q8Part1

{
    public static void main(String[] args)
    {

        ArrayList<Integer> list = new ArrayList<Integer>();    //Creating an ArrayList of integers


        list.add(1452);

        list.add(6854);

        list.add(8741);

        list.add(6542);

        list.add(3845);


        Iterator<Integer> it = list.iterator();          //Getting an Iterator from list

        while (it.hasNext())
        {
            Integer integer = (Integer) it.next();

            list.add(8457);      //This will throw ConcurrentModificationException
        }
    }
}
