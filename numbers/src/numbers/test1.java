package numbers;
import java.util.*;  
class test1{  
       public static void main(String args[]){  
         ArrayList<Integer> list=new ArrayList<Integer>();  
         list.add(2);  
         list.add(5);  
         list.add(8);  
         list.add(10);
         list.add(23);
         
         System.out.println("Numbers Before Sorting");
         for(Integer k:list)
         {   
         System.out.println(k);  
         }  
         System.out.println("\n"+"Numbers After Sorting");
         Collections.sort(list);
         for(Integer m:list)
         {
         System.out.println(m);
         }
         System.out.println("\n"+"Numbers in Desending Order");
         
         Collections.sort(list, Collections.reverseOrder());
         for(Integer l:list) {
         System.out.println(l);
         }
     }  
}
