import java.util.Scanner;

//2번
public class Number {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int num;
        int rand = (int)(Math.random()*50+1);
            
        for(int i=1; i<=5; i++) {
            System.out.print("1~50까지 중 숫자 입력 : ");
            num = scan.nextInt();
            if(num > rand) {
                System.out.println("너무 큽니다." + i + "회");
            }
            else if(num < rand) {
                System.out.println("너무 작습니다." + i + "회");
            }
            else  {
                System.out.println("***축하합니다***"); break;
            }
        }
        System.out.println("랜덤 숫자는 " + rand + "입니다!");
       }
}