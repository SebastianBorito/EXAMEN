package atributos;

public class mainAtributos {
    static void main() {
        atributos A1 = new atributos(3453,"Deslave",3);
        atributos A2 = new atributos(4352,"Terremoto",5);

        A1.setIdetificador(3453);
        A1.setDescripcion("Deslave");
        A1.setPrioridad(3);

        A2.setIdetificador(4352);
        A2.setDescripcion("Terremoto");
        A2.setPrioridad(5);

        A1.mostrarInformacio();
        A2.aumentarPrioridad();
        A2.mostrarInformacio();
        A2.mostrarInformacio();
    }
}
