package ex3;

public class somaVetRecursive {

    static int somaVet (int vet[], int tam){
        if (tam < 0){
            return 0;
        }else {
           if (vet[tam] % 2 == 0){
               return vet[tam] += somaVet(vet, tam-1);
           }else {
               return somaVet(vet, tam - 1);
           }
        }
    }

    public static void main(String[] args) {
        int vet[] = new int[10];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = i + 1;
        }

        int soma = somaVet(vet, vet.length - 1);

        System.out.println(soma);



    }

}
