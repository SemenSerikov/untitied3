public class LoginValidationException extends RuntimeException{
    LoginValidationException(){
super("Default message");
    }
    LoginValidationException(String message){
super(message);
    }
}
