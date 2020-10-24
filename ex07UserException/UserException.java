import java.io.*; 
import java.util.*;

class RangeException extends Exception{ 
    String msg;
    RangeException(String msg){
        this.msg = msg;
    }
    public String toString(){ 
        return msg;
    }
}

class UserException{
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in); 
        int val;
        try{
            System.out.print("Enter a value: "); 
            val = scan.nextInt();
            if(val<1 || val>100) {
                throw new RangeException("Out of range");
            }
            else {
                System.out.println(val);
            }
        }
        catch(RangeException re) { 
            System.out.println(re);
        }
    }
}
