
package sobrecargasegundomomento;


public class matriculas 
{
    public float valorMatricula(int cantidadMaterias, float valorMateria, float descuento){
        float valorMatricula = (cantidadMaterias * valorMateria) - (cantidadMaterias * valorMateria * descuento/100);
        return valorMatricula;
    }
    
    public float valorMatricula(int cantidadMaterias, float valorMateria){
            return valorMateria * cantidadMaterias;
    }
    
    public float valorMatricula(float valorMateria, int cantidadMaterias, float cantidadVoluntaria){
       return cantidadMaterias * valorMateria + cantidadVoluntaria;
    }
    
    
}
