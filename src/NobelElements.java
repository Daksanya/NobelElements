import java.util.Scanner;
import java.util.Arrays;
public class NobelElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int array[]=new int[n];
        for (int i=0;i<n;i++){
            array[i]= scanner.nextInt();
        }

        System.out.println(nobelElement(array,n));
    }
    static int nobelElement(int[] array,int n){
        Arrays.sort(array);
        int count=0;
        for (int i=0;i<n;i++){
            if(array[i]==n-1-i){
                count++;
            }

        }
        if(count!=0){
            return 1;
        }
        return -1;

    }
}
