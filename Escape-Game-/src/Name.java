
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mckenzietaggart
 */
public class Name {//Pass by Reference and Pass by Value
        public static void main (String args[]){
            int age = 0;//primitive data types = boolean, byte, char, short, int, long, float and double
            Name john = new Name();//create new object
            Name samuel = john;//created a reference point name
            
            john.age = 10;//pass by value
            
            System.out.println("John's age is " + john.age);
            System.out.println("Samuel's age is " + samuel.age);//pass by reference
          
        }
    private int age;

}
