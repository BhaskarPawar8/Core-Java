package Companies.City;

/*

There are list of latency values as follows – [1,2,4,3,2,7,6,8,2,0]
Two parameters, threashold = 5 , window =3
Within the list of latency values, check the values which are crossing the threashold values. If the threashold is crossing the defined window value then return the index value of last occurrence.
In above set of values, expected output is 7. Because 7 is the index in above array where we had 3 occurrences of value greater than threashold.

 */
public class Solution {

    public int getIndexOfThreashold(int[] latencyValues, int threashold, int window){

        int counter =0;
        for(int i=0; i < latencyValues.length; i++){
            if(latencyValues[i] >  threashold){
                counter = counter + 1;
            }
            else{
                counter = 0;
            }
            if(counter == window) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myIntArray = new int[]{1,2,4,3,2,7,6,8,2,0};
        int threashold = 5;
        int window = 3;

        Solution solution = new Solution();

        int result = solution.getIndexOfThreashold(myIntArray, threashold, window);

        System.out.println("Index of threshold: " + result);
    }
}
