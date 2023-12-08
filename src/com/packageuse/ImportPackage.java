package com.packageuse;

import java.util.Arrays;

public class ImportPackage {
    public static void main(String[] args) {
        int []arr = {2,1,5,3};
        Arrays.sort(arr);
        for(int num : arr){
            System.out.println(num+"\t");
        }
    }
}
