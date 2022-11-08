/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package enumgenericcollection;

/**
 *
 * @author ASUS ROG STRIX
 */
public class GenericMethodDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        GenericMethodClass gmc = new GenericMethodClass();
        
        Integer[] integerArray = {1,2,3};
        String[] stringArray = {"this", "is", "fu"};
        
        gmc.printArray(integerArray);
        gmc.printArray(stringArray);
    }
}
