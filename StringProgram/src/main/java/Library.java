public class Library {
    private Address address;

    // Constructor to inject Address object
    public Library(Address address) {
        this.address = address;
    }

    // Getter and setter (optional, depending on your needs)
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Library{" +
               "address=" + address +
               '}';
    }
}
