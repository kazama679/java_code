package ss8;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
//        Nhập vào n đại diện cho kích thước của mảng. Nếu n không phải số nguyên dương thì
//        thông báo “Kích thước không hợp lệ” và yêu cầu người dùng nhập lại cho đến khi hợp lệ.
//        Nhập vào các phần tử mảng(có cả giá trị âm, dương và bằng 0)
//        Yêu cầu in ra giá trị lớn nhất và nhỏ nhất trong mảng

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
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
