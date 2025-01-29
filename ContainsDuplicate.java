import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args){
        int[]nums1={1,2,3,1};
        System.out.println(containsD(nums1));
    }
    public static boolean containsD(int[]nums){
        HashSet<Integer>seen=new HashSet<>();
        for(int num:nums){
            if(!seen.add(num)){
                return true;
            }
        }
        return false;
    }
}