package ss21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String s = sc.nextLine().trim();
        String[] split = s.split("\\s+");
        List<Integer> list = new ArrayList<>();
        int valid =0;
        int unValid =0;
        for (int i = 0; i < split.length; i++) {
            try {
                list.add(Integer.parseInt(split[i]));
                valid++;
            }catch (NumberFormatException e){
                System.out.println(split[i]+" không hợp lệ");
                unValid++;
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Số lượng chuỗi hợp lệ: "+valid);
        System.out.println("Số lượng chuỗi k hợp lệ: "+unValid);
        System.out.println("Danh sách chuỗi hợp lệ: "+list);
    }
}
