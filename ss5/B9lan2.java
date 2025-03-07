package ss5;

import java.util.Scanner;

public class B9lan2 {
    public static void main(String[] args) {
        int [] numbers= {1,2,3,4,5,-1};
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
        for(int i=start;i<=end;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
