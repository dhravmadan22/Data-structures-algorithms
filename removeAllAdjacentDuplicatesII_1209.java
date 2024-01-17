// class Solution {
//     public String removeDuplicates(String s, int k) {
        
//         int[] arr = new int[2];
//         while(arr[0] != -1 && arr[1] != -1){
//             arr = findIndexes(s, k);
//         // System.out.printf("Starting Range: %d, Ending Range: %d \n", arr[0], arr[1]);
//         if(arr[0] != -1 && arr[1] != -1){
//             s = removeSubString(s,arr[0],arr[1]);
//         }
//         }
        
        
//         // n * k
//         // 1 2 3 4 5 6 7 8 9
//         return s;
//     }

//     public int[] findIndexes(String s, int k){
//         int[] newArray = {-1,-1};
//         for(int i = 0; i < s.length(); i++){
//             if(i>s.length()-k) break;
//             char ele = s.charAt(i);
//             int count = 0;
//             for(int j = i; j<=i+k-1;j++){
//                 if(s.charAt(j) != ele) break;
//                 count++;
//             }
//             if(count == k){
//                 // System.out.printf("Starting Range: %d, Ending Range: %d \n", i, i+k-1);
//                 newArray[0] = i;
//                 newArray[1] = i+k-1;
//                 break;
//             }
//         }
//         return newArray;
//     }

//     public String removeSubString(String s, int a, int b){
//             String part1 = s.substring(0, a);
//             String part2 = s.substring(b+1, s.length() );
//             return part1 + part2;
//     }
// }

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int []> Master = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(!Master.isEmpty() && Master.peek()[0] == ch){
                Master.peek()[1]++;
            }
            else Master.push(new int[]{ch, 1});
            if(Master.peek()[1] == k) Master.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!Master.isEmpty()){
            int top[] = Master.pop();
            while(top[1] --> 0)
                sb.append((char)top[0]);
        }
        return sb.reverse().toString();
    }
}