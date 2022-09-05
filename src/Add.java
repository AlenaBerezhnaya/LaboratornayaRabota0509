import java.util.Scanner;

public class Add {
    public static void main(String[] args) {

        University bsu = new University("Белгородский Государственный Университет", "улица Победы 85, г. Белгород", 84729954);
        University bstu = new University("Белгородский Государственный Технологический Университет имени В.Г. Шухова", "улица Костюкова 46, г. Белгород", 847255611);
        University gay = new University("Государственный Аграрный Университет", "улица Вавилова 1, п. Майский", 847255664);
        University bookap = new University("Белгородский университет кооперации, экономики и права", "улица Садовая 116, г. Белгород", 84724343);

        Faculty physicalCulture = bsu.addFaculty("Факультет физической культуры", bsu);
        Faculty education = bsu.addFaculty("Факультет дошкольного, начального и специального образования", bsu);
        Faculty language = bsu.addFaculty("Факультет иностранных языков", bsu);
        Faculty design = bstu.addFaculty("Дизайн архитектурной среды", bstu);
        Faculty businessIT = bstu.addFaculty("Бизнес-информатика", bstu);
        Faculty architecture = bstu.addFaculty("Архитектура", bstu);
        Faculty agronomist = gay.addFaculty("Агрономический факультет", gay);
        Faculty engineer = gay.addFaculty("Инженерный факультет", gay);
        Faculty technologist = gay.addFaculty("Технологический факультет", gay);
        Faculty marketing = bookap.addFaculty("Кафедра маркетинга и менеджмента", bookap);
        Faculty economy = bookap.addFaculty("Кафедра экономики", bookap);
        Faculty analysis = bookap.addFaculty("Кафедра бухгалтерского учета, анализа и статистики", bookap);

        System.out.println();

        System.out.println("ВЫЗОВ МЕТОДА addTeacher - СПИСОК СОЗДАННЫХ ПРЕПОДАВАТЕЛЕЙ:");
        Teacher AlenaPetrovna = education.addTeacher("Алена Петровна", education);
        Teacher MariaSereevna = language.addTeacher("Мария Сергеевна", language);
        Teacher IvanIvanovich = design.addTeacher("Иван Иванович", design);
        Teacher PetrPetrovich = economy.addTeacher("Петр Петрович", economy);

        System.out.println();

        System.out.println("ВЫЗОВ МЕТОДА getFaculty - ПОЛУЧЕНИЕ КОНКРЕТНОГО ФАКУЛЬТЕТА:");
        bsu.getFaculty(physicalCulture);
        bstu.getFaculty(design);
        gay.getFaculty(technologist);
        bookap.getFaculty(analysis);

        System.out.println();

        System.out.println("ВЫЗОВ МЕТОДА removeFaculty - УДАЛЕНИЕ КОНКРЕТНОГО ФАКУЛЬТЕТА:");
        bsu.removeFaculty(language, bsu);
        bstu.removeFaculty(architecture, bstu);
        gay.removeFaculty(agronomist, gay);
        bookap.removeFaculty(marketing, bookap);

        System.out.println();

        System.out.println("ВЫЗОВ МЕТОДА getTeacher - ПОЛУЧЕНИЕ КОНКРЕТНОГО ПРЕПОДАВАТЕЛЯ:");
        language.getTeacher(AlenaPetrovna);

        System.out.println();

        System.out.println("ВЫЗОВ МЕТОДА removeTeacher - УДАЛЕНИЕ КОНКРЕТНОГО ПРЕПОДАВАТЕЛЯ:");
        engineer.removeTeacher(MariaSereevna, engineer);

        Scanner fio = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите ФИО преподавателя через пробел:");

        String teacherName = fio.nextLine();

        Teacher newTeacher = analysis.addTeacher(teacherName, analysis);
    }
}