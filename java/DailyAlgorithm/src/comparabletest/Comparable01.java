package comparabletest;

public class Comparable01 {

    public static void main(String[] args) {

        Car car01 = new Car("아반떼", 2016, "노란색");
        Car car02 = new Car("소나타", 2010, "흰색");

        System.out.println(car01.compareTo(car02));

    }

}