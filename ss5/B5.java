package ss5;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean check=true;
        for(int i = 0; i < n; i++) {
            System.out.println("Nhap gía trị cho phần tử thứ "+ (i+1));
            arr[i] = sc.nextInt();
            if(arr[i]%2!=0) {
                check=false;
            }
        }
        if(check){
            System.out.println("k có phần tử lẻ");
            return;
        }
        int a=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>0 && arr[i]%2!=0 && arr[i]>a) {
                a = arr[i];
            }
        }
        int b=a;
        for (int i = 0; i < n; i++) {
            if(arr[i]>0 && arr[i]%2!=0 && arr[i]<b) {
                b = arr[i];
            }
        }
        System.out.println("Phần tử nguyên dương lẻ lớn nhất: "+a);
        System.out.println("Phần tử nguyên dương lẻ nhỏ nhất: "+b);
    }
}
