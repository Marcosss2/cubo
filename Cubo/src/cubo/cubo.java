
package cubo;


public class cubo {
 
 int alto,ancho,profundo;

    public cubo() {
    }

    public cubo(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
 
    public int volumen(){
        
    return   this.alto * this.ancho * this.profundo ; 
        
    }
    
    
    
    
    
}
