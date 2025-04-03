package util;

import java.util.Scanner;

public class Validator {
    public static int ValidInt(Scanner sc) {
        while(true){
            try {
                System.out.println("Nhập vào số nguyên: ");
                int n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (NumberFormatException e1) {
                System.out.println("Không phải số, nhập lại");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static float ValidFloat(Scanner sc) {
        while(true){
            try {
                System.out.println("Nhập vào số thực: ");
                float n = Float.parseFloat(sc.nextLine());
                return n;
            } catch (NumberFormatException e1) {
                System.out.println("Không phải số thực, nhập lại");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Boolean ValidBoolean(Scanner sc) {
        while(true){
            try {
                System.out.println("Nhập vào true/false: ");
                String b = sc.nextLine();
                if(b.equals("true")||b.equals("false")||b.isEmpty()){
                    return Boolean.parseBoolean(b);
                }
                throw new Exception("Không đúng định dạng kiểu Boolean, nhập lại");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String ValidString(Scanner sc, int min, int max) {
        while(true){
            try {
                System.out.println("Nhập vào chuỗi bất kì: ");
                String s = sc.nextLine();
                if(s.isEmpty()){
                    throw new Exception("Không đc rỗng, nhập lại");
                }
                if(s.length()<min||s.length()>max){
                    throw new Exception("Không đúng định dạng chuỗi, nhập lại");
                }
                return s;
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String ValidEmail(Scanner sc) {
        while(true){
            try {
                System.out.println("Nhập vào email: ");
                String email = sc.nextLine();
                if(!email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,6})+$")){
                    throw new Exception("Không đúng định dạng email, nhập lại");
                }
                return email;
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String ValidPhone(Scanner sc) {
        while(true){
            try {
                System.out.println("Nhập vào số điện thoại Việt Nam: ");
                String phone = sc.nextLine();
                if(!phone.matches("^036|034|032|093\\d{7}$")){ //em k nhớ số
                    throw new Exception("Không đúng định dạng số điện thoại Việt Nam, nhập lại");
                }
                return phone;
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
