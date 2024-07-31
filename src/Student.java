import java.util.Date;
import java.util.List;

public class Student {

    private String nationalCode;
    private String name;
    private String fatherName;
    private String motherName;
    private Date birthdate;
    private List<ContactList> contactLists;

    public Student(String nationalCode, String name, String fatherName, String motherName, Date birthdate, List<ContactList> contactLists) {
        this.nationalCode = nationalCode;
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.birthdate = birthdate;
        this.contactLists = contactLists;
    }


    public Student() {
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public List<ContactList> getContactLists() {
        return contactLists;
    }

    public void setContactLists(List<ContactList> contactLists) {
        this.contactLists = contactLists;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nationalCode='" + nationalCode + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", birthdate=" + birthdate +
                ", contactLists=" + contactLists +
                '}';
    }
}
