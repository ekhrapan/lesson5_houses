package academy.belhard.entity;

public class Address {
    private String street;
    private int houseNumber;
    private Integer houseBuildingNumber; // корпус дома, если есть

    public Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public Address(String street, int houseNumber, Integer houseBuildingNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.houseBuildingNumber = houseBuildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (!street.trim().isEmpty()) {
            this.street = street.trim();
        }
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        if (houseNumber > 0) {
            this.houseNumber = houseNumber;
        }
    }

    public Integer getHouseBuildingNumber() {
        return houseBuildingNumber;
    }

    public void setHouseBuildingNumber(Integer houseBuildingNumber) {
        this.houseBuildingNumber = houseBuildingNumber;
    }

    public String getFullAddress() {
        String fullAddress = "ул. " + street + " д. " + houseNumber;
        if (houseBuildingNumber != null) {
            fullAddress += "/" + houseBuildingNumber;
        }

        return fullAddress;
    }
}
