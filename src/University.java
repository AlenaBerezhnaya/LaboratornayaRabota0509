import java.util.ArrayList;
public class University {

    public ArrayList<Faculty> facultyArrayList = new ArrayList<>();
    public ArrayList<Student> studentArrayList = new ArrayList<>();
    public String name;
    public String address;
    public Integer phone;

    public University(String name, String address, Integer phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Student addStudent(String name, int studentId) {  // добавление студента
        Student student = new Student(name, studentId);
        studentArrayList.add(student);

        return student;
    }

    public void removeStudent(Student student) { // удаление студента
        studentArrayList.remove(student);
    }

    public void getStudent(Student student) { // получение конкретного студента
        System.out.println(student.studentID + " - " + student.name);
    }

    public Faculty addFaculty(String name, University university) {
        Faculty faculty = new Faculty(name);
        facultyArrayList.add(faculty);
        System.out.println("Факультет: " + faculty.name +  ", " + "университет: " + university.name);

        return faculty;
    }

    public void removeFaculty(Faculty faculty, University university) {
        System.out.println();
        System.out.println("Факультета " + faculty.name + " в университете " + university.name + " БОЛЬШЕ НЕ СУЩЕСТВУЕТ");
        facultyArrayList.remove(faculty);
    }

    public void getFaculty(Faculty faculty) { // получение факультета
        System.out.println(faculty.name);
    }
}