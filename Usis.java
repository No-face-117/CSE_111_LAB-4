// CSE-111 LAB - 4 TASK - 8     []
// T_8 A USIS object !

public class Usis {
    public Student[] advisees = new Student[5];
    public int totalAdvCount = 0;

    public Usis() {
        System.out.println("Usis is ready to use!");
    }

    public void login(Student stu) {
        if (stu.email == null || stu.password == null) {
            System.out.println("Email and password need to be set.");
        } else {
            System.out.println("Login successful!");
        }
    }

    public void advising(Student stu) {
        if (stu.email == null || stu.password == null) {
            System.out.println("Please login to advise courses!");
        } else if (stu.getCourseCount() == 0) {
            System.out.println("You haven't selected any courses.");
        } else {
            System.out.println("Advising successful!");
            addAdvisee(stu);
        }
    }

    public void advising(Student stu, String c1, String c2, String c3) {
        stu.addCourse(c1);
        stu.addCourse(c2);
        stu.addCourse(c3);
        System.out.println("Advising successful!");
        addAdvisee(stu);
    }

    public void advising(Student stu, String c1, String c2, String c3, String c4) {
        System.out.println("You need special approval to take more than 3 courses.");
    }

    private void addAdvisee(Student stu) {
        if (totalAdvCount < advisees.length) {
            // Check if the student is already in the advisee list
            for (int i = 0; i < totalAdvCount; i++) {
                if (advisees[i] == stu) return; // Avoid duplicate entry
            }
            advisees[totalAdvCount++] = stu;
        } else {
            System.out.println("Max advisees reached!");
        }
    }

    public void allAdviseeInfo() {
        System.out.println("Total Advisee: " + totalAdvCount);
        for (int i = 0; i < totalAdvCount; i++) {
            Student stu = advisees[i];
            System.out.println("Name: " + stu.s_name + " | ID: " + stu.s_ID);
            System.out.println("Department: " + stu.s_department);
            System.out.print("Advised Courses: ");
            for (int j = 0; j < stu.getCourseCount(); j++) {
                System.out.print(stu.courses[j] + " ");
            }
            System.out.println("\n==============");
        }
    }
}
