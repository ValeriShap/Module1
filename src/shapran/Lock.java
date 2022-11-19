package shapran;

import java.util.Arrays;

 class Lock {
    private final int[] arrayCopy;

    public Lock(int[] arr) {
        this.arrayCopy = Arrays.copyOf(arr,arr.length);
    }
    public void arrayPrint(int[] arrayCopy){
        System.out.println("\n New copy of the array: " + Arrays.toString(arrayCopy));
    }

     private int[] getArrayCopy() {
         return arrayCopy;
     }
 }
