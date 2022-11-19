package shapran;

public class Main {

    public static void main(String[] args) {
        Array createArray = new Array();
        int[] arr = createArray.createArray();
        createArray.arraySort(arr);
        createArray.raiseCube(arr);
        Lock lock = new Lock(arr);
        lock.arrayPrint(arr);
    }
}
