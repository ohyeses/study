import java.util.Arrays;

public class Ex04_�������� {
   
   public static void main(String[] args) {

      //Selection Sort(��������) �������� ����
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