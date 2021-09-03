import java.util.Scanner;

/**
 *  Hacker rank https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 *  Java Static Initialization block
 */
public class StaticInitializationBlock {

    public static Scanner sc = new Scanner(System.in);
    public static int B = sc.nextInt();
    public static int H = sc.nextInt();
    public static boolean flag = true;

    static {
        if (H <= 0 || B <= 0) {
            try {
                flag = false;
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }
}
