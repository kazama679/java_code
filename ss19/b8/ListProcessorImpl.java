package ss19.b8;

import java.util.List;

public class ListProcessorImpl implements ListProcessor{
    @Override
    public int sumOddNumbers(List<Integer> list) {
        int count = 0;
        for (Integer i : list) {
            if(i % 2 != 0){
                count+=i;
            }
        }
        return count;
    }
}
