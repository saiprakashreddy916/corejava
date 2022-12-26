package Day3;

public class pattern4 {
    public static void main(String[] args){
        for (int i= 0; i<= 9; i++)  
       {  
          
         for (int j=1; j<=10-i; j++)  
       {  
        System.out.print(" ");  
        }  
         for (int k=0;k<=i;k++)  
        {  
         System.out.print("*");  
        }   
         System.out.println("");  
       }  
   }
    
}
