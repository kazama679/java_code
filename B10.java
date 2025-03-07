package ss5;

import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Mảng không hợp lệ");
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int sum =0;
        int start =0;
        int end=0;
        int tmp =0;
        int s =0;
        for (int i = 0; i < numbers.length; i++) {
            tmp += numbers[i];
            if(tmp > sum){
                sum = tmp;
                start = s;
                end = i;
            }
            if(tmp<0){
                tmp=0;
                s = i+1;
            }
        }
        System.out.println("Tổng dãy con liên tiếp lớn nhất: " + sum);
        System.out.print("Dãy số liền kề là: ");
        for(int i=start;i<=end;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
