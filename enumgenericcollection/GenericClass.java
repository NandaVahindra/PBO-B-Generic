/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumgenericcollection;

/**
 *
 * @author ASUS ROG STRIX
 */
public class GenericClass<T> {
    private T data;
    
    public void setValue(T celldata)
    {
        data = celldata;
    }
    public T getValue(){
        return data;
    }
    
}
