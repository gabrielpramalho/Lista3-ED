package ex4;

public class passwordRecursive {

    static long reconheceSenha(long senha, long tentativa){
        if (senha == tentativa){
            return tentativa;
        }else {
            return reconheceSenha(senha, tentativa+1);
        }
    }
    
    public static void main(String[] args) {
        long senha = 9999;

        long senhaReconhecida = reconheceSenha(senha, 00000);

        System.out.println("A senha correta é: "+senha+" e a senha reconhecida é -> "+senhaReconhecida);
    }

}
