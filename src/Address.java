public class Address <T> {

    private Object city;
    private Object street;
    private int number;

    public Address(Object city, Object street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public T getcity() {
        return (T) city;
    }

    public void setcity(T city) {
        this.city = city;
    }

    public T getstreet() {
        return (T) street;
    }

    public void setstreet(T street) {
        this.street = street;
    }

    public int getnumber() {
        return number;
    }

    public void setnumber(int number) {
        this.number = number;
    }



}

