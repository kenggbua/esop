import java.time.LocalDate;

public class PersonTest {


    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Kevin");
        p1.setAge(25);


        LocalDate birthdate = LocalDate.of(1994,4,10);
        Person p2 = new Person("Kevin", birthdate);

       Person p3 = new Person("franzi", birthdate);

       p3.addFriend(p2);

        System.out.println(p3);

    }



}
