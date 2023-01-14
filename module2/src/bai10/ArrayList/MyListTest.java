package bai10.ArrayList;

public class MyListTest {

    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        System.out.println(listInteger);
        System.out.println(listInteger.size());
//        listInteger.add(7,2);
//        System.out.println(listInteger);
//        System.out.println(listInteger.get(2));
//        System.out.println(listInteger.indexOf(2));
//        System.out.println(listInteger.contains(7));
//        System.out.println(listInteger.contains(10));
//        System.out.println(listInteger.remove(0));
    }
}
