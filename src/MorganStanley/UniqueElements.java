package MorganStanley;

import java.util.*;

public class UniqueElements {

    public Set<Integer> returnUniqueElements(Collection<Integer> inputtedIntegers) {

        Set<Integer> uniqueSetELements = new HashSet<Integer>();
        if (Objects.nonNull(inputtedIntegers)) {
            for (Integer a : inputtedIntegers) {
                uniqueSetELements.add(a);
            }
        }
        return uniqueSetELements;
    }

        public static void main(String[] args) {
            UniqueElements ue = new UniqueElements();
            Collection<Integer> input = new ArrayList<>();
            input.add(5);
            input.add(3);
            input.add(3);
            input.add(4);

            Set<Integer> returnedUniqueElements = ue.returnUniqueElements(input);

            System.out.println("Unique elements: " + returnedUniqueElements);
    }
}
