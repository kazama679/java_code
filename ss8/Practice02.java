package ss8;

import java.util.Scanner;

public class Practice02 {
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng (n): ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột (m): ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        while (true) {
            System.out.println("\n************** MENU **************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng theo ma trận");
            System.out.println("3. Đếm số phần tử chia hết cho 2 và 3");
            System.out.println("4. In phần tử và tổng đường biên, chéo chính, chéo phụ");
            System.out.println("5. Sắp xếp cột tăng dần");
            System.out.println("6. In các số nguyên tố");
            System.out.println("7. Sắp xếp đường chéo chính giảm dần (Insertion Sort)");
            System.out.println("8. Chèn mảng vào dòng chỉ định");
            System.out.println("9. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập các phần tử của mảng:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("matrix[%d][%d]: ", i, j);
                            matrix[i][j] = sc.nextInt();
                        }
                    }
                    break;
                case 2:
                    printMatrix(matrix);
                    break;
                case 3:
                    int count = 0;
                    for (int[] row : matrix) {
                        for (int value : row) {
                            if (value % 2 == 0 && value % 3 == 0) count++;
                        }
                    }
                    System.out.println("Số phần tử chia hết cho 2 và 3: " + count);
                    break;
                case 4:
                    int sum = 0;
                    System.out.print("Phần tử trên biên, đường chéo chính và phụ: ");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i == 0 || i == n - 1 || j == 0 || j == m - 1 || i == j || i + j == n - 1) {
                                System.out.print(matrix[i][j] + " ");
                                sum += matrix[i][j];
                            }
                        }
                    }
                    System.out.println("\nTổng: " + sum);
                    break;
                case 5:
                    for (int j = 0; j < m; j++) {
                        for (int i = 0; i < n - 1; i++) {
                            int minIndex = i;
                            for (int k = i + 1; k < n; k++) {
                                if (matrix[k][j] < matrix[minIndex][j]) minIndex = k;
                            }
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[minIndex][j];
                            matrix[minIndex][j] = temp;
                        }
                    }
                    printMatrix(matrix);
                    break;
                case 6:
                    System.out.print("Các số nguyên tố: ");
                    for (int[] row : matrix) {
                        for (int value : row) {
                            boolean isPrime = value >= 2;
                            for (int i = 2; i * i <= value; i++) {
                                if (value % i == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                            if (isPrime) System.out.print(value + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 7:
                    int len = Math.min(n, m);
                    int[] diag = new int[len];
                    for (int i = 0; i < len; i++) diag[i] = matrix[i][i];
                    for (int i = 1; i < len; i++) {
                        int key = diag[i], j = i - 1;
                        while (j >= 0 && diag[j] < key) {
                            diag[j + 1] = diag[j];
                            j--;
                        }
                        diag[j + 1] = key;
                    }
                    for (int i = 0; i < len; i++) matrix[i][i] = diag[i];
                    printMatrix(matrix);
                    break;
                case 8:
                    System.out.print("Nhập chỉ số dòng cần chèn: ");
                    int rowIndex = sc.nextInt();
                    if (rowIndex < 0 || rowIndex > n) {
                        System.out.println("Chỉ số dòng không hợp lệ!");
                        break;
                    }
                    int[] newRow = new int[m];
                    System.out.println("Nhập " + m + " phần tử của mảng 1D:");
                    for (int i = 0; i < m; i++) newRow[i] = sc.nextInt();

                    int[][] newMatrix = new int[n + 1][m];
                    for (int i = 0, k = 0; i <= n; i++) {
                        if (i == rowIndex) newMatrix[i] = newRow;
                        else newMatrix[i] = matrix[k++];
                    }
                    matrix = newMatrix;
                    n++;
                    printMatrix(matrix);
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}