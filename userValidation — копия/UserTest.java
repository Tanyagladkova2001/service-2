package userValidation;

public class UserTest {
    public static void main(String[] args) {
        System.out.println("TEST REPORT");
        System.out.println();
        UserValidationServiceTest.checkingFailResults();
        UserValidationServiceTest.checkingRightNameAndLastNameResults();
        UserValidationServiceTest.checkingAgeMinResults();
        UserValidationServiceTest.checkingMaxAgeResults();

    }
}
