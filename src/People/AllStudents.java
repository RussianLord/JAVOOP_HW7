package People;

import java.util.ArrayList;
import java.util.List;

public class AllStudents {
    List<Student> humanList = new ArrayList<>();
    public void addStudent(Student human){
        humanList.add(human);
    }

    public List<Student> getStudentList() {
        return humanList;
    }

    public void getFullList(){
        for (Student it: humanList) {
            System.out.println(it);
        }
    }
}
