package classwork.bank.service.validator;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class UserValidatorTest {

    UserValidator validator = new UserValidator();

    @Parameterized.Parameter
    public String emailForTrue;
    @Parameterized.Parameter(1)
    public String passwordForTrue;
    @Parameterized.Parameter(2)
    public String emailForFalse;
    @Parameterized.Parameter(3)
    public String passwordForFalse;


    @Parameterized.Parameters
    public static String[][] data() {
        return new String[][]{
                {"first1user@gmail.com", "P#ssw0rd1", "@email", "pass"},
                {"wjastwn@qq998.xyz", "G2j3n!nvjfn@","@@@@@@@@@gmail.com", "AAAAA11___)"},
                {"abunnuredda-9120@yopmail.com", "pas5WooRD#","lkfglsdlhshl@@@@@.com","uuuuuuuu"},
                {"xegep49147@topmail1.net", "T6$2oookK","TRUEEMAIL.COM@gmail",""},
        };
    }

    @Test
    public void testValidateEmailCheckIfTrue() {
        assertTrue(validator.validateEmail(emailForTrue));
    }

    @Test
    public void testValidatePasswordCheckIfTrue() {
        assertTrue(validator.validatePassword(passwordForTrue));
    }


    @Test
    public void testValidateEmailCheckIfFalse(){
        assertFalse(validator.validateEmail(emailForFalse));
    }

    @Test
    public void testValidatePasswordCheckIfFalse(){
        assertFalse(validator.validatePassword(passwordForFalse));
    }


}
