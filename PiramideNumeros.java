package jProj.accJava.semana1;

public class PiramideNumeros {
    public static void main(String[] args) {
        int x = 5;
        for(int i = 1; i<=x; i++){
            String msg = "";
            for(int j = 0; j<i; j++){
                msg += i;
            }
            System.out.println(msg);
        }
    }
}
