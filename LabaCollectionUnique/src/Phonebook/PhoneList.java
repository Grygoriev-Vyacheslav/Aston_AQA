package Phonebook;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneList {
    private final Map<Integer, String> phonebook;

    PhoneList() {
        phonebook = new HashMap<>();
    }


    public void add(int number, String lastName) {
        phonebook.put(number, lastName);
    }

    public void get(String lastname) {
        if (phonebook.containsValue(lastname)) {
            Set<Map.Entry<Integer, String>> set = phonebook.entrySet();
            for (Map.Entry<Integer, String> temp : set) {
                if (temp.getValue().equals(lastname)) {
                    System.out.println(temp.getValue() + "--" + temp.getKey());
                }
            }

        } else {
            System.out.println("LastName is not on the list");
        }

    }


    public static void main(String[] args) {
        PhoneList phoneList = new PhoneList();
        phoneList.add(123456, "Fedko");
        phoneList.add(1234560, "Fedko");
        phoneList.add(6663562, "Smith");
        phoneList.add(7734534, "Hermat");
        phoneList.add(6774303, "Scott");
        phoneList.add(55355663, "Aerall");
        phoneList.add(7777777, "Scott");
        phoneList.add(999999, "Smith");

        phoneList.get("Fedko");
        phoneList.get("Smith");
        phoneList.get("Scott");


    }


}