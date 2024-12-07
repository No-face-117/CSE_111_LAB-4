class Student {
    public String s_name;
    public String s_department;
    public int s_ID;

    public String email;
    public String password;

    public String[] courses = new String[4];
    private int courseCount = 0;

    public Student(String name, int id, String department) {
        this.s_name = name;
        this.s_ID = id;
        this.s_department = department;
        System.out.println("Student object is created!");
    }

    public void addCourse(String course) {
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
        }
    }

    public int getCourseCount() {
        return courseCount;
    }
}
