import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroDois = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroUm= sc.nextInt();

        try {
            contar(parametroDois, parametroUm);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e);
        }
        
        sc.close();
    }

        static void contar(int parameterOne, int parameterTwo) throws ParametrosInvalidosException {
        if(parameterOne > parameterTwo) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parameterTwo - parameterOne;
        for(int i = 0; i < contagem; i++) {
            System.out.println(parameterOne + i + 1);
        }

    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
