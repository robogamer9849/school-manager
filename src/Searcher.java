import java.util.ArrayList;

public class Searcher {

    public int searchTeacher(String id, ArrayList<Teacher> teachers) {
        int code = -1;
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getNationalCode().equals(id)) {
                code = i;
                break;
            }
        }
        return code;
    }


    public int searchStudent(String id, ArrayList<Student> students) {
        int code = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getNationalCode().equals(id)) {
                code = i;
                break;
            }
        }
        return code;
    }

    public int searchBook(int id, ArrayList<Book> books) {
        int code = -1;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                code = i;
                break;
            }
        }
        return code;
    }


}
