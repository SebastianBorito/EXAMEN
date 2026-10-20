package atributos;

public class atributos {
    private int idetificador;
    private String descripcion;
    private int prioridad;
    int cont = 0;

    public atributos(int idetificador,String descripcion,int prioridad){
        cont ++;
        System.out.println("Alerta "+cont+" creada correctamente");
    }

    public void aumentarPrioridad(){
        prioridad ++;
        if(prioridad > 5){
            System.out.println("La prioridad supera el 5");
            prioridad --;
        }
    }


    public void setIdetificador(int idetificador){
        if( idetificador > 0){
            this.idetificador = idetificador;
        } else {
            System.out.println("El identificador no puede ser negativo");
        }
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setPrioridad(int prioridad){
        if(prioridad >= 1 && prioridad <= 5) {
            this.prioridad = prioridad;
        } else {
            System.out.println("ERROR El rango es entre 1 - 5");
        }
    }

    public int getIdetificador(){
        return idetificador;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public int getPrioridad(){
        return prioridad;
    }

    public void mostrarInformacio(){
        System.out.println(getIdetificador()+" "+getDescripcion()+" "+getPrioridad());
    }



}
