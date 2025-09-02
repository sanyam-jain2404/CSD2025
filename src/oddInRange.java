public class oddInRange {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i=1;i<=100;i++){
            if (i%2 != 0){
                count ++;
                sum+=i;
            }
        }
        System.out.println("number of Odd numbers between 1 and 100 are " + count);
        System.out.println("And Sum of all odd numbers between 1 and 100 are " + sum);
    }
}