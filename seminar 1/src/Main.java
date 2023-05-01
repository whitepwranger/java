import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf(Integer.toString(factorial(5)));
        //printPrimeNumber(1000);
        calc();
    }
    public static int triangle(int n){
        return (n * (n + 1)/2);
    }
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static boolean isPrime(int n){
        int d = 2;
        while (((d * d) <= n) && (n % d != 0)){
            d += 1;
        }
        return d * d > n;
    }
    public static void printPrimeNumber(int n){
        for( int i = 2; i <= n; i++){
            if(isPrime(i) == true){
                System.out.print(Integer.toString(i) + ' ');
            }
        }
    }
    public static void calc(){
        int a,b;
        String c = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1-е число\n");
        a = scan.nextInt();
        System.out.print("Введите 2-е число\n");
        b = scan.nextInt();
        System.out.print("Введите операцию из списка *, /, +, -\n");
        c = scan.next();
        switch (c){
            case "/":{
                System.out.print(Double.toString((double) a/(double) b));
                return;
            }
            case "+":{
                System.out.print(Integer.toString(a+b));
                return;
            }
            case "-":{
                System.out.print(Integer.toString(a-b));
                return;
            }
            case  "*":{
                System.out.print(Integer.toString(a*b));
                return;
            }
        }


    }
}