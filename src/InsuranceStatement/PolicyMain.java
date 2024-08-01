package InsuranceStatement;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PolicyMain {
    public static void main(String[] args) {

        Policy p1 = new Policy("P_001", "Person 1", 1200);
        Policy p2 = new Policy("P_002", "Character 2", 1500);
        Policy p3 = new Policy("P_003", "Letter 3", 2200);
        Policy p4 = new Policy("P_004", "Plpha 4", 1000);

        List<Policy> policyHolderList = Arrays.asList(p1, p2, p3, p4);

        System.out.println(policyHolderList);

        System.out.println("\n********************************* Filter amount greater than $1,200 *********************************");
        policyHolderList.stream()
                .filter(policy -> policy.getPremiumAmount() > 1200)
                .forEach(System.out::println);

        System.out.println("\n********************************* Sort the policies alphabetically by the holder's name *********************************");
        policyHolderList.stream()
                .sorted((policy, policy2) -> policy.getPolicyHolderName().compareTo(policy2.getPolicyHolderName()))
                .forEach(System.out::println);

        System.out.println("\n********************************* Compute Total Premium *********************************");
        double sum = policyHolderList.stream()
                .mapToDouble(Policy::getPremiumAmount)
                .reduce(0, (subtotal, i) -> subtotal + i);
        System.out.println("₹ " + sum);

        System.out.println("\n********************************* Print Policy Details *********************************");
        policyHolderList.forEach(System.out::println);


        System.out.println("\n********************************* Special Case *********************************");
        System.out.println("\n********************************* The premium amount is between $1,000 and $2,000 *********************************");
        policyHolderList.stream().
                filter(policy -> policy.getPremiumAmount() > 1000 && policy.getPremiumAmount() < 2000)
                .forEach(System.out::println);

        System.out.println("\n********************************* Find Policy with Highest Premium *********************************");
        Optional<Policy> highestPremiumHolder = policyHolderList.stream().
                reduce((policyHolder1, policyHolder2) -> policyHolder1.getPremiumAmount() > policyHolder2.getPremiumAmount() ? policyHolder1 : policyHolder2);

        highestPremiumHolder.ifPresentOrElse(
                t -> System.out.println("Highest Premium Policy Holder:\t" + t),
                () -> System.out.println("Not List is Found")
        );


        System.out.println("\n********************************* Group Policies by Holder Name Initial *********************************");
        Map<Character, List<Policy>> collect = policyHolderList.stream().
                collect(Collectors.groupingBy(t -> t.getPolicyHolderName().charAt(0)));

        System.out.println(collect);

        System.out.println("\n********************************* Find Policy with Highest Premium *********************************");
        double avg = sum / policyHolderList.size(); // sum is from *Compute Total Premium*
        System.out.println(avg);


        System.out.println("\n********************************* Sort Policies by Premium and Print *********************************");
        policyHolderList.stream()
                .sorted((po1, po2) -> Double.compare(po1.getPremiumAmount(), po2.getPremiumAmount()))
                .forEach(System.out::println);

        System.out.println("\n*********************************  Check If Any Policy Exceeds a Certain Premium i.e, 2000 *********************************");
        policyHolderList.stream()
                .filter(p -> p.getPremiumAmount() > 2000)
                .forEach(System.out::println);

        System.out.println("\n********************************* Count Policies for Each Premium Range *********************************");
        Map<Object, Long> mapRange = policyHolderList.stream().collect(Collectors.groupingBy(policy -> {
            if (policy.getPremiumAmount() > 2000) {
                return "[> ₹2000]";
            } else if (1000 < policy.getPremiumAmount() && policy.getPremiumAmount() <= 2000) {
                return "[₹1000 - ₹2000]";
            } else {
                return "[₹0 - ₹1000]";
            }
        }, Collectors.counting()));

        System.out.println(mapRange);


//
//
//        List<String> list = Arrays.asList("Krishna", "Azam", "hello");
//
//        Predicate<String> lengthContain5 = (s1) -> {
//            System.out.println("1");
//            return s1.length() >= 5;
//        };
//        Predicate<String> containSpecialKey = s1 -> {
//            System.out.println("2");
//            return s1.contains("e");
//        };
//
//        Predicate<String> checkPoint = s1 -> {
//            System.out.println("3");
//            return true;
//        };
//
//        List<String> collect = list.stream().filter(lengthContain5.and(containSpecialKey).and(checkPoint)).collect(Collectors.toList());
//
//
//        System.out.println(collect);

    }
}
