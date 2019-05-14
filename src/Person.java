import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {

    String name;
    int age;
    LocalDate birthdate;
    int count = 1;
    Person[] friends;
    int countFriends = 0;


    public Person () {

    }

    public Person(String name, LocalDate birthdate) {
        this.friends = new Person[10];
        this.countFriends = 0;
        if(name.isEmpty()){
            System.out.println("Name is empty");
        }else this.name = name;
        this.birthdate = birthdate;

       count++;





    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthdate() {

        return Period.between(birthdate,LocalDate.now()).getYears();
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }


    public String toString(){
        return Period.between(birthdate,LocalDate.now()).getYears()+ " "+ name + " " + this.getName() + " " + "(" + this.getBirthdate() + ")" + " has " + this.countFriends
                + " friends:" +getFriends() ;
    }

    public int getCount() {
        return count;
    }

    public void addFriend(Person Friend){
        this.friends[countFriends] = Friend;
        countFriends++;
    }

    public String getFriends(){
        for (Person p :
                friends) {
            return p.getName() + " " + "(" + p.getBirthdate() + "), " ;
        }
        return null;
    }

}
