package Chap00.Basic;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i< 10; i++)
            arr[i] = i;

        //for each test (only read)
        for(int j:arr){
            System.out.print(j + " ");
        }
    }
}
