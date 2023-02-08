package logica1;
import java.util.ArrayList;
import java.util.Collections;
public class arrayativ {
    public static void main(String[] args) {
        String[] nomes={"zeze","fulano","thomas","turbando",
       "greysAnatomy","stephani","phabio","jamal","luther","vini"}; 
   
ArrayList<String> listaNomes=new ArrayList<>();
ArrayList<String> listaNomesAuxiliar=new ArrayList<>();
   
for(int i=0;i <nomes.length;i++){
listaNomes.add(nomes[i]);
}
listaNomesAuxiliar.addAll(listaNomes);

listaNomesAuxiliar.remove("zeze");
listaNomesAuxiliar.remove("vini");
listaNomesAuxiliar.remove(4);
listaNomesAuxiliar.remove(3);

for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println(listaNomes.get(i));
    } 
        System.out.println(listaNomes);
        Collections.sort(listaNomesAuxiliar);
        System.out.println(listaNomesAuxiliar);
        Collections.reverse(listaNomesAuxiliar);
        System.out.println(listaNomesAuxiliar);
    }
    
  
}
