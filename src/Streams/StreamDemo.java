package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5,2,3,4,6);

       /* int sum=0;
        for(int i:nums){
            if(i%2 ==0) {
                int a = i * 2;
                sum = sum + a;
            }
        }
        System.out.println(sum);
*/

        BinaryOperator<Integer> binaryOperator = (o, o2) -> o + o2;



        int result = nums.stream()
                                    .filter(o -> o%2 == 0)
                                            .map(o -> o * 2)
                .reduce(0, (o, o2) -> o + o2);

        System.out.println(result);


    }
}
