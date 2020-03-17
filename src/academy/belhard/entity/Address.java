package academy.belhard.entity;

public class Address {
    private String street;
    private int houseNumber;
    private String houseBuildingNumber; // корпус дома, если есть

    public Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public Address(String street, int houseNumber, String houseBuildingNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
        setHouseBuildingNumber(houseBuildingNumber);
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

    public String getHouseBuildingNumber() {
        return houseBuildingNumber;
    }

    public void setHouseBuildingNumber(String houseBuildingNumber) {
        if (houseBuildingNumber == null || houseBuildingNumber.isEmpty()) {
            this.houseBuildingNumber = null;
        } else {
            this.houseBuildingNumber = houseBuildingNumber;
        }
    }

    public String getFullAddress() {
        String fullAddress = "ул. " + street + " д. " + houseNumber;
        if (houseBuildingNumber != null) {
            fullAddress += "/" + houseBuildingNumber;
        }

        return fullAddress;
    }
}
