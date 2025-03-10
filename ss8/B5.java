package ss8;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        do {
            System.out.print("\n******************** MENU ********************\n" +
                    "1. Nhập giá trị `n` phần tử của mảng (`n` nhập từ bàn phím)\n" +
                    "2. In giá trị các phần tử trong mảng\n" +
                    "3. Tính trung bình các phần tử dương (`>0`) trong mảng\n" +
                    "4. In ra vị trí (chỉ số) các phần tử có giá trị bằng `k` trong mảng (`k` nhập từ bàn phím)\n" +
                    "5. Tính số lượng các phần tử là **số nguyên tố** trong mảng\n" +
                    "6. Thoát chương trình\n" +
                    "Lưạ chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.printf("Nhập arr[%d]: ",i+1);
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.print("Gía trị của mảng : ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i]+" ");
                    }
                    break;
                case 3:
                    float sum=0, count=0;
                    for (int i = 0; i < arr.length; i++) {
                        if(arr[i]>0){
                            sum+=arr[i];
                            count++;
                        }
                    }
                    float avg = sum/count;
                    System.out.print("Gía trị trung bình dương: "+avg);
                    break;
                case 4:
                    System.out.println("Nhập k: ");
                    int k = sc.nextInt();
                    for(int i=0; i<k; i++){
                        if(arr[i]==k) {
                            System.out.printf("Vị trí %d có %d\n", i, arr[i]);
                        }
                    }
                    break;
                case 5:
                    int sum2 = 0;
                    for (int j = 0; j < arr.length; j++) {
                        if (isPrime(arr[j])) {
                            sum2 += arr[j];
                        }
                    }
                    System.out.println("Tổng các số nguyên tố trong mảng: " + sum2);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập đúng");
            }
        }while(true);
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
