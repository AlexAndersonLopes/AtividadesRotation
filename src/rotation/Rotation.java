package rotation;

import java.util.Scanner;


public class Rotation {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int menu = 9;
        
        while(menu != 0){
            System.out.println("\n\n\t___MENU___");
            System.out.println("\n1 - Atividade 1 \n2 - Atividade 2 \n3 - Atividade 3 \n4 - Atividade 4 \n5 - Atividade 5 \n0 - SAIR");
                System.out.print("\nEscolha a opção número: ");
                menu = sc.nextInt();

            if(menu == 1){
                atividade1();
            }
            if(menu == 2){
                atividade2();
            }
            if(menu == 3){
                atividade3();
            }
            if(menu == 4){
                atividade4();
            }
            if(menu == 5){
                atividade5();
            }
            
        }//FIM DO MENU PRINCIPAL
        
        sc.close();
    }
    
    
    
    public static void atividade1(){
        int soma = 0, k=0;
        
        for(int i=0; i<13; i++){
            k=k+1;
            soma=soma+k;
        }        
        System.out.println("\n\t____Questão 1____");
        System.out.println("A soma = " + soma);
    }//FIM DA ATIVIDADE 1
    
    
    
    public static void atividade2(){
        Scanner sc = new Scanner(System.in);
        
        int a = 0, b = 1, c;
        boolean fibonaci = false;
        System.out.println("\n\t____Questão 2____");
        System.out.print("\nEscolha um numero: ");
        int numero = sc.nextInt();
        
        //CALCULO FIBONACI
        while(b <= numero){           
            if(b == numero){
                fibonaci = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }//FIM DO WHILE
        
            if(b == numero){
                System.out.println("\nO numero " + numero + " faz parte da sequência Fibonaci!!!");                
            }
            else{
                System.out.println("\nO numero " + numero + " não faz parte da sequência Fibonaci!!!");
            }     
    }//FIM DA ATIVIDADE 2
    
    
    
    
    public static void atividade3(){
        System.out.println("\n\t____Questão 3____\n");
        System.out.println("Descubra a lógica e complete o próximo elemento: ");
        System.out.println("a) 1, 3, 5, 7, __9__");
        System.out.println("b) 2, 4, 8, 16, 32, 64, __128__");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, __49__");
        System.out.println("d) 4, 16, 36, 64, __100__");
        System.out.println("e) 1, 1, 2, 3, 5, 8, __13__");
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, __20__");
    }//FIM DA ATIVIDADE 3
    
    
    
     public static void atividade4(){
         System.out.println("\n\t____Questão 4____\n");
         System.out.println("O carro percorreu uma distancia maior, visto que rodou mais rapido que o caminhão"
                 + " e não parou nos pedagios, \nMAS, quando eles se cruzarem na estrada, os dois estarão exatamente "
                 + "na mesma distancia tanto de Franca como de Ribeirão Preto.");
     }// FIM DA ATIVIDADE 4
     
     
     
     
     public static void atividade5(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n\t____Questão 5____\n");
        System.out.print("\n\nDigite seu texto: ");
        String texto = sc.nextLine();        
            String contrario="";
         
        //INVERTER OS CARACTERES DA STRING
        for(int i=texto.length() -1; i>0; i--){
            contrario += texto.charAt(i);
        }
        System.out.println("\n");
        System.out.println(contrario);      
    }//FIM DA ATIVIDADE 5
    
    
    
}
