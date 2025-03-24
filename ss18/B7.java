package ss18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n cho mảng: ");
        int n;
        while (true){
            n = Integer.parseInt(sc.nextLine());
            if(n >0){
                break;
            }
            System.out.println("n p lớn hơn 0");
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập gía trị cho arr[%d]: ",i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        Map<Integer,Integer> arrMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(arrMap.containsKey(arr[i])){
                arrMap.put(arr[i],arrMap.get(arr[i])+1);
            }else{
                arrMap.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : arrMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
