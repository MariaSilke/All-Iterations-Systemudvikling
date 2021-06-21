package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataValidatorTest {
    @Test
    void isValidCPRNotValid() {
        DataValidator dv = new DataValidator();
        String input = "121201-ABCD";
        boolean result = dv.isValidCPR(input);
        Assertions.assertFalse(result);
    }

    @Test
    void isValidCPRToShortCPR() {
        DataValidator dv = new DataValidator();
        String input = "1212";
        boolean result = dv.isValidCPR(input);
        Assertions.assertFalse(result);
    }

    @Test
    void isValidCPRWrongFormat() {
        DataValidator dv = new DataValidator();
        String input = "121201-876";
        boolean result = dv.isValidCPR(input);
        Assertions.assertFalse(result);
    }

    @Test
    void isValidCPRValid() {
        DataValidator dv = new DataValidator();
        String input = "121201-1212";
        boolean result = dv.isValidCPR(input);
        Assertions.assertTrue(result);
    }

    @Test
    void isValidNameValid() {
        DataValidator dv = new DataValidator();
        String input1 = "Maria";
        String input2 = "Julie";
        boolean result1 = dv.isValidName(input1);
        boolean result2 = dv.isValidName(input2);
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
    }

    @Test
    void isValidPhoneValid() {
        DataValidator dv = new DataValidator();
        String input = "+4523234444";
        boolean result = dv.isValidPhone(input);
        Assertions.assertTrue(result);
    }

    @Test
    void isValidNotPhoneValid() {
        DataValidator dv = new DataValidator();
        String input = "+45ABCDEF44";
        boolean result = dv.isValidPhone(input);
        Assertions.assertFalse(result);
    }
}