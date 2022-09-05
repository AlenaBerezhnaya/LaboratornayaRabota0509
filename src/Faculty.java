import java.util.ArrayList;
public class Faculty {

    public ArrayList<Teacher> teacherArrayList = new ArrayList<>();
    public String name;

    Faculty(String name) {

        this.name = name;
    }

    public Teacher addTeacher(String name, Faculty faculty) { //создание преподавателя
        Teacher teacher = new Teacher(name);
        teacherArrayList.add(teacher);
        System.out.println("ФИО нового преподавателя: " + teacher.name + "; " + "Факультет: " + faculty.name);

        return teacher;
    }

    public void removeTeacher(Teacher teacher, Faculty faculty) { // удаление преподавателя
        System.out.println("Преподавателя " + teacher.name + " на факультете " + faculty.name + " БОЛЬШЕ НЕ СУЩЕСТВУЕТ");
        teacherArrayList.remove(teacher);
    }

    public void getTeacher(Teacher teacher) { // получение списка преподавателей
        System.out.println(teacher.name);
    }
}
