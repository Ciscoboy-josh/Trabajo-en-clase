import java.util.Scanner;

public class edad{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        System.out.println("ingresa tu sexo (H = Hombre) y (M =Mujer)");
        char sexo = sc.next().charAt(0);
        
        if(sexo == 'H' & edad == 18){
        System.out.println("vas a servicio militar");
        }else{
        System.out.println("Eres mujer o tienes menos de 18");}

        
    















    }








}



