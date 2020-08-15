import java.util.*;
public class RandomNumbers{
        public static void main(String[] args) {
          Random r = new Random();
          int arr[] = new int[10];
            for (int cnt = 0; cnt< 10; cnt++){
              int rnum = r.nextInt(500);
              arr[cnt] =rnum;
             }
         System.out.println("Before sorting");
        for (int i=0;i<10;i++)
           System.out.print(arr[i]+"\t");
        Arrays.sort(arr);
        System.out.println("\nAfter sorting");
        for (int i=0;i<10;i++)
           System.out.print(arr[i]+"\t");
     }
}
