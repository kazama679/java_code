package ss23.b3;

public class SharedResource {
    public synchronized void printAlphabet() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
    }
}
