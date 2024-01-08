import netology.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Alice", "1234567890"));
        assertEquals(2, phoneBook.add("Bob", "9876543210"));
        assertEquals(3, phoneBook.add("Charlie", "5555555555"));
    }
    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "1234567890");
        phoneBook.add("Bob", "9876543210");
        phoneBook.add("Charlie", "5555555555");

        assertEquals("Alice", phoneBook.findByNumber("1234567890"));
        assertEquals("Bob", phoneBook.findByNumber("9876543210"));
        assertEquals("Charlie", phoneBook.findByNumber("5555555555"));
        
    }



}
