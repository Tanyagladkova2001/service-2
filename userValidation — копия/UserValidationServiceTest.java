package userValidation;

public class UserValidationServiceTest {
    public static void checkingFailResults(){
        System.out.println("CHECK FAIL RESULT OF NAME AND LAST NAME");
        String invalidUserName = "Anna"; // PASSED
        String invalidUserLastName = "Dostoprimechatelnaya"; // FAIL
        boolean expectedResult = false;
        boolean actualResult = UserValidationService.validateNameMinLength(invalidUserName, 3)
                && UserValidationService.validateNameMaxLength(invalidUserLastName, 15);
        if (actualResult == expectedResult) {
            System.out.println("PASSED, FAIL,  inserted name was correct" + " "  +  invalidUserName );
        }else
            System.out.println("FAILED,FAIL  your name was incorrect"  + " "  +  invalidUserName);
        {
            if (actualResult != expectedResult) {
                System.out.println("PASSED, FAIL,  inserted last name was correct" + " "  +  invalidUserLastName );
            }else
                System.out.println("FAILED,FAIL  your last name was incorrect"  + " "  +  invalidUserLastName);
            System.out.println();
        }
    }

    public static void checkingRightNameAndLastNameResults() {
        System.out.println("CHEKING RIGHT NAME AND LAST NAME");
        String validUserName = "Angelina"; //PASSED
        String validUserLastName = "Drozdova"; //PASSED
        boolean expectedResult = true;
        boolean actualResult = UserValidationService.validateNameMinLength(validUserName, 3)&&
                UserValidationService.validateNameMaxLength(validUserName, 15)
                && UserValidationService.validateNameMinLength(validUserLastName, 3)
                && UserValidationService.validateNameMaxLength(validUserLastName, 15);
        if (actualResult != expectedResult) {
            System.out.println("PASSED, yeeah, you insert name correctly" + " "  + validUserName);
        } else
            System.out.println("FAILED, hooow? you insert name incorrectly" + " "  + validUserName);
        if (actualResult != expectedResult) {
            System.out.println("PASSED, yeeah, you insert last name correctly" + " "  + validUserLastName);
        } else
            System.out.println("FAILED, hooow? you insert last name incorrectly" + " "  + validUserLastName);
        System.out.println();
    }
    public static void checkingAgeMinResults() {
        System.out.println("CHECKING  MIN AGE ");
        int validAge = 2;
        boolean expectedResult = true;
        boolean actualResult = UserValidationService.validateAge(3);
        if (actualResult != expectedResult) {

            System.out.println("PASSED, yeeah, you insert age correctly" + " "  + validAge);
        } else
            System.out.println("FAILED, hooow? you insert age incorrectly" + " "  + validAge);
        System.out.println();
    }
    public static void checkingMaxAgeResults() {
        System.out.println("CHECKING  MAX AGE ");
        int validAge = 121;
        boolean expectedResult = true;
        boolean actualResult = UserValidationService.validateAge(120);
        if (actualResult != expectedResult) {
            System.out.println("PASSED, yeeah, you insert age correctly" + " "  + validAge);
        } else
            System.out.println("FAILED, hooow? you insert age incorrectly" + " "  + validAge);
    }

}
