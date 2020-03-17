package academy.belhard;

import academy.belhard.entity.Address;
import academy.belhard.entity.House;

import java.util.Scanner;

public class Main {

    private static House[] houses;

    public static void main(String[] args) {
        init();

        boolean continueExecution = true;
        while (continueExecution) {
            int actionIndex = chooseAction();

            switch (actionIndex) {
                case 1:
                    outputHousesList();
                    break;
                case 2:
                    editHouse();
                    break;
                case 3:
                    addHouse();
                    break;
                case 4:
                    continueExecution = false;
                    break;
                default:
                    System.out.println("Неизвестная команда. Попробуйте еще раз");
            }
        }
    }

    public static void init() {
        Address address0 = new Address("1-ая Улица", 5, "2");
        Address address1 = new Address("2-ая Улица", 56);
        Address address2 = new Address("3-я Улица", 21, "3");

        houses = new House[5];
        houses[0] = new House(25, 2013, address0);
        houses[1] = new House(19, 2020, address1);
        houses[2] = new House(40, 2009, address2);
    }

    public static int chooseAction() {
        outputActionOptions();

        return inputNumber("Выберите действие: ");
    }

    public static void outputActionOptions() {
        System.out.println();
        System.out.println("1. Вывести список домов");
        System.out.println("2. Редактировать существующий дом");
        System.out.println("3. Добавить новый дом");
        System.out.println("4. Выход");
    }

    public static void outputHousesList() {
        System.out.println();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                System.out.println((i + 1) + ". " + houses[i].getAllHouseInfo());
                System.out.println("------------");
            }
        }
    }

    public static void editHouse() {
        int houseIndex = inputNumber("Введите номер редактируемого дома: ") - 1;
        House editedHouse = inputHouse();
        houses[houseIndex] = editedHouse;
    }

    public static void addHouse() {
        boolean houseArrayIsFull = checkIfHousesArrayIsFull();

        if (houseArrayIsFull) {
            System.out.println("Невозможно добавить еще 1 дом!");
            return;
        }

        House newHouse = inputHouse();
        int lastFreeIndex = getLastFreeIndex();
        houses[lastFreeIndex] = newHouse;
    }

    public static boolean checkIfHousesArrayIsFull() {
        int lastIndex = houses.length - 1;

        return houses[lastIndex] != null;
    }

    public static int getLastFreeIndex() {
        int lastFreeIndex;

        for (lastFreeIndex = 0; lastFreeIndex < houses.length; lastFreeIndex++) {
            if (houses[lastFreeIndex] == null) {
                return lastFreeIndex;
            }
        }

        return lastFreeIndex;
    }

    public static int inputNumber(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    public static String inputString(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static House inputHouse() {
        int levels = inputNumber("Введите кол-во этажей: ");
        int yearConstruction = inputNumber("Введите год постройки: ");
        Address address = inputAddress();

        return new House(levels, yearConstruction, address);
    }

    public static Address inputAddress() {
        String street = inputString("Введите название улицы: ");
        int houseNumber = inputNumber("Введите номер дома: ");
        String houseBuilding = inputString("Введите корпус: ");

        return new Address(street, houseNumber, houseBuilding);
    }
}
