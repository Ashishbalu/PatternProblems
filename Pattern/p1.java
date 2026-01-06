package DSA.Pattern;

public class p1 {
    public void printP1(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printP2(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printP3(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void printP4(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void printP5(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void printP6(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public void printP7(int n) {
        for (int i = 0; i < n; i++) {
            // for space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            //for star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            //for space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public void printP8(int n) {
        for (int i = 0; i < n; i++) {
            // for space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //for star
            for (int j = 0; j < 2*n -( 2*i + 1); j++) {
                System.out.print("*");
            }
            //for space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    //For the printP9 pattern merge the P7&P8 call them together
    
    void printP10(int n){
        for (int i = 1; i < (2*n-1) ; i++) {
            int stars = i;
            if (i>n){
                stars = 2*n-i;
            }
            for (int j = 1; j < stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p1 obj = new p1();
        obj.printP10(5);
//        obj.printP8(5);

    }
}
