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

    void printP11(int n){
        int start = 1;
        for (int i = 0; i<n; i++){
            if (i%2==0){
                start = 1;
            }else {
                start = 0;
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }

    void printP12(int n){
        int space = 2*(n-1);
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <space ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    void printP13(int n){
        int num = 1;
        for (int i =1; i<=n; i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    void printP14(int n){
        for (int i = 0; i <n ; i++) {
            for (char ch = 'A'; ch<='A'+ i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void printP15(int n){
        for (int i = 0; i<n; i++){
            for (char ch = 'A'; ch<='A' + (n-i-1); ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void printP16(int n){
        for (int i = 0; i <n ; i++) {
             char ch =(char) ('A' + i);
            for (int j = 0; j <=i ; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void printP17(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <=n-i-1 ; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for (int j = 1; j <=2*i+1 ; j++) {
                System.out.print(ch);
                if (j<=breakpoint){
                    ch++;
                }else {
                    ch--;
                }
            }
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void printP18(int n){
        for (int i = 0; i <n ; i++) {
            for (char ch = (char) ('E'-i); ch<='E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void printP19(int n){
        int initialS =0;
        for (int i = 0; i <n ; i++) {
            // Stars
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 0; j <initialS ; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("*");
            }
            initialS += 2;
            System.out.println();
        }
        initialS = 2*n-2;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < initialS; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            initialS -= 2;
            System.out.println();
        }
    }

    void printP20(int n){
        int spaces = 2*n-1;
        for (int i =1; i<=2*n-1; i++){
            int stars = i;
            if (i>n){
                stars = 2*n-i;
            }
            // stars
            for (int j = 1; j <=stars ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < spaces ; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <=stars ; j++) {
                System.out.print("*");
            }
            if (i<n){
                spaces -= 2;
            }else {
                spaces += 2;
            }
            System.out.println();
        }
    }

    void printP21(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        p1 obj = new p1();
        obj.printP21(5);
//        obj.printP8(5);

    }
}
