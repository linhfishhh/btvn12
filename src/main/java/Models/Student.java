package Models;

public class Student {
    private int Id;
    private String name;
    private String dateofbirth;
    private String address;
    private String phonenumber;
    private String email;
    private String classroom;

    public Student(int id, String name, String dateofbirth, String address, String phonenumber, String email, String classroom) {
        Id = id;
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
        this.classroom = classroom;
    }

    public Student() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
