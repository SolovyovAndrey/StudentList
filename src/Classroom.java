/**
 * Created by ����� on 01.07.2015.
 */
import java.util.List;
import java.util.ArrayList;


public class Classroom {
    private List<Student> students;

    public Classroom() {
        students = new ArrayList<>();
    }

    public void enter (Student s){
        students.add(s);
    }

    public void leave (Student s){
        students.remove(s);
    }

    public int getStudentCount (){
        return students.size();
    }

     boolean isPresent (Student s){
        for ( Student student : students){
            if (student.equals(s)){
                return true;
            }
        }
        return false;
    }

    public void printStudentInfo (Student s){
        System.out.println(s.getSecondName()+ " " + s.getName());

    }

    public List<Student> getStudents (){
        return new ArrayList<>(students);
    }


}
