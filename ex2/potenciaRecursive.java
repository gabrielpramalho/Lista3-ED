package ex2;

public class potenciaRecursive {

    static int pot (int n, int potencia){
        if(potencia == 0){
            return 1;
        }else {
            return pot(n, potencia - 1) * n;
        }
    }


    public static void main(String[] args) {
        int n = 5;
        int potencia = 3;
        int resultado = pot(n, 3);

        System.out.println("O numero "+n+" elevado a "+potencia+" -> "+resultado);
    }
}
