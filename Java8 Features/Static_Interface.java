package Java8Features;

interface Sum {
    int add1(int x, int y);
}

public class Static_Interface {
    public static void main(String[] args) {
        Sum a = (x, y) -> x + y; 
        System.out.println(a.add1(3, 5));
    }
}
