import java.util.Scanner;

/**
 *  Scanner End of file example
 */
public class ScannerRead {
    public static void main(String[] args) {
        JavaEndOfFileExample();


    }
    public static void JavaEndOfFileExample(){
        Scanner sc = new Scanner(System.in);
        int i=1;
        while (sc.hasNext()){
            System.out.println(i + sc.nextLine());
            i++;
        }
    }
}
