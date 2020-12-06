import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private final static String FILE_NAME = "person.csv";

    public static void main(String[] args) throws IOException {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("A", "B", new Address("C", "D", 1)));
        persons.add(new Person("A1", "B1", new Address("C1", "D1", 2)));
        persons.add(new Person("A2", "B2", new Address("C2", "D2", 3)));

        System.out.println(persons);

        PersonIOUtil personIOUtil = new PersonIOUtil (persons, FILE_NAME);
        PersonIOUtil.writePersons();


        personIOUtil = new PersonIOUtil(FILE_NAME);
        List<Person> readPersons= personIOUtil.readPersons();
        System.out.println(readPersons);

    }
}




