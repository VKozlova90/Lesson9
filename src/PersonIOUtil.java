import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PersonIOUtil {

    public class writePersons {
        private List <Person> persons;
        private String filepath;

        public writePersons(List<Person> persons, String filepath) {
            this.persons = persons;
            this.filepath = filepath;
        }

        public void writeToFile() throws IOException {
            try (FileWriter writer = new FileWriter(filepath)) {

                for (Person person: persons){
                    String s = PersonIOUtil.writePersons(person);
                    writer.write(s);
                }





            public static String writePersons (Person person){

        return person.getName() + ";" + person.getLastName() + ";" + person.getAddress() + "\n";
    }

    public static Person readPersons (String s){
        String [] fields = s.split(";");

        String name = fields [0];
        String lastName = fields [1];
        String address = fields [2];

        return new Person(name, lastName, address);

    }

}
