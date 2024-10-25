
package bubblesort;

public class BubbleSort {

    //Main methode
    public static void main(String[] args) {
        
        int [] array = {5, 1, 3, 8, 15};
        int [] bsp = {1, 2, 3};
        
        System.out.println("Unsortiertes array: " );
        for (int num : array) {
            
            System.out.print(num + " ");
        }
        
        boolean swapped = false;
        int swapcounter = 0;
        
        do {
            System.out.println("Hallo!");
            for (int i = 0; i < array.length - 1; i++) {
                
                if (array[i] > array[i+1]) {
                    
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    
                    swapped = true;
                    
                    swapcounter++;
                }
            }
            
        }while(swapped == false);
        
        System.out.println("\nSortiertes array: " );
        for (int num : array) {
            
            System.out.print(num + " ");
        }

        //Ergebnis
        System.out.println("\nSwapcounter: " + swapcounter);
    }
    
}
