package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee = new Employee();

    @Test
    void validateFirstName() {
        employee.setFirstName("Jerry");

        assertEquals(-1, employee.validateFirstName());
    }

    @Test
    void validateFirstName2() {
        employee.setFirstName("");

        assertEquals(1, employee.validateFirstName());
    }

    @Test
    void validateFirstName3() {
        employee.setFirstName("E");

        assertEquals(3, employee.validateFirstName());
    }

    @Test
    void validateLastName() {
        employee.setLastName("Jeremy");

        assertEquals(-1, employee.validateLastName());
    }

    @Test
    void validateLastName2() {
        employee.setLastName("");

        assertEquals(2, employee.validateLastName());
    }

    @Test
    void validateLastName3() {
        employee.setLastName("R");

        assertEquals(4, employee.validateLastName());
    }

    @Test
    void validateID() {
        employee.setId("YI-4723");

        assertEquals(-1, employee.validateID());
    }

    @Test
    void validateID2() {
        employee.setId("tu-2743");

        assertEquals(-1, employee.validateID());
    }

    @Test
    void validateID3() {
        employee.setId("12-ABCD");

        assertEquals(5, employee.validateID());
    }

    @Test
    void validateZipCode() {
        employee.setZipCode("12345");

        assertEquals(-1, employee.validateZipCode());
    }

    @Test
    void validateZipCode2() {
        employee.setZipCode("123456");

        assertEquals(6, employee.validateZipCode());
    }

    @Test
    void validateZipCode3() {
        employee.setZipCode("ABCDE");

        assertEquals(6, employee.validateZipCode());
    }

    @Test
    void testValidateInput() {
        Employee testEmp = new Employee();

        testEmp.setFirstName("Ryan");
        testEmp.setLastName("Hodge");
        testEmp.setId("AB-1234");
        testEmp.setZipCode("33414");

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 4; i++) {
            list.add(-1);
        }

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        testEmp.validateInput(list2);

        assertArrayEquals(list.toArray(), list2.toArray());

    }
}