package S2.AC3;

public class AgenciaPostal {

    public static void main(String[] args) {
        
        Correo anuncio1 = new Anuncio(100, true, "Chorrillos", false, 100);
        Correo paquete1 = new Paquete(300, false, "Surco", false, 200, 20);
        Correo carta1 = new Carta(200, true, "Miraflores", true, "A4" , 50);
        Correo carta2 = new Carta(160, false, "Comas", false, "A5", 20);
        Correo paquete2 = new Paquete(500, true, "La Molina", false, 300, 30);

        Caja caja1 = new Caja();
        caja1.agregarCorreo(anuncio1);
        caja1.agregarCorreo(paquete1);
        caja1.agregarCorreo(carta1);
        caja1.agregarCorreo(carta2);
        caja1.agregarCorreo(paquete2);

        caja1.verDetalleCorreos();

        int correosInvalidos = caja1.obtenerCorreosInvalidos();
        System.out.println("\nLa cantidad de correos inválidos es: " + correosInvalidos);
        
        double importeTotal = caja1.calculateImporteTotalCorreos();
        System.out.println("\nEl importe total de todos los correos es: " + importeTotal);
        System.out.println("\n ");
    }
}
