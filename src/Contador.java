import exceptions.ParametrosInvalidosException;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while(loop) {
            System.out.printf("Digite o primeiro parametro: ");
            String parametroUm = scanner.next();
            System.out.printf("Digite o segundo parametro: ");
            String parametroDois = scanner.next();
            try {
                contar(parametroUm, parametroDois);
                loop = false;
            } catch (ParametrosInvalidosException e) {
                System.out.print("O primeiro parametro deve ser MENOR que o segundo parametro.\n\n");
            } catch (NumberFormatException e) {
                System.out.print("Os parametros necessitam ser numeros INTEIROS.\n\n");
            }
        }
    }
    static int contar(String parametroUm, String parametroDois) throws ParametrosInvalidosException {
        int converterUm = parseInt(parametroUm);
        int converterDois = parseInt(parametroDois);
        int contagem = 1;
        if(converterUm>converterDois){
            throw new ParametrosInvalidosException();
        }
        else{
            for (int inicioContagem=converterUm;inicioContagem<converterDois;inicioContagem++){
                System.out.println("Imprimindo numero " + contagem++);
            }
        }
        return 0;
    }
}
