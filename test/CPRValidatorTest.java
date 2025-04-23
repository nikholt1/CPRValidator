import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPRValidatorTest {

    private CPRValidator c;
    @BeforeEach
    void startUp() {
        c = new CPRValidator();
    }

    @AfterEach
    void tearDown() {
        c = null;
    }

    // isValid method tests
    @Test
    void isValid_test_Over_10_Characters_To_Return_False() {
        assertFalse(c.isValid("03209502191"));
    }
    @Test
    void isValid_test_Under_10_Characters_To_return_False() {
        assertFalse(c.isValid("032095021"));
    }
    @Test
    void isValid_test_Right_On_10_to_Return_true() {
        assertTrue(c.isValid("0320950219"));
    }




    // isValidDate method tests
    @Test
    void isValidDate_test_date_in_Future_to_return_false() {
        assertFalse(c.isValidDate("0320260219"));
    }

    @Test
    void isValidDate_test_date_not_in_future_to_return_true() {
        assertTrue(c.isValidDate("0320950219"));
    }

    // TODO
    ///implement:
    //isValidModulus method tests




}