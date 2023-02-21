import java.util.Arrays;
class Prefix
{
   public static void main(String args[ ]){
      int element[ ]={3,7,25,36,12};
      int[] pre = new int[element.length];
      pre[0] = element[0];
      for(int i=1;i<element.length;i++){
         pre[i] = pre[i - 1] + element[i];
         }
      System.out.println(Arrays.toString(pre));
    }
}