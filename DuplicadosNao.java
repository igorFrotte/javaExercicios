package jProj.accJava.semana1;
import java.util.List;
import java.util.ArrayList;

public class DuplicadosNao {
    public static void main(String[] args) {
        String[] lista1 = {"oi", "vish", "bora"};

        List<String> lista2 = new ArrayList<>(); 
        lista2.add("oi");
        lista2.add("eita");
        lista2.add("bora");
        lista2.add("putz");


        for(int i=0; i<=lista1.length; i++){
            if(lista2.contains(lista1[i]))
                System.out.println(lista1[i]);
        }
    }
}
