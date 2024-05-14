# Contador de Números

Este programa em Java permite contar e imprimir uma sequência de números entre dois valores fornecidos pelo usuário via terminal.

## Funcionalidades

- Recebe dois parâmetros via terminal, que representam dois números inteiros.
- Verifica se o segundo parâmetro é maior que o primeiro.
- Se o segundo parâmetro for maior que o primeiro, conta e imprime os números entre os dois parâmetros.
- Se o primeiro parâmetro for maior que o segundo, lança uma exceção `ParametrosInvalidosException` com a mensagem "O segundo parâmetro deve ser maior que o primeiro".
- Exibe a contagem dos números no console.

## Execução

Para executar o programa, siga os passos abaixo:

1. Certifique-se de ter o JDK (Java Development Kit) instalado no seu sistema.

2. Clone este repositório:

    ```
    git clone https://github.com/igorribeir0/DesafioControleFluxo.git
    ```

3. Navegue até o diretório do projeto:

    ```
    cd DesafioControleFluxo
    ```

4. Compile o programa:

    ```
    javac Contador.java
    ```

5. Execute o programa:

    ```
    java Contador
    ```

6. Siga as instruções fornecidas pelo programa para digitar os valores dos parâmetros.

## Exemplo

```bash
Digite o primeiro parâmetro
10
Digite o segundo parâmetro
15
Imprimindo o número 10
Imprimindo o número 11
Imprimindo o número 12
Imprimindo o número 13
Imprimindo o número 14
Imprimindo o número 15
```
### Exceções
Se o segundo parâmetro for menor ou igual ao primeiro, uma exceção ParametrosInvalidosException será lançada com a seguinte mensagem:

## Código
```bash
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
```
## Autor 
Feito por: [Igor Ribeiro Silvano](https://www.linkedin.com/in/igor-ribeiro-silvano-2a91011bb/) - Linkedin
