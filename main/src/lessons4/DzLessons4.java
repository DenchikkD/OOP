package lessons4;

/**
 * Created by Denni on 22.07.2016.
 */
public class DzLessons4 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(pow(5,2));
    }


    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number-1);
    }

    public static int pow(int n,int m){
        if (m==0){
            return 1;
        }
        return n*pow(n,m-1);
    }




}
