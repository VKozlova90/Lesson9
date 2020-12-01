public class Address {

    private String city;
    private String street;
    private int number;

    public Address(String city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public static String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public static int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}

