import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int m=0;
        if(n<0){
            System.out.print("fu ");
            m = -n;
        }

        else {
            m = n;
        }

        String shu = String.valueOf(m);
        int Shu = shu.length(); //java得到数字位数的方法1

        for(int i=Shu-1; i>=0; i--){
            int x1 = (int)((m/Math.pow(10,i))%10);  // int x1 = (int)(n/Math.pow(10,Shu-1)); 得到数字首位
            //System.out.println(x1);
            switch(x1)
            {
                case 0:System.out.print("ling");break;
                case 1:System.out.print("yi");break;
                case 2:System.out.print("er");break;
                case 3:System.out.print("san");break;
                case 4:System.out.print("si");break;
                case 5:System.out.print("wu");break;
                case 6:System.out.print("liu");break;
                case 7:System.out.print("qi");break;
                case 8:System.out.print("ba");break;
                case 9:System.out.print("jiu");break;
            }
            if(i>0){
                System.out.print(" ");
            }

        }

   }

}