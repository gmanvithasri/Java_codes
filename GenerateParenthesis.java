import java.util.*;
class Main{
    
    static void call(int n,int open,int close,String s){
        if(close==n){
            System.out.print(s+" ");
            return ;
        }
        if(n>open){
            call(n,open+1,close,s+"(");
        }
        if(open>close){
            call(n,open,close+1,s+")");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        call(n,0,0,"");
    }
}
