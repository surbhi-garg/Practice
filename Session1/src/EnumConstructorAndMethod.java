public class EnumConstructorAndMethod {
    enum House{
        HOUSE1(5000000),HOUSE2(10000000),HOUSE3(4000000);
        private long price;
        House(long price) {
           this.price = price;
        }
        long getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        System.out.println("House--------Cost");
        for(House curHouse:House.values())
        {
            System.out.println(curHouse+"--------"+curHouse.getPrice());
        }
    }
}
