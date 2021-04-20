public class Arithmetic {

    private int a;
    private int b;


    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void addition () {
        System.out.println (a + " + " + b + " = " + (a + b) );

    }

    public void subtraction () {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public void average () {
        double c = (a + b) / 2.0;
        System.out.println("(" + a + " + " + b  + ") / 2" + " = " + c );
    }

    public void max () {
        int d;
        if ( a >= b ) { d = a;}
        else { d = b;}

        System.out.println("Максимальное число: " + d );
    }

    public void min () {
        int d;
        if ( a <= b ) { d = a;}
        else { d = b;}

        System.out.println("Минимальное число: " + d );
    }
}
