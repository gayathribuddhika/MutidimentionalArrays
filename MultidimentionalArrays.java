
package multidimentionalarrays;


public class MultidimentionalArrays {

    
    public static void main(String[] args) {
        int array1[][] = {{10,11,15,23,42},{25,48,63,78,96}};
        int array2[][] = {{24,42,3,63,4},{24,86,96,78},{2,54}};
        
        System.out.println("The first Array is:");
        display(array1);
        
        System.out.println("The second Array is:");
        display(array2);
    }
    public static void display(int x[][]){
        for(int row=0;row<x.length;row++){
            for(int column=0;column<x[row].length;column++){
                System.out.println(x[row][column]+"\t");
            }
            System.out.println(" ");
        }
    }
    
}
