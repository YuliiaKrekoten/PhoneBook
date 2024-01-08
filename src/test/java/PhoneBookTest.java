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

}
