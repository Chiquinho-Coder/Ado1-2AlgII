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
      int op = operation; /* esse variavel é apenas para tornar mais curto e legivel a condiçao na opçao 'default' do 'switch'/* */
                           

      switch (operation) {

        case 1:
          System.out.println("\n Informe o tamanho do vetor:");
          int size = ler.nextInt();
          System.out.println("\n Informe o numero limite do seu vetor::");
          int roof = ler.nextInt();

          
          theArray = new int[size];                                              

          for (int i = 0; i < size; i++) {
            int num = rng.nextInt(roof + 1);
            theArray[i] = num;
          }

          break;

        case 2:
        case2Print(theArray);
          break;

        case 3:
          System.out.println("\nInforme o valor que deseja procurar no vetor: ");
          int numSearch = ler.nextInt();
          int numHas = case3Search(theArray, numSearch);
          if (numHas == -1){
            System.out.println("\nO numero " + numSearch + " nao foi encontrado no vetor");
          }
          else{
            System.out.println("\nO numero "+ numSearch + " foi encontrado no vetor");
          }
          break;
                                                                                                                                                                                                                                                                                                  //ඞ
        case 4:
          int roofNum = case4Roof(theArray);
          System.out.println("\nO maior numero do vetor é: "+roofNum);
          break;

        case 5:
          double media = case5Media(theArray);
         if (media == 0.0){
          System.out.println("\nNao existe numeros pares no vetor");
         }
          else{System.out.println("\nA média dos numeros pares no vetor é: "+ media);
        }
          break;

        case 6:
          double numPorcent = case6Porcentual(theArray);
          System.out.println("\nO percentual dos números ímpares armazenados no vetor é: " + numPorcent + "%");
          break;

        case 7:
        double mediaCentral = case7Media(theArray);
        System.out.println("\nA media centralizada do vetor é " + mediaCentral);
          
          break;

        case 8:
          System.out.println("\nopissao 8");
          break;

        case 9:
          System.out.println("\nSistema Encerrado!");
          break;

        default:
          if (op != 0 || op != 1 || op != 2 || op != 3 || op != 4 || op != 5 || op != 6 || op != 7 || op != 8
              || op != 9) {
            System.out.println("\nFavor escolher uma opçao válida!!"); /*  esse if é enorme eu sei, mas serve para que
                                                                              algo aconteça se uma opçao invalida for
                                                                              selecionada ao inves de só nao acontecer nada e voltar para o inicio do loop */
          }

      }
      
      }
  }
     //Funcao 2
   public static void case2Print (int[] theArray) {
    for (int i = 0; i < theArray.length; i++){ //percorre cada digito do vetor e printa ele
      System.out.printf(theArray[i] + " ");
    }
    
     } 
     //Funcao 3
    public static int case3Search(int[] theArray, int num ) {
      for (int i = 0; i < theArray.length; i++){
        if (theArray[i] == num){
          return i;
        }
      }
      return -1;
    }

     //Funcao 4
    public static int case4Roof(int[] theArray){
      int roofNum = theArray[0];
      for (int i = 0; i < theArray.length; i++){
        if(theArray[i] > roofNum){
          roofNum = theArray[i];
        }
      }
      return roofNum;
    }

     //Funcao 5
     public static double case5Media(int[] theArray){
      double result = 0;
      double pairQtd = 0;
      for (int i = 0; i < theArray.length; i++){
        if(theArray[i] % 2 == 0) { //se dividido por 2 o numero resultar em 0 entao ele é par e é somado na conta, e aumenta o contador de numeros pares
          result += theArray[i];
          pairQtd++;
        }
      }
      if (pairQtd == 0){ //se o contador estiver marcado como 0 significa que nao teve numeros pares no vetor entao foi impossivel realizar a conta
        return 0.0;
      }else{
          return result / pairQtd;
        }
      }

     //Funcao 6
     public static double case6Porcentual (int[] theArray){
      double impar = 0;
      for(int i = 0;i < theArray.length; i++){
       if(theArray[i] % 2 == 1){   //Este if vai separar os impares
          impar ++;
        }
      }
      double porcent = (double)impar / theArray.length * 100;   //Aqui vamos traformar os numero impares de tipo double para porcentagem
      return porcent;
     }

     //Funcao 7
    public static double case7Media(int[] theArray) {
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

   return resposta;
}

    }
     //==================================================================FUNCAO 8==================================================================
// tudo que for escrito entre ("") deve ter um '\n' antes para que possa ter um
// espaçamento agradavel aos olhos no console, xuxu beleza 👍
