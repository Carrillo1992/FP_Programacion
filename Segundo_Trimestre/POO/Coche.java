package Segundo_Trimestre.POO;

public class Coche {
    private String marca;
    private String modelo ;
    private int velocidad;

    public Coche(String marca , String modelo ){ //Supongamos que el coche esta quieto es decir la velocidad es 0
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    // Getter
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getVelocidad(){
        return velocidad;
    }

    //Setter

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setVelocidad(int velocidad){
        if(velocidad > 0){
            this.velocidad = velocidad;
        }else{
            System.out.println("La velocidad no puede ser negativa");
        }
    }

    // Metodos para acelerar y frenar

    public void acelerar( int acelerar){
        if(acelerar>0){
            velocidad+=acelerar;
            System.out.println("El coche ahora va más rápido. Su velocidad actual es de "+velocidad+ "km/h.");
        }else{
            System.out.println("la aceleración no puede ser negativa");
        }
    }

    public void frenar ( int desacelerar){
        if(desacelerar>0 && velocidad - desacelerar >= 0){
            velocidad-=desacelerar;
            System.out.println("El coche ahora va más lento, su velocidad actual es de "+velocidad+"km/h.");
        }else if (desacelerar>0){
            System.out.println("la velocidad no puede quedar en numeros negativos");
        }else {
            System.out.println("El decremento debe ser un número positivo, por lo que no ha cambiado la velocidad al intentar frenar.");
        }
    }

    public static void main(String[] args) {
        // Crearemos un coche de ejemplo.
        Coche miCoche = new Coche("KIA", "Ceed");

        System.out.println("Mi coche es un "+miCoche.getMarca()+" "+miCoche.getModelo() +" que ahora va a "+miCoche.getVelocidad()+"km/h." );
        miCoche.setVelocidad(100);
        System.out.println("Mi coche va a "+miCoche.getVelocidad()+"km/h.");
        miCoche.frenar(40);
    }
}
