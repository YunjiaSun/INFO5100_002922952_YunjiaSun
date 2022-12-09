package model;

import java.util.List;

public class Algorithm {

    //a countOddItem
    public int countOddItem(List<Integer> list){
        int count = 0;
        for (int i : list){
            if (i % 2 == 0){
                count++;
            }
        }
        return count;
    }

    //a countPrimeItem
    public int countPrimeItem(List<Integer> list){
        int primeNumber = 0;
        for(int n : list){
            boolean isPrime = true;

            for (int i = n-1; i > 1; i--){
                if (n % i == 0){
                    isPrime = false;
                }
            }
            if (isPrime){
                primeNumber++;
            }
        }
        return primeNumber;
    }

    //b exchange positions
    public void exchange(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //c maximal element
    public int maxItem(int[] nums){
        int max = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }



}
