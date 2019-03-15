package love.programming;

public class MethodOverLoading {
    public static void main(String[] args) {
        int i;
        MethodAddition obj1 = new MethodAddition();
                i= obj1.add(5,6);
        System.out.println(i);
        System.out.println( obj1.add(5,6,7));
        System.out.println(obj1.add(5,6,7,8));
        System.out.println(obj1.add("narmada" ,"kalapala"));
        System.out.println(obj1.add("nikhil", "nishita", "narmada"));
        System.out.println(obj1.add(6,7));
    }
}
