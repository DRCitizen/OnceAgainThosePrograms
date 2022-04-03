import java.util.*;

public class BermudaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please Enter the Three sides of the Triangle:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("It is an Equilateral Triangle");
            } else if (a == b || b == c || c == a) {
                System.out.println("It is an Isosceles Triangle");
            } else {
                System.out.println("It is a Scalene Triangle");
            }
        }
    }
}
