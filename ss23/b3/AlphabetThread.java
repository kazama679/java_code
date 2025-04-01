package ss23.b3;

public class AlphabetThread extends Thread{
    private SharedResource resource;

    public AlphabetThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.printAlphabet();
    }
}
