import java.util.Scanner;


public class exercicio2
{   
    public static void main(String[] args){
        double salario, salariomin, qtdsalarios;
        System.out.println("O seu salário atual é: ");
        salario = new Scanner(System.in).nextInt();
        System.out.println("O salário minimo atual é: ");
        salariomin = new Scanner(System.in).nextInt();
        qtdsalarios = salario/salariomin;
        System.out.println( "Você ganha o equivalente a " +qtdsalarios+ " salarios minimos");
    
    }
    

    
}
