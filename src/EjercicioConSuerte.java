
public class EjercicioConSuerte {
    //Atributos de clase
    public double num1;
    public double num2;
    public double num3;
    public int suma=20;
    public double notaExamen;
    
    
    //Metodo
    public double notas(double num1,double num2, double num3){
        notaExamen=num1+num2+num3;
        
        if(notaExamen<35){  
            
        }else{
            notaExamen=suma;
        }
      
        return notaExamen;
    }
    
}
