
package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        
        int [] array = {5, 2, 3, 9, 11};
        int [] bo= {3,3};
        System.out.println("Unsortiertes array: " );
        for (int num : array) {
            
            System.out.print(num + " ");
        }
        
        boolean swapped = false;
        int swapcounter = 0;
        
        do {
            //bitttteee
            for (int i = 0; i < array.length - 1; i++) {
                
                if (array[i] > array[i+1]) {
                    
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    //baby
                    swapped = true;
                    //please
                    swapcounter++;
                }
            }
            //baby
        }while(swapped == false);
        
        System.out.println("\nSortiertes array: " );
        for (int num : array) {
            
            System.out.print(num + " "+ "");
        }
        
        System.out.println("\nSwapcounter: " + swapcounter);
    }
    
}
