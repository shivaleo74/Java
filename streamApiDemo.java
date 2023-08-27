import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class streamApiDemo {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4,5,7,3,2,6);

        // Stream - you can use only once
        // Stream<Integer> s1 = num.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);

        Predicate<Integer> p =  new Predicate<Integer>() {
            public boolean test(Integer n)
            {
                if (n%2==0)
                    return true;
                else
                    return false;
            }
        };

        Function<Integer,Integer> fun = new Function<Integer,Integer>() {
            public Integer apply(Integer n) {
                return n*2;
            }
        };

        int result = num.stream()
                        // .filter(n -> n%2==0
                        .filter(p)
                        // .map(n -> n*2)
                        .map(fun)
                        .reduce(0, (c,e)-> c+e);

        System.out.println(result);
        //Blow forloop is equilent to above s3.reduce.
        // int sum = 0;
        // for (int n : nums)
        // {
        //     if (n%2==0)
        //     {
        //         n = n*2;
        //         sum = sum + n;
        //     }
        // }
        

        Stream<Integer> sortedValues = num.stream()
                                        .filter(n->n%2==0)
                                        .sorted();

        sortedValues.forEach(n -> System.out.println(n));
                                        
        // s3.forEach(n -> System.out.println(n));

        // This statement will thow an erro as Stream is already used
        // s1.forEach(n -> System.out.println(n));

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n)
        //     {
        //         System.out.println(n);
        //     }
        // };

        // Consumer<Integer> con = n -> System.out.println(n);
        // num.forEach(con);
        // num.forEach(n -> System.out.println(n));

        //Normal for loop
        // for(int i=1; i<num.size(); i++)
        // {
        //     System.out.println(num.get(i));
        // }

        //Enhanced for loop
        // for(int n : num)
        // {
        //     System.out.println(n);

        // foreach loop
        // num.forEach(n -> System.out.println(n));
    }
}
