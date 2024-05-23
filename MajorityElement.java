import java.util.HashMap;
class Main {
 public static void main(String[] args) {
 int arr[] = {1, 1, 2, 2, 1, 1, 1};
 int n = arr.length/2;
 HashMap<Integer,Integer> count = new
HashMap<>();
 for(int i : arr){
 if(count.containsKey(i)){
 count.put(i,count.get(i)+1);
 }else{
 count.put(i,1);}}
 for(int i :count.keySet()){
 if(count.get(i)>=n){
 System.out.println(i);
 }}}}
