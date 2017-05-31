

/**
 *
 * @author rad85000
 */
public class CS1530_EX3 {
    public static void main(String[] args) {
        if(args.length >= 2) {
            int n = 0;
            try {
                n = Integer.parseInt(args[1]);
                if(n < 0) {
                    System.out.println("The second argument is not a positive 32-bit integer.  java -jar CS1530.jar <lazy, triangle> <positive 32-bit integer>");
                    System.exit(2);
                }
            }
            catch(NumberFormatException ex) {
                System.out.println("The second argument could not be parsed as a number.  java -jar CS1530.jar <lazy, triangle> <positive 32-bit integer>");
                System.exit(2);
            }
            if(args[0].toLowerCase().equals("lazy")) {
                System.out.println("Lazy(" + n + ") = " + Lazy(n));//could check for -1 return value here.
            }
            else if(args[0].toLowerCase().equals("triangle")) {
                System.out.println("Tri(" + n + ") = " + Tri(n));//could check for -1 return value here.
            }
            else {
                System.out.println("Incorrect first argument.  java -jar CS1530.jar <lazy, triangle> <positive 32-bit integer>");
                System.exit(1);
            }
        }
        else {
            System.out.println("Not enough arguments. java -jar CS1530.jar <lazy, triangle> <positive 32-bit integer>");
            System.exit(3);
        }
    }
    
    public static int Lazy(int n) {
        int x = (((n * n) + n + 2) / 2);
        if(n > 892589) {
            return -1;//error, the output x has wrapped around, since it is only 32 bit int.
        }
        else
            return x;
    }
    
    public static int Tri(int n) {
        int sum = 0;
        if(n > 65535) {
            return -1;//error, the output sum has wrapped around, since it is only 32 bit int.
        }
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
