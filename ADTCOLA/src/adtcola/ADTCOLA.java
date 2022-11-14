/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adtcola;

/**
 *
 * @author ernst
 */
public class ADTCOLA {
     Lista cola;
    
    public ADTCOLA(){
        this.cola = new Lista();
    }
    
    public boolean is_empty(){
        return this.cola.estaVacia();
    }
    
    public int getLength(){
        return this.cola.getLength();
    }
    
    public void enqueue(T valor){
        this.cola.agregarAlFinal(valor);
    }
    
    public T dequeue(){
        Object xd = this.cola.regresarInicio();
        cola.eliminarElPrimero();
        return (T)xd;
    }
    
    public void transversal(){
        this.cola.transversal();
    }

    @Override
    public String toString() {
        return "ADCTCOLA{" + "cola=" + (T)cola + '}';
    }
    
    
    
    public static void main(String[] args) {
        ADTCOLA fila = new ADTCOLA();
      fila.enqueue(1);
      fila.enqueue(2);
      fila.enqueue(5);
        System.out.println(fila.getLength());
        fila.transversal();
        
    }
}