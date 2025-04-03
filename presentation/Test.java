package presentation;

import util.Validator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Validator.ValidInt(sc);
        float n2= Validator.ValidFloat(sc);
        Boolean b = Validator.ValidBoolean(sc);

        String s = Validator.ValidString(sc, 3, 100);
        String email = Validator.ValidEmail(sc);
        String phone = Validator.ValidPhone(sc);
        System.out.println(n+", "+n2+", "+b+", "+s+", "+email+", "+phone);
    }
}
