/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumgenericcollection;

/**
 *
 * @author ASUS ROG STRIX
 */
public class Account {
    private String name;
    private int num;
    private int amt;
    private AccountType type;
    Account(String name, int num, int amt, AccountType type)
    {
        //super(name, num, (amt + calculateInitialBonusValue(amt)));
        //bonusValue = calculateInitialBonusValue(amt);
        this.type = type;
    }
    
    @Override
    public String toString()
    {
        return "\nAccount Type : " + this.type +
                super.toString();
    }
    
}
