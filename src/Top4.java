public class Top4 {

    public static int digitSum(int n){
        int sum = 0;
        while (n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(digitSum(123));
    }
}

