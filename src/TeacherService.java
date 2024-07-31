import java.util.ArrayList;

public class TeacherService {
    Searcher search = new Searcher();

    private ArrayList<Teacher> teachers = new ArrayList<>();

    public void add(Teacher teacher){
        teachers.add(teacher);
    }

    public void edit(String nationalcode,Teacher teacher){
        int code = search.searchTeacher(nationalcode,teachers);

        teachers.set(code, teacher);
    }

    public void delete(String nationalcode) {
        int code = search.searchTeacher(nationalcode,teachers);

        teachers.remove(code);
    }

    public void show(String nationalcode) {
        int code = search.searchTeacher(nationalcode,teachers);

        System.out.println(teachers.get(code).toString());
    }

    public void list() {
        System.out.println(teachers);
    }
}
