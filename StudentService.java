import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    // 1. Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student.getName());
    }

    // 2. Update student GPA
    public void updateStudentGpa(int id, double newGpa) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setGpa(newGpa);
                System.out.println("GPA updated for: " + s.getName());
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // 3. Delete student
    public void deleteStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted: " + s.getName());
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // 4. Search student
    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Found Student: " + s.getName() + ", Major: " + s.getMajor() + ", GPA: " + s.getGpa());
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // 5. Calculate average GPA
    public double calculateAverageGpa() {
        if (students.isEmpty()) return 0.0;
        double total = 0;
        for (Student s : students) {
            total += s.getGpa();
        }
        return total / students.size();
    }
}
