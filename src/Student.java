public class Student implements Comparable<Student> {
    private String StudentName;
    private static final String CollegeName = "GEU Dehradun";
    private int RollNumber;

    public String getStudentName() {
        return StudentName;
    }

    public int getRollNumber() {
        return RollNumber;
    }

    Student(String name, int rollNumber){
        StudentName = name;
        RollNumber = rollNumber;
    }


    @Override
    public int compareTo(Student o) {
        System.out.println("Inside Comparable method ");
        // descending order sorting
        return o.StudentName.compareTo(StudentName);
    }
}
