import java.util.*;
class Main{
    static void comb(ArrayList<Integer>list,ArrayList<Integer>ans,int sum,int pos){
        if(sum==0){
            for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i)+" ");
            }
          System.out.println();
          return;
        }
    
        for(int i=pos;i<list.size();i++){
            if(sum-list.get(i)>=0){
                ans.add(list.get(i));
                comb(list,ans,sum-list.get(i),i);
                ans.remove(list.get(i));
            }
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        comb(list,ans,sum,0);
    }
}
