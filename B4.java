package ss5;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Nhap gía trị cho phần tử thứ "+ (i+1));
            arr[i] = sc.nextInt();
        }
        if(n==0){
            System.out.println("mảng rỗng");
            return;
        }
        int flag;
        for(int i = 0; i < n/2; i++) {
            flag = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = flag;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
