package netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public int add(String name, String number) {
        contacts.put(name, number);
        return 0;
    }

    }

