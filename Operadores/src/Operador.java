public class Operador {
    public static void main(String[] args) {
        
        //Primeira parte da Soma        
        int a = 5;
        int b = 6;
        int a1 = 6 * a;
        int parteUm = (int) Math.pow(a1, 2) / b;
        
        //Segunda parte da soma
        int c = -4;
        int d = -5;
        int cd = c * d;
        int dc = cd / 2;
        int parteDois =  (int) Math.pow(dc, 2);
        
        //Terceira parte da soma
        int terceira = parteUm - parteDois;
        int aTerceira = (int) Math.pow(terceira, 3);
        int e = (int) Math.pow(10, 3);

        //Quarta parte da soma
        int soma = aTerceira / e;
        System.out.println(soma);

    }
}
