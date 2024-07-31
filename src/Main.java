import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BookService books = new BookService();
        StudentService students = new StudentService();
        TeacherService teachers = new TeacherService();
        int menu = 0;
        int action;

        while (menu != 4) {
            if (menu == 0) {
                System.out.println("*****************");
                System.out.println("what menu to open?");
                System.out.println("1.teacher");
                System.out.println("2.student");
                System.out.println("3.book");
                System.out.println("4.exit");
                System.out.println("*****************");

                menu = input.nextInt();
                input.nextLine();
            }

            //teachers
            else if (menu == 1) {
                System.out.println("teachers menu");
                System.out.println("*****************");
                System.out.println("what to do?");
                System.out.println("1.add");
                System.out.println("2.edit");
                System.out.println("3.remove");
                System.out.println("4.show one");
                System.out.println("5.show all");
                System.out.println("6.go back");
                System.out.println("*****************");

                action = input.nextInt();
                input.nextLine();
                //add
                if (action == 1) {
                    System.out.println("national Code:");
                    String nationalCode = input.nextLine();
                    System.out.println("name:");
                    String name = input.nextLine();

                    System.out.println("family:");
                    System.out.println("    father Name:");
                    String fatherName = input.nextLine();
                    System.out.println("    mother Name");
                    String motherName = input.nextLine();

                    System.out.println("birthdate:");
                    System.out.println("    year:");
                    int year = input.nextInt();
                    System.out.println("    month:");
                    int month = input.nextInt();
                    System.out.println("    day:");
                    int day = input.nextInt();
                    input.nextLine();
                    Date date = new Date(year - 1900, month - 1, day);

                    System.out.println("contact info:");
                    System.out.println("    email:");
                    ContactList email = new ContactList(Contact.EMAIL, input.nextLine());
                    System.out.println("    phone number:");
                    ContactList phoneNumber = new ContactList(Contact.PHONE_NUMBER, input.nextLine());
                    System.out.println("    address:");
                    ContactList address = new ContactList(Contact.ADDRESS, input.nextLine());

                    List<ContactList> contactList = new ArrayList<>();
                    contactList.add(email);
                    contactList.add(phoneNumber);
                    contactList.add(address);

                    Teacher teacher = new Teacher(nationalCode, name, fatherName, motherName, date, contactList);
                    teachers.add(teacher);
                }

                //edit
                if (action == 2) {
                    System.out.println("type the national code:");
                    String wanted = input.nextLine();

                    System.out.print("editing: ");
                    teachers.show(wanted);

                    System.out.println("national Code:");
                    String nationalCode = input.nextLine();
                    System.out.println("name:");
                    String name = input.nextLine();

                    System.out.println("family:");
                    System.out.println("    father Name:");
                    String fatherName = input.nextLine();
                    System.out.println("    mother Name");
                    String motherName = input.nextLine();

                    System.out.println("birthdate:");
                    System.out.println("    year:");
                    int year = input.nextInt();
                    System.out.println("    month:");
                    int month = input.nextInt();
                    System.out.println("    day:");
                    int day = input.nextInt();
                    input.nextLine();
                    Date date = new Date(year - 1900, month - 1, day);

                    System.out.println("contact info:");
                    System.out.println("    email:");
                    ContactList email = new ContactList(Contact.EMAIL, input.nextLine());
                    System.out.println("    phone number:");
                    ContactList phoneNumber = new ContactList(Contact.PHONE_NUMBER, input.nextLine());
                    System.out.println("    address:");
                    ContactList address = new ContactList(Contact.ADDRESS, input.nextLine());

                    List<ContactList> contactList = new ArrayList<>();
                    contactList.add(email);
                    contactList.add(phoneNumber);
                    contactList.add(address);

                    Teacher teacher = new Teacher(nationalCode, name, fatherName, motherName, date, contactList);
                    teachers.edit(wanted,teacher);
                }

                //remove
                else if (action == 3) {

                    System.out.println("type the national code:");
                    String wanted = input.nextLine();

                    System.out.print("removed: ");
                    teachers.show(wanted);

                    teachers.delete(wanted);
                }

                //show
                else if (action == 4) {
                    System.out.println("type the national code:");
                    String wanted = input.nextLine();

                    teachers.show(wanted);
                }

                //show all
                else if (action == 5) {
                    teachers.list();
                }

                //back
                else if (action == 6) {
                    menu = 0;
                }
            }

            //students
            else if (menu == 2) {
                System.out.println("students menu");
                System.out.println("*****************");
                System.out.println("what to do?");
                System.out.println("1.add");
                System.out.println("2.edit");
                System.out.println("3.remove");
                System.out.println("4.show one");
                System.out.println("5.show all");
                System.out.println("6.go back");
                System.out.println("*****************");

                action = input.nextInt();
                input.nextLine();
                //add
                if (action == 1) {
                    System.out.println("national Code:");
                    String nationalCode = input.nextLine();
                    System.out.println("name:");
                    String name = input.nextLine();

                    System.out.println("family:");
                    System.out.println("    father Name:");
                    String fatherName = input.nextLine();
                    System.out.println("    mother Name");
                    String motherName = input.nextLine();

                    System.out.println("birthdate:");
                    System.out.println("    year:");
                    int year = input.nextInt();
                    System.out.println("    month:");
                    int month = input.nextInt();
                    System.out.println("    day:");
                    int day = input.nextInt();
                    input.nextLine();
                    Date date = new Date(year - 1900, month - 1, day);

                    System.out.println("contact info:");
                    System.out.println("    email:");
                    ContactList email = new ContactList(Contact.EMAIL, input.nextLine());
                    System.out.println("    phone number:");
                    ContactList phoneNumber = new ContactList(Contact.PHONE_NUMBER, input.nextLine());
                    System.out.println("    address:");
                    ContactList address = new ContactList(Contact.ADDRESS, input.nextLine());

                    List<ContactList> contactList = new ArrayList<>();
                    contactList.add(email);
                    contactList.add(phoneNumber);
                    contactList.add(address);

                    Student teacher = new Student(nationalCode, name, fatherName, motherName, date, contactList);
                    students.add(teacher);
                }

                //edit
                if (action == 2) {
                    System.out.println("type the national code:");
                    String wanted = input.nextLine();

                    System.out.print("editing: ");
                    students.show(wanted);

                    System.out.println("national Code:");
                    String nationalCode = input.nextLine();
                    System.out.println("name:");
                    String name = input.nextLine();

                    System.out.println("family:");
                    System.out.println("    father Name:");
                    String fatherName = input.nextLine();
                    System.out.println("    mother Name");
                    String motherName = input.nextLine();

                    System.out.println("birthdate:");
                    System.out.println("    year:");
                    int year = input.nextInt();
                    System.out.println("    month:");
                    int month = input.nextInt();
                    System.out.println("    day:");
                    int day = input.nextInt();
                    input.nextLine();
                    Date date = new Date(year - 1900, month - 1, day);

                    System.out.println("contact info:");
                    System.out.println("    email:");
                    ContactList email = new ContactList(Contact.EMAIL, input.nextLine());
                    System.out.println("    phone number:");
                    ContactList phoneNumber = new ContactList(Contact.PHONE_NUMBER, input.nextLine());
                    System.out.println("    address:");
                    ContactList address = new ContactList(Contact.ADDRESS, input.nextLine());

                    List<ContactList> contactList = new ArrayList<>();
                    contactList.add(email);
                    contactList.add(phoneNumber);
                    contactList.add(address);

                    Student teacher = new Student(nationalCode, name, fatherName, motherName, date, contactList);
                    students.edit(wanted,teacher);
                }

                //remove
                else if (action == 3) {

                    System.out.println("type the national code:");
                    String wanted = input.nextLine();

                    System.out.print("removed: ");
                    students.show(wanted);

                    students.delete(wanted);
                }

                //show
                else if (action == 4) {
                    System.out.println("type the national code:");
                    String wanted = input.nextLine();

                    students.show(wanted);
                }

                //show all
                else if (action == 5) {
                    students.list();
                }

                //back
                else if (action == 6) {
                    menu = 0;
                }
            }

            //books
            else if (menu == 3) {
                System.out.println("books menu");
                System.out.println("*****************");
                System.out.println("what to do?");
                System.out.println("1.add");
                System.out.println("2.edit");
                System.out.println("3.remove");
                System.out.println("4.show one");
                System.out.println("5.show all");
                System.out.println("6.go back");
                System.out.println("*****************");

                action = input.nextInt();
                input.nextLine();
                //add
                if (action == 1) {
                    System.out.println("id:");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("name:");
                    String name = input.nextLine();


                    System.out.println("author:");
                    String author = input.nextLine();
                    System.out.println("price:");
                    int price = input.nextInt();
                    input.nextLine();

                    Book book = new Book(id, name, author, price);
                    books.add(book);
                }

                //edit
                if (action == 2) {
                    System.out.println("type the id:");
                    int wanted = input.nextInt();
                    input.nextLine();

                    System.out.println("id:");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("name:");
                    String name = input.nextLine();


                    System.out.println("author:");
                    String author = input.nextLine();
                    System.out.println("price:");
                    int price = input.nextInt();
                    input.nextLine();

                    Book book = new Book(id, name, author, price);
                    books.edit(wanted,book);
                }

                //remove
                else if (action == 3) {

                    System.out.println("type the id:");
                    int wanted = input.nextInt();

                    System.out.print("removed: ");
                    books.show(wanted);

                    books.delete(wanted);
                }

                //show
                else if (action == 4) {
                    System.out.println("type the id:");
                    int wanted = input.nextInt();

                    books.show(wanted);
                }

                //show all
                else if (action == 5) {
                    books.list();
                }

                //back
                else if (action == 6) {
                    menu = 0;
                }
            }
        }
        System.out.println("exited!");
    }
}

