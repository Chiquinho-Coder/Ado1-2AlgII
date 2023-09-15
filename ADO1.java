/*
Entrega a Atividade 1 - Algoritmos e Programação II

Nós,

Pedro Henrique Pinheiro de Oliveira
Gustavo de Medeiros Sanchez
Washington Oliveira da Silva

declaramos que todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/



import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Random rng = new Random();
    int operation = 0;
    System.out.println("\nBem vindo ao Amazing Mega Blaster Nine F*cking Options Progam HAHAHAHAHAHA");

    //while faz com que o programa se repita até a pessoa escolher a opçao 9
    while (!(operation == 9)) {

      System.out.printf("\n Escolha uma das opçoes abaixo: \n\n 1: Inicializar o vetor com números aleatórios \n\n 2: Imprimir o vetor \n\n 3: Verificar se um determinado número está contido no vetor \n\n 4: Buscar o maior número armazenado no vetor \n\n 5: Calcular a média dos números pares armazenados no vetor \n\n 6: Calcular o percentual dos números ímpares armazenados no vetor \n\n 7: Calcula a média centralizada dos números armazenados no vetor \n\n 8: Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado \n\n 9: Encerrar programa \n\n");

      operation = ler.nextInt();
      int op = operation; //esse variavel é apenas para tornar mais curto e legivel a condiçao da opçao default, que deve estar na linha 86
      
      switch (operation){
        
        case 1:
          System.out.println("\n informe o tamanho do vetor:");
          int size = ler.nextInt();
          System.out.println("\n informe o numero limite do seu vetor::");
          int roof = ler.nextInt();

          int[] theArray = new int[size];

          for (int i = 0; i < size; i++) {
            int num = rng.nextInt(roof) + 1; // soma +1 para que o roof seja o maior numero e nao o excludente
            theArray[i] = num;
        }
          
          break;
       
        case 2:
          System.out.println("\nopissao 2");
          break;
        
        case 3:
          System.out.println("\nopissao 3");
          break;
        
        case 4:
          System.out.println("\nopissao 4");
          break;
       
        case 5:
          System.out.println("\nopissao 5");
          break;
       
        case 6:
          System.out.println("\nopissao 6");
          break;
       
        case 7:
          System.out.println("\nopissao 7");
          break;
       
        case 8:
          System.out.println("\nopissao 8");
          break;

        case 9:
          System.out.println("\nTchau");
          break;
       
        default:
          if(op != 0||op != 1||op !=2||op !=3||op !=4||op !=5||op !=6||op !=7||op !=8||op !=9){
            System.out.println("\nFavor escolher uma opçao válida!!"); //esse if é enorme eu sei, mas serve para que algo aconteça se uma opçao invalida for selecionada
          }
          
      }
     
    }
  }
}
// tudo que for escrito entre ("") deve ter um '\n' antes para que possa ter um espaçamento agradavel aos olhos no console, xuxu beleza 👍