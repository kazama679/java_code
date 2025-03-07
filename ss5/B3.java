package ss5;


import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Nhap gía trị cho phần tử thứ "+ (i+1));
            arr[i] = sc.nextInt();
        }
        int countEven=0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.println(countEven);
    }
}
