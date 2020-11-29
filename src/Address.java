public class Address {

    private Object city;
    private Object street;
    private int number;

    public Address(Object city, Object street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public Object getStreet() {
        return street;
    }

    public void setStreet(Object street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

