package controle;
import dominio.Retangulo;
import java.util.Scanner;

public class ControlaRetangulo {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int valor1 = leia.nextInt();
        System.out.print("Digite o segundo valor : ");
        int valor2 = leia.nextInt();
        leia.close();
        
        Retangulo calc = new Retangulo(valor1, valor2);
        
        System.out.println("RESULTADOS");
        System.out.println("Área :" + calc.area());
        System.out.println("Perímetro: " + calc.perimetro());
    }
}