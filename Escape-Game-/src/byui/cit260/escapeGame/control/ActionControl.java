/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeGame.control;

/**
 *
 * @author samanthabrown
 */
public class ActionControl {
   public int moveUp(int location){
       int x = 0;
       int nextLocation;
       nextLocation = location + x;
       return nextLocation;
   } 
   public int moveDown (int location){
       int x = 0;
       int nextLocation;
       nextLocation = location + x;
       return nextLocation;
   }
    public int moveLeft (int location){
       int x = 0;
       int nextLocation;
       nextLocation = location + x;
       return nextLocation;
   }
    public int moveRight (int location){
       int x = 0;
       int nextLocation;
       nextLocation = location + x;
       return nextLocation;
   }
   public int goBack(int location){
       int prevLocation = location--;
       return prevLocation;
   }
   public double pickUpItem(double problem, int item){
       double solveProblem = 0;   
       return item;
   }
   
   public String useItem(int Item){
       String clue;
       clue = "Item";
       return clue;
   }
   public double solveTriangle(double base, double height){
       base = 0;
       height = 0;
       double surfaceArea = 0;
       
       if (base < 0 || base > 10){
           return -1;
       }
           else if (height < 0 || height > 10){
                   return -1;
       }
           else if ((base >= 0 && base < 11) && (height >= 0 && height <11)){
                   surfaceArea = (base*height)/2;
                   return surfaceArea;
       }
       return surfaceArea;
   }
   public double solveForX(double x, double y, double z){
       x = 0;
       y = 0;
       z = 0;
       
      if (y<0){
          return -1;
      } 
      else if(z < 0){
          return -1;
      }
      else if(z>y){
          return -1;
      }
      else if(y>0 && x>0 && z<y){
          y = 50;
          z = 10;
          x = (y-z)/5;
          return x;
      }
      return x;
   } 
   public double solveCube(){
       double base = 0;
       double height = 0;
       double length = 0;
       double volume = 0;
       
       	if(base<0 || base>10){
            return -1;
   }
        else if(height<0 || height>10){
		return -1;
   }
        else if(length<0 || length>10){
		return -1;
   }
        else if((base >= 0 && base<11) && (height >=0 && height<11)
                 && (length >=0 && length<11)){
 	volume = base*height*length;
        return volume;
   }
       return volume;
   }
   
   public boolean quit(boolean answer){
        boolean location = true;
        boolean GameControl = false;
        
        if (answer==true){
            return location;
        }
        else {
            return GameControl;
        }
    }
}
