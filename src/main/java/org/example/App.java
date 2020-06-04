package org.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    //Bai 1_result: cac phan tu chi xuat hien trong mang 1 lan
    public static ArrayList<Integer> Bai1(int[] array){
        ArrayList<Integer> lstFoundUnique = new ArrayList<>();
        int dem =0;
        for(int i=0; i< array.length; i++){
            for(int j=i+1; j< array.length; j++){
                if(array[i] == array[j]){
                    dem++;
                    array[j] =-1;
                }

            }
            if(dem==0 && array[i]>0){
                lstFoundUnique.add(array[i]);
            }
            dem =0;
        }
        return lstFoundUnique;
    }

// Bai 2
    public static int Bai2(int[] array){
        ArrayList<Integer> lstFoundUnique = new ArrayList<>();
        int dem =0;
        for(int i=0; i< array.length; i++){
            for(int j=i+1; j< array.length; j++){
                if(array[i] == array[j]){
                    dem++;
                    array[j] =-1;
                }

            }
            if(dem==0 && array[i]>0){
                lstFoundUnique.add(array[i]);
            }
            dem =0;
        }
        return lstFoundUnique.size();
    }
// Bai 3
    public static Boolean CheckPrimerNumber(int n) {
        Boolean result = true;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                result = false;
            }
        }
        return result;
    }

    public static int[] Bai3(int n){
        int[] lstFoundSNT = new int[n];
        int dem =0;
        int i=2;
        while(dem <n) {
                if(CheckPrimerNumber(i)){
                    lstFoundSNT[dem] = i;
                    dem++;
                }
                i++;
            }

        return lstFoundSNT;
    }

//Bai 4

    public static int Bai4(int n){
        int sum =0;
        String number = String.valueOf(n);
        for(int i=0;i<number.length();i++){
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return sum;
    }

//Bai 6

    public static ArrayList<Integer> Bai6(int n){
        ArrayList<Integer> fiboSNT = new ArrayList<Integer>();;
        ArrayList<Integer> fibo = FilterFibo(n);
        for(int i=1; i<fibo.size();i++){
            if(CheckPrimerNumber(fibo.get(i))) {
                fiboSNT.add(fibo.get(i));
            }
        }
        return fiboSNT;
    }


    public static ArrayList<Integer> FilterFibo(int n){
        ArrayList<Integer> fibo = new ArrayList<Integer>();
        if (n == 1) {
            return fibo;
        } else if (n == 2) {
            fibo.add(1);
            return fibo;
        } else{
            fibo.add(1);
            fibo.add(2);
            int temp = 0;
            for (int i=2; i<n;i++){
                temp = fibo.get(i-1) + fibo.get(i-2);
                if(temp <n){
                    fibo.add(temp);
                }
                else{
                    break;
                }

            }
            return fibo;
        }


    }


    public static void main(String[] args) {
        //int[] array = {1,2,1,3,1,4,4,5,1,8,9,2,5};
        //System.out.println(Bai1(array));
        //System.out.println(Bai2(array));
        int n=100;
        /*
        int[] a = Bai3(n);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

         */
        //System.out.println(CheckPrimerNumber(n));
        System.out.println(Bai6(n));
    }
}
