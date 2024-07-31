public class ContactList {

    private Contact contact;
    private String value;

    public ContactList(Contact contact, String value) {
        this.contact = contact;
        this.value = value;
    }

    public ContactList() {
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "contact=" + contact +
                ", value='" + value + '\'' +
                '}';
    }
}
