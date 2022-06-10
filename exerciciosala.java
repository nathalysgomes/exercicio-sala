import java.util.Scanner;

public class exerciciosala 
{
 public static void main(String[] args) 
{
    int soma=0;
    //Declarado variavel soma igual a zero
    int Q[]={35,4,22,20,36,30};
    //Entrada de valores do vetor
    int n = Q.length;
    //Declarado variavel inteira n igual ao tamanho do vetor
    for (int C=0; C<n;C++)
    //Laco de repeticao: se variavel c igual a zero for menor que variavel n soma +1
{
        soma=soma+Q[C];
        //Atribuicao do valor de soma + vetor Q
{ 
   System.out.println ("A media e:"+(int)(soma/n));
   //Exibe a media de vetores
}
}
}
}