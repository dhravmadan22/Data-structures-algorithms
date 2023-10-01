import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []arr) {
        // Write your code here.
        int n = arr.length;
        List<Integer> finalResult = new ArrayList<>(n);
        finalResult.add(arr[n-1]);
        int max = arr[n-1];
        for(int i = n-2; i>=0;i--){
            if(arr[i] > max){
                finalResult.add(arr[i]);
                max = arr[i];
            }
        }
        return finalResult;

    }
}

// Link: https://www.codingninjas.com/studio/problems/superior-elements_6783446?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse