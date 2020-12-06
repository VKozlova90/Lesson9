import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonIOUtil {

    private List<Person> persons;
    private String filepath;

    public PersonIOUtil(List<Person> persons, String filepath) {
        this.persons = persons;
        this.filepath = filepath;
    }

    public static String FormatAddressForWriting (Address address){
        return address.getCity()+ ";"+ address.getStreet()+ ";"+address.getNumber();
    }
    public static String FormatPersonForWriting (Person person) {
        return person.getName() + ";" + person.getLastName() + ";" +
                FormatAddressForWriting(person.getAddress()) + "\n";
    }

    public static Person FormatObject (String s){

        String[] fields = s.split(";");
        String name = fields[0];
        String lastName = fields[1];
        String city = fields[2];
        String street = fields[3];
        int number = Integer.parseInt(fields[4]);
        return new Person (name, lastName, city, street, number);

    }

    public static void writePersons(List<Person> persons, String filepath) {
        try (FileWriter writer = new FileWriter(filepath)) {

            for (Person person : persons) {
                String s = PersonIOUtil.FormatPersonForWriting(person);
                writer.write(s);
            }
        } catch (IOException e) {
            System.out.println("Запись в файл не удалась");
        }
    }

    public PersonIOUtil(String filepath) {
        this.filepath = filepath;
    }

    public static void  readPersons(String filepath) {
        List<Person> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String s;
            while ((s = reader.readLine()) != null) {
                Person person = PersonIOUtil.FormatObject(s);
                System.out.println(person);

                result.add(person);
            }
        } catch (IOException e) {
            System.out.println("Чтение не удалось");
        }
    }

}
