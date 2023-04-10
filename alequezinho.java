
import java.util.Scanner;

public class alequezinho {
    public static void main (String[] args){
        Scanner valor = new Scanner(System.in);
        int num,continua;
        do {
            System.out.println("digite um numero:");
            num = valor.nextInt();
            if (num > 0 ){
                System.out.println("esse numero é positivo");
            } else if (num< 0){
                System.out.println("este numero numero negativo");
            } else{
                System.out.println("este é o numero zero");
            }
            System.out.println("deseja continuar?'-sim,2-nao");
            continua =valor.nextInt();
        } while (continua != 2);
    }
}