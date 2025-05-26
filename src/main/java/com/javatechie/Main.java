package com.javatechie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5);

        List<Integer> reqNums=nums.stream()
                .filter(n-> n>=3 && n<=4)
                .collect(Collectors.toList());
        System.out.println("check:: "+reqNums);
    }
}