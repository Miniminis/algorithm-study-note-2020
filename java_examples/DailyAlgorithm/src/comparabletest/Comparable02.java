package comparabletest;

import java.util.Iterator;
import java.util.TreeSet;

public class Comparable02 {

    public static void main(String[] args) {

        //TreeSet<Integer> ts = new TreeSet<Integer>(new DescendingOrder()); //내림차순 
    	TreeSet<Integer> ts = new TreeSet<Integer>();	//오름차순 
    	
        ts.add(30);
        ts.add(40);
        ts.add(20);
        ts.add(10);

        Iterator<Integer> iter = ts.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());

        }

    }

}