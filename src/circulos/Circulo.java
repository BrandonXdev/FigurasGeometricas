
package circulos;
import FigurassGeometricas.FigGeo;


public class Circulo extends FigGeo{
    
    private double radio;
    private static final double PI = Math.PI; 
    private double area;

    public double getRadio() {
        return radio;
    }
    
    public double getDiametro(){
        return radio * 2;
    }
    
    public static double getPI() {
        return PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
        
    @Override
    protected double calcularPerimetro(){
         return 2 * PI  * radio;
    }
    
    @Override
    protected double calcularArea(){ 
        return Math.pow(radio, 2) * PI;  
    }
        
    
}
