package modelos;

public class Materia {
    public String codigo;
    public String nombre;
    public String facultad;
    public double notaInicial;
    public double notaFinal;
    public double notaTotal;
    
    public double CalcularNotaTotal(){
        return (notaInicial+notaFinal)/2;
    }
    
    public double CalcularNotaInicialFinal(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
        double notaPractico=(ntalleres)*0.20;
        return notaTeorico+notaPractico;
    }
}
