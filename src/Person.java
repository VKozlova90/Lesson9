public class Person {

        private Object name;
        private Object lastName;
        private Address address;

    public Person(Object name, Object lastName, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getLastName() {
        return lastName;
    }

    public void setLastName(Object lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", lastName=" + lastName +
                ", address=" + address +
                '}';
    }


}
