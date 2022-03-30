package com.training.exproject.clases;

import java.util.Scanner;
import java.util.*;
public class Customer {
    private int id;
    private static int ID;

    private String  name, surname, patronymic, address, creditCardNumber, account_number;

    public Customer(String Name, String Surname, String Patronymic, String Address,
                    String creditCardNumber_, String accountNumber) {
        id = ID++;
        name = Name;
        surname = Surname;
        patronymic = Patronymic;
        address = Address;
        creditCardNumber = creditCardNumber;
        account_number = accountNumber;
    }

    public String toString() {
        String string = "";
        string = string + id + ":" + name + " " + surname + " " + patronymic +
                "." + address + " : " + creditCardNumber + " : " + account_number;
        return string;
    }

    public void print() {
        System.out.println(toString());
    }

    public void setName(String Name) {
        name = Name;
    }

    public void setSurname(String Surname) {
        surname = Surname;
    }

    public void setPatronymic(String Patronymic) {
        patronymic = Patronymic;
    }

    public void setAddress(String Address) {
        address = Address;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        creditCardNumber = creditCardNumber;
    }

    public void setAccountNumber(String accountNumber) {
        account_number = accountNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String get_account_number() {
        return account_number;
    }

    public static Customer getCustomer(Scanner scanner) {
        Customer customer = new Customer("", "", "", "", "", "");

        System.out.print("name: ");
        customer.name = Common.readNotEmptyString(scanner);

        System.out.print("surname: ");
        customer.surname = Common.readNotEmptyString(scanner);

        System.out.print("patronymic: ");
        customer.patronymic = Common.readNotEmptyString(scanner);

        System.out.print("address: ");
        customer.address = Common.readNotEmptyString(scanner);

        System.out.print("credit_сard_number: ");
        customer.creditCardNumber = Common.readNotEmptyString(scanner);

        System.out.print("account_number: ");
        customer.account_number = Common.readNotEmptyString(scanner);

        return customer;
    }

    public static class ByNameComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer left, Customer right) {
            if (left.surname != right.surname)
                return left.surname.compareTo(right.surname);
            if (left.name != right.name)
                return left.name.compareTo(right.name);
            return left.patronymic.compareTo(right.patronymic);
        }
    }
}
