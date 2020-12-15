package ex1;

public class somaRecursive {

        static int soma(int n){
            if(n == 1 ){
                return 1;
            }else {
                return soma(n - 1) + n;
            }
        }

        public static void main(String[] args) {
            System.out.println("Soma -> "+soma(3));
        }




}
