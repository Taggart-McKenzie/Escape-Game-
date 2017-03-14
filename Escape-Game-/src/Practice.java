/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mckenzietaggart
 */
public class Practice {//scope example
//scope is a block of code within the opening and closing curly brackets
    
    public static void main (String args[]){//main scope

    int x = 5; //x = 5 is availble within main
//introduce lifetime

    if(x<=10) {//new scope
        int y = 1;//lifetime begins
        System.out.println("x < = 10");
        }//lifetime of y = 1 ends at this closing curly brace
    
    else{
       x = 12;//x has already been declared in main section above
        System.out.println("x !<= 10");
    }
    int y = 2;//lifetime of y = 2 starts when it's declared
    
    }//main scope ends. Lifetime of y = 2 and x = 5 ends
    
}
