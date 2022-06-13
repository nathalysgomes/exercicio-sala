import java.util.Scanner;

public class exerciciosala2 
{
 public static void main(String[] args) {
 Scanner ler = new Scanner (System.in);

{
    int soma=0;
    // Declarado variavel soma e atribuido o valor de 0
    int Q[]={35,4,22,20,36,30};
    // Declarado variavel inteira vetor Q[] com 6 valores: 35,4,22,20,36,30
    int media = 0;
    // Declarado variavel inteira media e atribuido o valor de 0
    int i = 0;
    // Declarado variavel inteira i e atribuido o valor de 0

    do{
    // Comando faca    
        soma = soma + Q[i];
        // Atribuido na variavel soma o valor de soma + variavel Q[variavel i]
        i++;
        // Soma + 1 na variavel i
    }
    while (i < 6);
    // Enquanto (variavel i for menor que 6)
    media = soma /6;
    // Atribuido na variavel media, valor de variavel soma dividido por 6

    System.out.printf ("A media de todas as salas e:%d",media); 
    // Exibe "A media de todas as salas e:" e valor da variavel media 
int n = 0;
// Declarado variavel inteira n e atribuido o valor de 0
int s = 1;
// Declarado variavel inteira s e atribuido o valor de 1
do {
// Comando faca
    if (Q[n] > media){
    // Comando se (variavel Q[variavel n] for menor que variavel media)
        System.out.printf("\nA sala "+s+" esta com numero de alunos acima da media: "+Q[n]);
        // Exibe "A sala variavel s esta com numero de alunos acima da media" variavel Q[variavel n]
    }
    if (Q[n] < media){
    // Se (variavel Q[variavel n] for menor que variavel media)
        System.out.printf("\nA sala "+s+" esta com numero de alunos abaixo da media: "+Q[n]);
        // Exibe "Na sala variavel s esta com numero de alunos abaixo da media:" variavel Q[variavel n]
    }
    n++;
    // Acrescenta + 1 na variavel n
    s++;
    // Acrescenta + 1 na variavel s
} while (n<6);
// Comando enquanto (variavel n for menor que 6)
}
}
}
