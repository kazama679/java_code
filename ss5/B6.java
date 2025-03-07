package ss5;

import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70,80,90,10,20,30,40,50,60,70,80,90,10,20};
        int[] markingArray = new int[1000];
        for(int i = 0; i < a.length; i++) {
            markingArray[a[i]]++;
        }
        int max=markingArray[0];
        for(int i = 1; i < markingArray.length; i++) {
            if(markingArray[i]>max){
                max=markingArray[i];
            }
        }
        System.out.println("Phần tử xuất hiện nhiều nhất: ");
        for(int i = 0; i < markingArray.length; i++) {
            if(markingArray[i]==max){
                System.out.println(" Số "+i+" có "+markingArray[i]+" lần xuất hiện");
            }
        }
    }
}
