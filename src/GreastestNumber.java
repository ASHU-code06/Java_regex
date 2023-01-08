import java.util.Scanner;
public class GreastestNumber {

    public static void main(String args[]) {
        int n,temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the that we want to enter
        n=sc.nextInt();
//creates an array in the memory of length 10
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
//reading array elements from the user
            array[i]=sc.nextInt();
        }
//sorting array in descending order
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("top two greatest numbers are  ");
        for (int i = 0; i < 2; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
