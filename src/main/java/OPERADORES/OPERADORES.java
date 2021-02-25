package OPERADORES;

public class OPERADORES {
    public static void main(String[] args) {
        //operador de inversion  "-"
        int a = 3, b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //operador de inversion pára boolean "!"
        boolean c = true;
        boolean d = !c;
        System.out.println("d = " + d);

        //incremento,
        // preincremento
        int f = 3, g = ++f;
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        //posincremento

        int h = 4, l = h++;
        System.out.println("h = " + h);
        System.out.println("l = " + l);

        //predecremento y posdecreemnto

        int r = 4;
        int p = --r;
        System.out.println("p = " + p);
        System.out.println("r = " + r);

        int n = 4;
        int i = n--;
        System.out.println("n = " + n);
        System.out.println("i = " + i);
    }
}
