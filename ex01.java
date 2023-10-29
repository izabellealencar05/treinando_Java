/*Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
duas casas decimais, conforme exemplo.*/
package monitoria;
import java.util.Scanner;
import java.util.Locale;
public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double largura;
        double comp;
        double m;
        System.out.print("digite a largura: ");
        largura = scanner.nextDouble();
        System.out.print("digite o comprimento: ");
        comp = scanner.nextDouble();
        System.out.print("digite o valor do metro quadrado: ");
        m = scanner.nextDouble();
        double area = largura * comp;
        double preco = area * m;
        System.out.printf("area do terreno: %.2f\n ", area);
        System.out.printf("preco do terreno: %.2f ", preco);
        scanner.close();
        }
    }

