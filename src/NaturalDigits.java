import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NaturalDigits {

    public List<Integer> getNaturalDigits(int i){
        List<Integer> integers = new ArrayList<>();
        for(;i>0 ; i--){
            if(i == 2 || i==3 || i==5){
                integers.add(i);
            }
            if((i%2!=0 && i!=2 && i%3!=0 && i!=3 && i%5!=0 && i!=5)){
                integers.add(i);
            }
        }
        return integers.stream().sorted().collect(Collectors.toList());
    }
}
