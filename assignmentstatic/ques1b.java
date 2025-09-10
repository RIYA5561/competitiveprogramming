package assignmentstatic;
// static for utility method

public class MathUtils {
    static int square(int num) {
        return num * num;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.square(5); // no object needed
        System.out.println("Square is: " + result);
    }
}
