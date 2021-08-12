package Service;

import Models.Student;

import java.util.ArrayList;

public class CRUD_Product {

    public ArrayList<Student> List=new ArrayList<>();

    public CRUD_Product() {
        List.add(new Student(1,"Duc","23-09-2000","Hanoi","0123435445","abcd@gmail.com","C0421k1"));
    }

    public void add(Student Student){
        List.add(Student);
    }
    public void remove(int index){
        List.remove(index);
    }
    public void edit(int index,Student Student){
        List.set(index,Student);
    }
}
