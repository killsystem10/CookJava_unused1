import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        int a,b,iff,result;
        Scanner s=new Scanner(System.in);

        System.out.print("첫번째 계산값==>");
        a=s.nextInt();
        System.out.print("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈 ==>");
        iff=s.nextInt();
        System.out.print("두번째 계산값==>");
        b=s.nextInt();

        if (iff==1) {
            result=a+b;
            System.out.println(a+"+"+b+"="+result);
        }
        if (iff==2) {
            result=a-b;
            System.out.println(a+"-"+b+"="+result);
        }
        if (iff==3) {
            result=a*b;
            System.out.println(a+"*"+b+"="+result);
        }
        if (iff==4) {
            result=a/b;
            System.out.println(a+"/"+b+"="+result);
        }
    }
}
