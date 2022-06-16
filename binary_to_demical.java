import java.util.*;

public class binary_to_demical {
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = 0;
        List<Integer> nums = new ArrayList<Integer>();
        while (a != 0) {
          nums.add(a % 10);
          a /= 10;
        }
        int s = nums.size() - 1;
        while (s != -1){
          ans = (int) ( ans + nums.get(s) * Math.pow(2, s));
          s--;
        }
        System.out.println(ans);
    }
}