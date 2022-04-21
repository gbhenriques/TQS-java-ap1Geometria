package dominio;
public class Retangulo {
    private int valor1;
    private int valor2;
    
    public Retangulo(int valor1, int valor2) {
     
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    
    public int area() {
        return valor1 * valor2;
    }
    
    public int perimetro() {
        return (valor1 * 2) + (valor2 * 2);
    }
    
}
