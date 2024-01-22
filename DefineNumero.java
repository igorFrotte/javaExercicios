package jProj.accJava.semana1;

public class DefineNumero {
    public static void main(String[] args) {
        int x = 8;
        String msg = x + " é ";
        if(x % 2 ==0)
            msg += "par ";
        else msg += "impar ";

        if(x >= 0)
            msg += "e positivo.";
        else msg += "e negativo.";

        System.out.println(msg);
    }
}
