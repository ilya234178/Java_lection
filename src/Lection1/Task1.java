package Lection1;

public class Task1 {
    public static void main(String[] args) {
        var a = 123;
        System.out.println(a);
        var d = 123.45;
        System.out.println(d);
        System.out.println(getType(a));
        System.out.println(getType(d));
        d = 1022;
        System.out.println(d);
    }
    static String getType(Object o){
        return o.getClass() .getSimpleName();
    }
}
