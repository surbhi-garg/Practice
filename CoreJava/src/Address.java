public class Address {
    String place;
    int zip;

    @Override
    public String toString() {
        return "Address{" +
                "place='" + place + '\'' +
                ", zip=" + zip +
                '}';
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Address(String place, int zip) {
        this.place = place;
        this.zip = zip;
    }
}
