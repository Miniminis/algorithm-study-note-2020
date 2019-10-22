package comparabletest;

import java.util.*;

class DescendingOrder implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {

        if(o1 instanceof Comparable && o2 instanceof Comparable) {
            Integer c1 = (Integer)o1;
            Integer c2 = (Integer)o2;
            return c2.compareTo(c1);
        }

        return -1;

    }

}
