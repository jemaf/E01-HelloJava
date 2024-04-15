import java.util.Scanner;
public class Condicional4 {
    public static void main (String[] args){
        Scanner scanner= new Scanner (System.in);
        System.out.println("Digite a nota do aluno: ");
        int nota= scanner.nextInt();
        if(nota >= 90 && nota<= 100){
            System.out.println("Tirou A");
        }
        if(nota >=80 && nota <=89){
            System.out.println("Tirou B");
        }
        if(nota >= 70 && nota<= 79) {
            System.out.println("Tirou C");
        }
        if(nota >= 60 && nota<= 69) {
            System.out.println("Tirou D");
        }
        if(nota >= 40 && nota<= 59) {
            System.out.println("Tirou E");
        }
        if(nota< 40) {
            System.out.println("Tirou F");
        }
        else{
            System.out.println("Erro");
        }
    }

}
