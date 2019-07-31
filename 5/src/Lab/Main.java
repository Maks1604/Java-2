package Lab;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static float[] a1 = new float[h];
    static float[] a2 = new float[h];


    public static void main(String[] args) {
	// write your code here
        fillArray();
        long a = System.currentTimeMillis();
        calc(arr, 0);
        System.out.println(System.currentTimeMillis() - a);

        Thr();
    }

    static void fillArray(){
        for (int i = 0; i <size ; i++) {
            arr[i] =1;
        }

    }

    static synchronized void  calc (float[] arr, int m){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (i+m) / 5) * Math.cos(0.2f + (i+m) / 5) * Math.cos(0.4f + (i+m) / 2));
        }
    }

    static void Thr (){
        long b = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        new Thread(()->{calc(a1, 0);}, "a1").start();
        new Thread(()->{calc(a2, h);}, "a2").start();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println(System.currentTimeMillis() - b);

    }
}
