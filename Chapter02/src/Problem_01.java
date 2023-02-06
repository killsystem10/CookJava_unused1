import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        int a,b,c,d,result;

        Scanner s=new Scanner(System.in);
        System.out.print("첫번째 계산값==>");
        a=s.nextInt();
        System.out.print("두번째 계산값==>");
        b=s.nextInt();
        System.out.print("세번째 계산값==>");
        c=s.nextInt();
        System.out.print("네번째 계산값==>");
        d=s.nextInt();

        result=a+b+c+d;
        System.out.println(a+"+"+b+"+"+c+"+"+d+"="+result);
    }
}
