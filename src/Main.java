import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Person person = new Person("A", "B", new Address("C", "D", 1));
//        Person person1 = new Person("A1", "B1", new Address("C1", "D1", 2));
//        Person person2= new Person("A2", "B2", new Address("C2", "D2", 3));
//
//        ArrayList<Person> list = new ArrayList<>();
//        list.add (person);
//        list.add (person1);
//        list.add (person2);
//
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("A", "B", new Address("C", "D", 1)));
        persons.add(new Person("A1", "B1", new Address("C1", "D1", 2)));
        persons.add(new Person("A2", "B2", new Address("C2", "D2", 3)));

        System.out.println(persons);



        try (BufferedReader reader = new BufferedReader(new FileReader("person.csv"))) {
            String s;
            while ((s= reader.readLine()) !=null){
                Person person = PersonIOUtil.readPersons(s);

                System.out.println(person);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}




