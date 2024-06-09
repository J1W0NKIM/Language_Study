package Syntax.Tarray;

import java.util.Arrays;
import java.util.Random;

public class TArray {
    public static void main(String[] args) {

        //Random 사용 시 seed값 주지 않으면, 실행마다 다른 값 저장
        Random random = new Random(42L);


        //간단한 배열 생성 및 채우고 출력하는 문법
        int arr[] = new int[10];
        Arrays.fill(arr, 1);
        System.out.println(Arrays.toString(arr));

        //배열 복사
        int new_arr[] = Arrays.copyOf(arr, arr.length);

        //배열에 테스트용 랜덤값 저장
        for(int i = 0; i<10; i++)
            new_arr[i] = random.nextInt(10);
        System.out.println(Arrays.toString(new_arr));


        //배열 정렬
        Arrays.sort(new_arr);
        System.out.println(Arrays.toString(new_arr));


    }
}
