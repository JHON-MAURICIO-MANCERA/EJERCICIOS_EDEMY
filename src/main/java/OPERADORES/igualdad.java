package OPERADORES;

public class igualdad {
    public static void main(String[] args) {
        int g=5, f=5;
        boolean c= g==f;
        System.out.println("c = " + c); 
        
        c = g!=f;
        System.out.println("c = " + c);

        // para string se utiliza equals
        String a="camilo";
        String b="sofia";

        System.out.println(a.equals(b));
    }
}
