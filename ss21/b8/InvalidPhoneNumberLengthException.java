package ss21.b8;

public class InvalidPhoneNumberLengthException extends Exception {
    public InvalidPhoneNumberLengthException(String message) {
        super(message);
    }
    public static void validatePhoneNumber(String phone) throws InvalidPhoneNumberLengthException {
        if(!phone.matches("\\d{10}$")) {
            throw new InvalidPhoneNumberLengthException(phone+" Số điện thoại chỉ đc chứa số");
        }
        if(phone.length() != 10){
            throw new InvalidPhoneNumberLengthException(phone+" Số điện thoại phải đúng 10 kí tự");
        }
    }
}
