package userValidation;

import model.User;

public class UserValidationService {
    public void validate(User user) {
        if (validateNameMinLength(user.getFirstName(), 3)) {
            System.out.println("Name " + UserValidationException.MIN_NAME_LENGTH);} // min length name
        if (validateNameMaxLength(user.getFirstName(), 15)){  // max name length
            System.out.println("Name " + UserValidationException.MAX_NAME_LENGTH);}

        if (validateNameMinLength(user.getLastName(), 3)) { // min length  last name
            System.out.println("Last Name " + UserValidationException.MIN_NAME_LENGTH);}
        if (validateNameMaxLength(user.getLastName(), 15)){    // max name length
            System.out.println("Last Name " + UserValidationException.MAX_NAME_LENGTH);}

        if (validateAge(user.getAge())) {
            System.out.println("Min Age " + UserValidationException.MIN_AGE);
            System.out.println("Max Age " + UserValidationException.MAX_AGE); // min and max age
        } else
            System.out.println(" Your age is between 0 and 120 ");
    }

    public static boolean validateNameMinLength(String name, int minLength) {
        return name.length() < minLength ;
    }
    public static boolean validateNameMaxLength(String name,  int maxLength) {
        return name.length() > maxLength ;
    }
    public static boolean validateAge(int age) {
        return age < UserValidationException.MIN_AGE || age > UserValidationException.MAX_AGE;
    }
}
