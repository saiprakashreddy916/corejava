package collections.java;
import java.util.*;  
class names{  
       public static void main(String args[]){  
         ArrayList<String> list=new ArrayList<String>();  
         list.add("Sai");  
         list.add("Abhi");  
         list.add("Srinath");  
         list.add("Sathwik");
         list.add("Hari");
         
         System.out.println("Names Before Sorting");
         for(String k:list)
         {   
         System.out.println(k);  
         }  
         System.out.println("\n"+"Names After Sorting");
         Collections.sort(list);
         for(String m:list)
         {
         System.out.println(m);
         }
         System.out.println("\n"+"Names in Desending Order");
         
         Collections.sort(list, Collections.reverseOrder());
         for(String l:list) {
         System.out.println(l);
         }
     }  
}