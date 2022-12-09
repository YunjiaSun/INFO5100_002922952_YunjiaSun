package ui;
import model.Algorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args){

        Algorithm algorithm = new Algorithm();

        //a odd integers
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(16);
        list.add(66);

        System.out.println("------------Odd Integers------------");
        System.out.println("The count of odd integers in list is :");
        //call countOddItem() and print result
        System.out.println(algorithm.countOddItem(list));

        //a prime numbers
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(33);
        list1.add(17);
        list1.add(88);
        list1.add(68);
        list1.add(37);
        list1.add(47);

        System.out.println("------------Prime Numbers------------");
        System.out.println("The count of prime numbers in list is :");
        //call countPrimeItem() and print result
        System.out.println(algorithm.countPrimeItem(list1));

        
        //b exchange the positions of two different elements in an array
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++){
            nums[i] = i;
        }
        System.out.println("-------Exchange the Positions--------");
        //print original array
        System.out.println(Arrays.toString(nums));
        //call exchange()
        algorithm.exchange(nums,0,1);
        //print final array
        System.out.println(Arrays.toString(nums));


        //c maximal element
        int[] nums1 = new int[6];
        for (int i = 0; i < 6; i++){
            nums1[i] = i;
        }
        System.out.println("-----------Maximal Element----------");
        //print array
        System.out.println(Arrays.toString(nums1));
        System.out.println("The maximal element of this array is :");
        //call maxItem() and print result
        System.out.println(algorithm.maxItem(nums1));











    }

}
