package ss8;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
//        Nhập vào số nguyên dương n, đại diện cho kích thước của mảng. Nếu n không hợp lệ (≤ 0),
//                thông báo "Kích thước không hợp lệ" và yêu cầu nhập lại.
//                Nhập các giá trị  phần tử của mảng, giá trị có thể là số âm, số dương hoặc bằng 0
//        Tính tổng các phần tử trong mảng chia hết cho 3 và hiển thị kết quả.
//                Nếu không có phần tử nào chia hết cho 3, in ra "Không có số chia hết cho 3".
        Scanner sc = new Scanner(System.in);
        int n;
        while(true){
            System.out.println("Nhập n: ");
            n = sc.nextInt();
            if(n>0){
                break;
            }
            System.out.println("Kích thước không hợp lệ!");
        }
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.printf("Nhập giá trị cho phần tử thứ %d: ", i+1);
            arr[i] = sc.nextInt();
        }
        boolean check=false;
        int sum=0;
        for(int i=0; i<n; i++){
            if(arr[i]%3==0){
                check=true;
                sum+=arr[i];
            }
        }
        if(!check){
            System.out.println("Không có số chia hết cho 3");
            return;
        }
        System.out.println("Tổng số chia hết cho 3: "+sum);
    }
}
