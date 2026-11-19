public class Main {
    public static void main(String args[]){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int result = 0;

        System.out.printf("num1=%d, num2=%d\n",num1,num2);
        result = num1 + num2;
        System.out.println(result);
        result = num1 - num2;
        System.out.println(result);
        result = num1 * num2;
        System.out.println(result);
        result = num1 / num2;
        System.out.println(result);
    }
}

