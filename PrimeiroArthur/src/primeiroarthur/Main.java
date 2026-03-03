/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiroarthur;

import java.util.Scanner;

/**
 * Boolean -> True or False;
 * Logic Always, O que vai entrar ? O que vai Sair ? o que deve ser processado ?;
 * Leia o problema antes;
 * Defina as condições, repetições, funções e procedimentos;
 * Pseudo-Codigo?;
 * Variável, Lógica e Entrada e saída de dados;
 * Altera a saídas e entradas;
 * Estrutura armazenável de dados (Espaço de memória);
 * Qual tipo? Quantitativas (Discretas -> 1,2,..10 e Continuas -> 1.12, 2.45,..10.3 ou qualitativas (Nominais -> Branco,Verde... e Ordinais -> Fraco,Médio, Forte);
 * Sempre dar tipo ( int idade, double ou float preço e char (Caracter) sexo );
 * Nunca começar com número (5b), conter espaço em branco (prova 2), conter caracteres especiais (x^y),
 * Atribuir valor para variável (( = )idade = 27, preço = 18.99, sexo = M );
 * Variável só possui um valor no momento atual;
 * Scanner para receber numero do teclado;
 * Texto + valor variável (System.out.println("Resultado" + soma);
 * Inicializar variável no espaço de memória, para garantir que não tenha lixo na memória;
 * Sempre ; ;
 * Case Sensititive ( A, a )
 * Não é necessário inicializar variável se for receber logo depois
 * @author 32611916
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Meu primeiro programa em Java!");
        Scanner entrada = new Scanner (System.in);
        
        int a, b , soma, subtracao, multiplicacao;
        double divisao;
    System.out.println("Digite dois numeros");
    a = entrada.nextInt();
    b = entrada.nextInt();
    
    
    soma = a+b;
    subtracao = a-b;
    divisao = a/b;
    multiplicacao = a*b;
    
    //imprime uma soma
    //System.out.println("Resultado = " + soma);
    System.out.println( a + " + " + b + " = " + soma);
    System.out.println( a + " - " + b + " = " + subtracao);
    System.out.println( a + " / " + b + " = " + divisao);
    System.out.println( a + " * " + b + " = " + multiplicacao);
    
        
    }
    
    
        
        
        
    }
    
    
    
}
