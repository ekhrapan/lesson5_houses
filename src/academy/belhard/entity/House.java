package academy.belhard.entity;

public class House {
    private int levels; // этажность
    private int yearConstruction; // год постройки
    private Address address;

    public House(int levels, int yearConstruction, Address address) {
        this.levels = levels;
        this.yearConstruction = yearConstruction;
        this.address = address;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getYearConstruction() {
        return yearConstruction;
    }

    public void setYearConstruction(int yearConstruction) {
        this.yearConstruction = yearConstruction;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAllHouseInfo() {
        return  "Год постройки: " + yearConstruction + "\n" +
                "Этажность: " + levels + "\n" +
                "Адрес: " + address.getFullAddress();
    }
}
