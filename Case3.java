import java.util.Scanner;

/**
 * package : PACKAGE_NAME
 * author  : Mirzayev Abdulaziz
 * date    : 13.11.2022
 * 17:50
 */
public class Case3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oy -> ");
        int month = scanner.nextInt();

        switch (month) {
            case 1,2,12 -> System.out.println("Qish fasli");
            case 3,4,5 -> System.out.println("Baxor fasli");
            case 6,7,8 -> System.out.println("Yoz fasli");
            case 9,10,11 -> System.out.println("Kuz fasli");
            default -> System.out.println("Bunday fasl yo'q");

        }
    }
}
