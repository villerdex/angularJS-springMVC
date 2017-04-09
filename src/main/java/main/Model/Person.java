package main.Model;

/**
 * Created by Didoy on 3/20/2017.
 */
public class Person {
    int age, id;
    String address, Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo(){
        return Name + " " + age + " " + address;
    }
}
