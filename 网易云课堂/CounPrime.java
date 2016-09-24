import java.util.Scanner;

public class CountPrime {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum=0;
        int s=0;

        for(int i=2; ;i++ ){

            boolean flag = true;

            for(int j=2; j<=Math.sqrt(i);j++){

                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                s++;
                System.out.println(s+" "+i);

                if(s>=n && s<=m){
                    sum =sum + i;

                }else if(s>m){
                    break;
                }

            }
        }
        System.out.println(sum);


   }


}