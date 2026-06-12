
package FigurassGeometricas;


public abstract class FigGeo {
    
    protected double perimetro; // se ponen protegidos para que la clase hija los puedan usar 
    protected double area;

    public double getPerimetro() {  
        return perimetro;
    }

    public double getArea() {
        return area;
    }  
    
   public abstract double calcularPerimetro();
   public abstract double calcularArea();
       
}
