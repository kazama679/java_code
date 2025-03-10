package ss8;

import java.util.Scanner;

public class Practice01 {
    public static void bubbleSortDescending(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int insertSorted(int[] arr, int n, int m) {
        int i;
        for (i = n - 1; (i >= 0 && arr[i] < m); i--) {
            arr[i + 1] = arr[i];
        }
        arr[i + 1] = m;
        return n + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n=-1;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Nhập giá trị n phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương (>0) trong mảng");
            System.out.println("4. In ra vị trí (chỉ số) các phần tử có giá trị bằng k trong mảng (k nhập từ bàn phím)");
            System.out.println("5. Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần");
            System.out.println("6. Tính số lượng các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng dần, các phần tử lẻ chia hết cho 3 ở cuối mảng theo thứ tự giảm dần, các phần tử còn lại ở giữa mảng theo thứ tự tăng dần");
            System.out.println("8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm dần) đúng vị trí");
            System.out.println("9. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhập n");
                    n = sc.nextInt();
                    if(n<100&& n>0){
                        System.out.println("Vui lòng nhập dưới 100, trên 0");
                    }
                    for(int i = 0; i < n; i++) {
                        System.out.printf("nhập giá trị cho arr[%d]: ", i);
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    if(n==-1){
                        System.out.println("Vui lòng nhập n trc");
                        break;
                    }
                    System.out.print("Mảng: ");
                    for(int i = 0; i < n; i++) {
                        System.out.print(arr[i]+" ");
                    }
                    break;
                case 3:
                    int sum = 0, count = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] > 0) {
                            sum += arr[i];
                            count++;
                        }
                    }
                    if (count > 0) {
                        System.out.println("Giá trị trung bình của phần tử dương: " + (double) sum / count);
                    } else {
                        System.out.println("Không có phần tử dương trong mảng.");
                    }
                    break;
                case 4:
                    if (n == -1) {
                        System.out.println("Vui lòng nhập n trước.");
                        break;
                    }
                    System.out.print("Nhập giá trị k: ");
                    int k = sc.nextInt();
                    boolean found = false;
                    System.out.print("Vị trí của các phần tử có giá trị bằng " + k + ": ");
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == k) {
                            System.out.print(i + " ");
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy phần tử nào có giá trị bằng " + k);
                    }
                    break;
                case 5:
                    if (n == -1) {
                        System.out.println("Vui lòng nhập n trước.");
                        break;
                    }
                    bubbleSortDescending(arr, n);
                    System.out.print("Mảng sau khi sắp xếp giảm dần:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;
                case 6:
                    int primeCount = 0;
                    for (int i = 0; i < n; i++) {
                        if (isPrime(arr[i])) primeCount++;
                    }
                    System.out.println("Số lượng phần tử là số nguyên tố: " + primeCount);
                    break;
                case 7:
                    if (n == -1) {
                        System.out.println("Vui lòng nhập n trước.");
                        break;
                    }
                    int[] chanChia3 = new int[n];
                    int[] leChia3 = new int[n];
                    int[] conLai = new int[n];
                    int countChan = 0, countLe = 0, countConLai = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 3 == 0) {
                            if (arr[i] % 2 == 0) {
                                chanChia3[countChan++] = arr[i];
                            } else {
                                leChia3[countLe++] = arr[i];
                            }
                        } else {
                            conLai[countConLai++] = arr[i];
                        }
                    }
                    for (int i = 0; i < countChan - 1; i++) {
                        for (int j = i + 1; j < countChan; j++) {
                            if (chanChia3[i] > chanChia3[j]) {
                                int temp = chanChia3[i];
                                chanChia3[i] = chanChia3[j];
                                chanChia3[j] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < countLe - 1; i++) {
                        for (int j = i + 1; j < countLe; j++) {
                            if (leChia3[i] < leChia3[j]) {
                                int temp = leChia3[i];
                                leChia3[i] = leChia3[j];
                                leChia3[j] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < countConLai - 1; i++) {
                        for (int j = i + 1; j < countConLai; j++) {
                            if (conLai[i] > conLai[j]) {
                                int temp = conLai[i];
                                conLai[i] = conLai[j];
                                conLai[j] = temp;
                            }
                        }
                    }
                    int index = 0;
                    for (int i = 0; i < countChan; i++) arr[index++] = chanChia3[i];
                    for (int i = 0; i < countConLai; i++) arr[index++] = conLai[i];
                    for (int i = 0; i < countLe; i++) arr[index++] = leChia3[i];
                    System.out.println("Mảng sau khi sắp xếp theo yêu cầu:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 8:
                    bubbleSortDescending(arr, n);
                    System.out.print("Nhập giá trị m: ");
                    int m = sc.nextInt();
                    n = insertSorted(arr, n, m);
                    System.out.print("Mảng sau khi thêm:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;
                case 9:
                    System.out.println("Thoát.");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn đúng.");
            }
        }while (true);
    }
}