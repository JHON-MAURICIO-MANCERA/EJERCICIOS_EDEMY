package OPERADORES;

import java.util.Scanner;

public class relacionales {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su edad");
       var txtedad= scanner.nextLine();
        var intedad= Integer.parseInt(txtedad);
        if (intedad >= 18)
            System.out.println("usted es mayir de edad");
          else
            System.out.println("esta chuiquito");

    }
}
