package love.programming;

public class MethodAddition {
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public int add(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        return sum;
    }

    public String add(String a, String b) {
        return (a + " " + b);
    }

    public String add(String a, String b, String c) {
        return (a + " " + b + " " + c);
    }

    public Boolean add(char x, char y) {

        if (x == y) {
            return true;
        } else {
            return false;
        }

    }
}