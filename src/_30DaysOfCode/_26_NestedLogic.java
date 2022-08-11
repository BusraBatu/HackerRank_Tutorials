import java.util.Scanner;

public class _26_NestedLogic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String date1 = scan.nextLine();
        String dueDate = scan.nextLine();
        String arr2[] = dueDate.split(" ");
        String arr[] = date1.split(" ");
        int day = Integer.valueOf(arr[0]);
        int month = Integer.valueOf(arr[1]);
        int year = Integer.valueOf(arr[2]);

        int dueDay = Integer.valueOf(arr2[0]);
        int dueMonth = Integer.valueOf(arr2[1]);
        int dueYear = Integer.valueOf(arr2[2]);

        int fine = 0;

        if (day < 32 && month < 13 && year <= 3000) {
            if (dueYear < year) {
                fine = 10000;
            } else if (dueYear == year && dueMonth < month) {
                fine = (month - dueMonth) * 500;
            } else if (dueYear == year && dueMonth == month && dueDay < day) {
                fine = (day - dueDay) * 15;
            }
        } else {
            System.out.println("Wrong date. Please try again!");
        }
        System.out.println(fine);

    }
}
