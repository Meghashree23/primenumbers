public class primenumber {
    public static void main(String[] agrs) {
        int num = 1;
        int count = 0;
        for (int i = 0; i <= num; i++) {
            if (num % 1 == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("it is a prime number");
        } else {
            System.out.println("it is not a prime number");
        }
    }
}


