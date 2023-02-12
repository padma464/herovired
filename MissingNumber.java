import java.util.Scanner;
class MissingNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        int i=0;
        int k=x[n-1];
        for(int j=1;j<=k;j++){
            if(x[i]!=j){
              System.out.print(j+" ");
            }
            else 
             i++;
        }
    }
}