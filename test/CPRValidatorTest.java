import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPRValidatorTest {

//    private CPRValidator c;
//    @BeforeEach
////    void startUp() {
////        c = new CPRValidator();
////    }

//    @AfterEach
//    void tearDown() {
//        c = null;
//    }

    // isValid method tests
    @Test
    void isValidLen_test_Over_10_Characters_To_Return_False() {
        assertFalse(CPRValidator.isValidLen("03209502191"));
    }
    @Test
    void isValidLen_test_Under_10_Characters_To_return_False() {
        assertFalse(CPRValidator.isValidLen("032095021"));
    }
    @Test
    void isValidLen_test_Right_On_10_to_Return_true() {
        assertTrue(CPRValidator.isValidLen("0320950219"));
    }


    @Test
    void isValidLen_test_spaces_return_false() {
        assertFalse(CPRValidator.isValidLen("032001021 9"));
    }

    @Test
    void isValidLen_test_NullInput_return_false() {
        assertFalse(CPRValidator.isValidLen(null));
    }

    @Test
    void isValidLen_test_EmptyString_return_false() {
        assertFalse(CPRValidator.isValidLen(""));
    }

    @Test
    void isValidLen_test_alphabeticalInput_return_false() {
        assertFalse(CPRValidator.isValidLen("01020312A4"));
    }






    // isValidDate method tests
    @Test
    void isValidDate_test_date_in_Future_to_return_false() {
        assertFalse(CPRValidator.isValidDate("0320260219"));
    }

    @Test
    void isValidDate_test_date_not_in_future_to_return_true() {
        assertTrue(CPRValidator.isValidDate("0320950219"));
    }

    @Test
    void isValidDate_test_date_too_far_in_past_return_false() {
        assertFalse(CPRValidator.isValidDate("0320010219"));
    }
    // TODO
    ///implement:
    //isValidModulus method tests
    @Test
    void isValidModulus_test_weichted_sum_not_zero_return_false() {
        assertFalse(CPRValidator.isValidModulus("1111111111"));
    }
    @Test
    void isValidModulus_test_weichted_sum_equals_zero_return_true() {
        assertTrue(CPRValidator.isValidModulus("1203045677"));
    }







}





