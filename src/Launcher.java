import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрій on 01.07.2015.
 */
public class Launcher {



    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        Student student = new Student();
        student.setName("Andrey");
        student.setSecondName("Solovyov");
        classroom.enter(student);

        student = new Student();
        student.setName("Alexander");
        student.setSecondName("Turbovec");
        classroom.enter(student);

        student = new Student();
        student.setName("Victor");
        student.setSecondName("Stepura");
        classroom.enter(student);

        student = new Student();
        student.setName("Ivan");
        student.setSecondName("Nechiporuk");
        classroom.enter(student);

        System.out.println(classroom.getStudentCount());

        printClassroom(classroom);

        student = new Student();
        student.setName("Ivan");
        student.setSecondName("Nechiporuk");
        classroom.leave(student);

        System.out.println("leave");

        printClassroom(classroom);

        student = new Student();
        student.setName("Ivan");
        student.setSecondName("Nechiporuk");
        classroom.isPresent (student);

    }
        public static void printClassroom(Classroom data) {

        for (int i = 0; i < data.getStudentCount(); i++) {
            data.printStudentInfo(data.getStudents().get(i));
        }


    }
}
