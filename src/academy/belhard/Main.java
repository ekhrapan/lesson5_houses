package academy.belhard;

import academy.belhard.entity.Address;
import academy.belhard.entity.House;

public class Main {

    public static void main(String[] args) {
        Address address0 = new Address("1-ая Улица", 5, 2);
        Address address1 = new Address("2-ая Улица", 56);
        Address address2 = new Address("3-я Улица", 21, 3);

        House[] houses = new House[3];
        houses[0] = new House(25, 2013, address0);
        houses[1] = new House(19, 2020, address1);
        houses[2] = new House(40, 2009, address2);

        for (House house : houses) {
            System.out.println(house.getAllHouseInfo());
            System.out.println("------------");
        }
    }
}
