
package logica1;

import java.util.ArrayList;
import java.util.Collections;


public class arrayList {
    public static void main(String[] args) {
       ArrayList<String>listaPaises=new ArrayList<>();
      // ArrayList<String>listaPaisesAuxiliar=new ArrayList<>();
        
       listaPaises.add("Brasil");
       listaPaises.add("Argentina");
       listaPaises.add("Perú");
       listaPaises.add("Mexico");
       //listaPaises.add("Chile");
       listaPaises.add("Azerbaijão");
       
        System.out.println(listaPaises);
        
        Collections.sort(listaPaises);
        
        System.out.println(listaPaises);
        
        Collections.reverse(listaPaises);
        
        System.out.println(listaPaises);
        
         
        
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       /* System.out.println(listaPaises);
        System.out.println(listaPaises.get(2));
        
        listaPaisesAuxiliar.addAll(listaPaises);
        listaPaises.remove("Brasil");
        System.out.println(listaPaises);
        listaPaises.remove(0);   
        System.out.println(listaPaises);
        listaPaisesAuxiliar.remove(0);
        listaPaisesAuxiliar.remove(3);
        System.out.println(listaPaises);
        System.out.println(listaPaisesAuxiliar.size());
        
        for (int i=0;i<listaPaises.size();i++) {
            System.out.println(listaPaises.get(i));
        }
        for (String pais : listaPaises) {
            System.out.println(pais);
        }*/
        
    }
}
