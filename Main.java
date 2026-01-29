import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();

        boolean running = true;

        while (running) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student GPA");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Calculate Average GPA");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Major: ");
                    String major = scanner.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = scanner.nextDouble();
                    scanner.nextLine();

                    service.addStudent(new Student(id, name, major, gpa));
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new GPA: ");
                    double newGpa = scanner.nextDouble();
                    scanner.nextLine();

                    service.updateStudentGpa(updateId, newGpa);
                    break;

                case 3:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();

                    service.deleteStudent(deleteId);
                    break;

                case 4:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();

                    service.searchStudent(searchId);
                    break;

                case 5:
                    double avg = service.calculateAverageGpa();
                    System.out.println("Average GPA: " + avg);
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option, try again!");
            }
        }

        scanner.close();
    }
}
