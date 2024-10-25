
package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        
        int [] array = {5, 2, 3, 9, 11};
        
        System.out.println("Unsortiertes array: " );
        for (int num : array) {
            
            System.out.print(num + " ");
        }
        //Übung s.61 Lesbarkeit längerer Zahlen
        int e=2_0000_000;


        int swapcounter = 0;
        boolean swapped;
        do {
            swapped = false;
            //bitttteee
            for (int i = 0; i < array.length - 1; i++) {
                
                if (array[i] > array[i+1]) {
                    
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    
                    swapped = true;
                    //please
                    swapcounter++;
                }
            }
            
        }while(swapped);
        
        System.out.println("\nSortiertes array: " );
        for (int num : array) {
            System.out.print(num + " "+ "");
        }
        
        System.out.println("\nSwapcounter: " + swapcounter);
    }
    
}
/*
swapped speichert, ob ein Tausch stattgefunden hat.
swapcounter zählt die Anzahl der Tauschaktionen.

 */
