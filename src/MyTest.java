/**
 * @author huqingxiang
 * @descrption
 * @date 2019-12-30 22:31
 */
public class MyTest {

    public int findNumbers(int[] nums) {
        int evenNum = 0;
        for(int n:nums){
            int count = 0;
            do{
                n = n/10;
                count++;
            }while(n>0);
            if(count%2==0){ evenNum++;}
        }
        return evenNum;
    }
    public static void main(String[] args) {

        System.out.println(44%2);
        new MyTest().findNumbers(new int[]{555,901,482,1771});
        System.out.println(111);

        String str = "1.1.1.1a";

        str.replaceAll("a*","[.]");
        System.out.println(str);
    }
}
