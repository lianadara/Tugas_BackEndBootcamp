import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LatihanDay1 {
    public static void main(String[] args){
        List<Integer> A = Arrays.asList(1,2,3);
        List<Integer> B = Arrays.asList(2,3,4);
        List<Integer> C = new ArrayList<>();
        for (Integer a : A){
            for (Integer b : B){
                if (a.equals(b)){
                    C.add(a);
                }
            }
        }
        System.out.println("Intersection A dan B yaitu: " + C);

        // Yang pake stream
        C = A.stream()
                .filter(B::contains)
                .collect(Collectors.toList());
        System.out.println(C);


    }
}



