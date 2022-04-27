/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.
        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Output: Because nums[0] + nums[1] == 9, we return [0, 1].*/


public class FindIndexForSumCombination {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target=26;
        ArrayList<Integer> elementEncountered = new ArrayList<>();
        ArrayList<Integer> elementIndex = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int otherElement = target-nums[i];
            if(elementEncountered.contains(otherElement)){
                elementIndex.add(i);
                elementIndex.add(elementEncountered.indexOf(otherElement));
                break;
            }
            elementEncountered.add(nums[i]);
        }

        if(elementIndex.isEmpty()){
            System.out.println("Target Element can't be found");
        }else{
            System.out.println("Target Index Found : "+elementIndex);
        }

    }
}
