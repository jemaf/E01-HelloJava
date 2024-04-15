import java.util.Scanner;
public class Condicional3 {
    public static void main (String[] args){
        Scanner scanner= new Scanner (System.in);
        System.out.println("Digite a nota do aluno: ");
        int nota= scanner.nextInt();
        if(nota >= 60 && nota<= 100){
            System.out.println("Passou de ano");
        }if(nota >=0 && nota < 60){
            System.out.println("Repetiu de ano");
        }else{
            System.out.println("Erro");
        }
    }

}
