package userValidation;
import model.User;

    public class UserValidationServiceDemo {
        public static void main(String[] args) {
            UserValidationService service = new UserValidationService();
            System.out.println("FIRST USER");

            User alina = new User("Alina","Denisova" ,20 );// empty field
            service.validate(alina);

            System.out.println("SECOND USER");
            User An = new User ("An", "Dostoprimechatelnaya", 121); // totally is outside the scope
            service.validate(An);
        }
    }


