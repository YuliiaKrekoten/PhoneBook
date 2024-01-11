package netology;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class PhoneBook {
    private Map<String, String> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public int add(String name, String number) {
        contacts.put(name, number);
        return contacts.size();
    }

    public String findByNumber(String number) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return null;

            }
            public String findByName(String name)  {
            return contacts.get(name);
            }
            public String printAllNames() {
                TreeSet<String> sortedNames = new TreeSet<>(contacts.keySet());
                StringBuilder sb = new StringBuilder();
                for (String name : sortedNames) {
                    sb.append(name).append("\n");
                }
                return sb.toString();
            }

    }





