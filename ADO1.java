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
    int[] theArray = null;
   
   
    System.out.println("\n== Bem vindo ao Programa da Ado1 ==");

    // while faz com que o programa se repita até a pessoa escolher a opçao 9
    while (!(operation == 9)) {

      System.out.printf("\n\n===============================================\n\n Escolha uma das opçoes abaixo: \n\n 1: Inicializar o vetor com números aleatórios \n\n 2: Imprimir o vetor \n\n 3: Verificar se um determinado número está contido no vetor \n\n 4: Buscar o maior número armazenado no vetor \n\n 5: Calcular a média dos números pares armazenados no vetor \n\n 6: Calcular o percentual dos números ímpares armazenados no vetor \n\n 7: Calcula a média centralizada dos números armazenados no vetor \n\n 8: Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado \n\n 9: Encerrar programa \n\n===============================================\n\n");

      operation = ler.nextInt();
      int op = operation; /* esse variavel é apenas para tornar mais curto e legivel a condiçao da opçao
                           default/* */

      switch (operation) {
        case 1:
          System.out.println("\n Informe o tamanho do vetor:");
          int size = ler.nextInt();
          System.out.println("\n Informe o numero limite do seu vetor::");
          int roof = ler.nextInt();

          theArray = new int[size];                                                             

          for (int i = 0; i < size; i++) {
            int num = rng.nextInt(roof) + 1; // soma +1 para que o roof seja o maior numero e nao o excludente
            theArray[i] = num;
          }

          break;

        case 2:
        printar(theArray);
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
          case6Porcentual(theArray);
          break;

        case 7:
          case7Media(theArray);
          
          break;

        case 8:
          System.out.println("\nopissao 8");
          break;

        case 9:
          System.out.println("\nTchau");
          break;

        default:
          if (op != 0 || op != 1 || op != 2 || op != 3 || op != 4 || op != 5 || op != 6 || op != 7 || op != 8
              || op != 9) {
            System.out.println("\nFavor escolher uma opçao válida!!"); /*  esse if é enorme eu sei, mas serve para que
                                                                              algo aconteça se uma opçao invalida for
                                                                              selecionada */
          }

      }
      
      }
  }
   //==================================================================FUNCAO 2==================================================================
   public static void printar (int[] theArray) {
    for (int i = 0; i < theArray.length; i++){
      System.out.println(theArray[i] + " ");
    }
    
     } 
     //==================================================================FUNCAO 3==================================================================

     
     //==================================================================FUNCAO 4==================================================================


     //==================================================================FUNCAO 5==================================================================


     public static void case6Porcentual (int[] theArray){
      double impar = 0;
      for(int i = 0;i < theArray.length; i++){
       if(theArray[i] % 2 == 1){   //Este if vai separar os impares
          impar ++;
        }
      }
      double porcent = (double)impar / theArray.length * 100;   //Aqui vamos traformar os numero impares de tipo double para porcentagem
      System.out.println("\nO percentual dos números ímpares armazenados no vetor é: " + porcent + "%");
     }

    public static void case7Media(int[] theArray) {
      int max = theArray[0];
      int min = theArray[0];
      double total = 0;

      for(int valor : theArray){ 
        if(valor<min){
          min = valor; 
        }   
        if(valor>max){    //forEach para verificar todos os valores do vetor
         max = valor;
        }
        total += valor;
        }
      
   total -=(min + max); 
   double resposta=(double) total  / (theArray.length -2); //Calculo da media centralizada

   System.out.println("\nA media centralizada do vetor é " + resposta);
}

    }
     //==================================================================FUNCAO 8==================================================================
// tudo que for escrito entre ("") deve ter um '\n' antes para que possa ter um
// espaçamento agradavel aos olhos no console, xuxu beleza 👍
