
public class EjercicioConSuerte {
    //Atributos de clase
    public int num1;
    public int num2;
    public int num3;
    public int suma=20;
    public int notaExamen;
    
    
    //Metodo
    public double notas(){
        
        if(notaExamen<35){  
            notaExamen=num1+num2+num3;
        }else{
            notaExamen=20;
        }
      
        return notaExamen;
    }
    
}
