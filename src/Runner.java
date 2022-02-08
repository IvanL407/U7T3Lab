import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));

        //COMPLETE ME!
        for (int i = 1; i <= numList.size() - 2; i++)
        {
            int currentNum = nums[i];
            int nextNum = nums[i + 1];
            int previousNum = currentNum + nextNum;
            //numList.set(previousNum, currentNum + nextNum);
            numList.set(i - 1, previousNum);
        }
        System.out.println(numList);


    }
}
