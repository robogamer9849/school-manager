import java.util.ArrayList;

public class StudentService {

    Searcher search = new Searcher();

    private ArrayList<Student> students = new ArrayList<>();

    public void add(Student student){
        students.add(student);
    }

    public void edit(String nationalcode,Student student){
        int code = search.searchStudent(nationalcode,students);

        students.set(code, student);
    }

    public void delete(String nationalcode) {
        int code = search.searchStudent(nationalcode,students);

        students.remove(code);
    }

    public void show(String nationalcode) {
        int code = search.searchStudent(nationalcode,students);

        System.out.println(students.get(code).toString());
    }

    public void list() {
        System.out.println(students);
    }
}
