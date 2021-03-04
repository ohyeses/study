import java.util.Arrays;

public class Ex04_선택정렬 {
   
   public static void main(String[] args) {

      //Selection Sort(선택정렬) 내리차순 정렬
      int[] array = {98, 7, 70, 13, 24};
      
      for(int j = 0; j < array.length - 1; j++) {
         
         int maxIndex = j;
         
         for(int i = j + 1; i < array.length; i++) {
            if(array[maxIndex] < array[i]) {
               maxIndex = i;
            }
         }
         int temp;
         temp = array[maxIndex];
         array[maxIndex] = array[j];
         array[j] = temp;
      }
      
      
      
      
      System.out.println(Arrays.toString(array));
      
      
   }
}