package oops2535;
public class prime {
	public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        for (int num = 2; num <= 100; num++) {
        	int isprime=0;
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    isprime = 0;
                    break;
                }
                else {
                	isprime=1;
                }
                
            }
            if (isprime==1) {
                System.out.print(num + ",");
            }
        }
    }

}
