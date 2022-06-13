import java.util.Scanner;

public class exerciciosala 
{
 public static void main(String[] args) {
 Scanner ler = new Scanner (System.in);

{
    int soma=0;
    // Declarado variavel inteira soma e atribuido valor de 0
    int Q[]={35,4,22,20,36,30};
    // Declarado variavel inteira em vetor de tamanhi 6, valendo 35, 4, 22, 20, 36, 30
    int valor1 = 0;
    // Declarado variavel inteira valor1 e atribuido valor de 0
    int valor2 = 0;
    // Declarado variavel inteira valor2 e atribuido valor de 0
    int quantidadesala = 0;
    // Declarado variavel inteira quantidade 0 e atribuido valor de 0

    System.out.printf("No bloco Q da universidade, existem 6 salas. Digite o numero da sala desejada:");
    // Exibe "No bloco Q da universidade, existem 6 salas. Digite o numero da sala desejada:"
    valor1 = ler.nextInt();
    // Realiza a leitura da variavel valor1
    System.out.printf ("O numero de pessoas da sala escolhida e:%d", Q[valor1-1]);
    // Exibe "O numero de pessoas da sala escolhida e:" e valor da variavel Q[valor1 - 1]

    System.out.printf ("\n\nPara consultar a media de quantidade de alunos, informe o numero de salas que voce deseja consultar:");
    // Exibe "Para consultar a media de quantidade de alunos, informe o numero de salas que voce deseja consultar:" comando \n para quebra de linha
    quantidadesala = ler.nextInt();
    // Realiza a leitura da variavel quantidadesala
    int i = 0;
    // Declarado variavel i e atribuido o valor de 0
    do{
    // Comando faca
        i++;
        // Soma +1 na variavel i
    System.out.printf ("\nInforme o numero da sala para consulta:\n");
    // Exibe "Informe o numero da sala para consulta:"
    valor1 = ler.nextInt();
    // Realiza a leitura da variavel valor1
    soma = soma + Q[valor1-1];
    // Atribuido que variavel soma e igual o valor de soma + variavel Q[variavel valor1 - 1]
    }while (i < quantidadesala);
    // Comando enquanto (variavel i menor que variavel quantidadesala)
    valor2 = soma / quantidadesala;
    // Atribuido que variavel valor2 e igual variavel soma dividido por variavel quantidadesala
    System.out.printf ("A media da sala selecionada e:%d",valor2);
    // Exibe "A media da sala selecionada e:" valor da variavel valor2
 }
}
}
