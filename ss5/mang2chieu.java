package ss5;

import java.util.Scanner;

public class mang2chieu {
    public static void main(String[] args) {
        // bài toán thêm 1 phẩn tử vào mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao số phẩn tử");
        int n = sc.nextInt();
        int[] oldArr= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào giá trị cho phần tử thứ "+ (i+1));
            oldArr[i] = sc.nextInt();
        }
        int a, b;
        System.out.println("Nhập giá trị phần tử muốn thêm");
        a = sc.nextInt();
        System.out.println("Nhập chỉ số phần tử muốn thêm");
        b = sc.nextInt();
        int[] newArr;
        if(b<0){
            newArr = new int[n];
            for(int i = 0; i < n; i++) {
                newArr[i] = oldArr[i];
            }
            System.out.println("k tồn tại chỉ số");
        }else if(b<n){
            // khai báo mảng mới có số phần tử ms = mảng cũ + 1
            // copy mảng cũ sang mới
            newArr = new int[n+1];
            for(int i = 0; i < n+1; i++) {
                if(i<b){
                    newArr[i] = oldArr[i];
                }else if(i==b){
                    newArr[i] = a;
                }else{
                    newArr[i] = oldArr[i-1];
                }
            }
        }else{
            newArr = new int[b+1];
            for(int i = 0; i < n; i++) {
                newArr[i] = oldArr[i];
            }
            // gán gtri phần tử index với giá trị là value
            newArr[b] = a;
        }
        System.out.println("mảng sau khi chèn: ");
        for (int element: newArr) {
            System.out.println(element+" ");
        }
    }
}
