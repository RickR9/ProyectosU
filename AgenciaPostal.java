package S2.AC3;

import java.util.ArrayList;
import java.util.List;

public class AgenciaPostal {

    public static void main(String[] args) {
        
        Anuncio anuncio1 = new Anuncio(100, true, "Chorrillos");
        Paquete paquete1 = new Paquete(300, false, "Surco");
        Carta carta1 = new Carta(200, true, "Miraflores");
        Carta carta2 = new Carta(160, false, "Comas");
        Paquete paquete2 = new Paquete(500, true, "La Molina");

        Caja caja1 = new Caja();
        caja1.agregarCorreo(anuncio1);
        caja1.agregarCorreo(paquete1);
        caja1.agregarCorreo(carta1);
        caja1.agregarCorreo(carta2);
        caja1.agregarCorreo(paquete2);


        double importeTotal = caja1.calculateImporteTotalCorreos();
        System.out.println("El importe total de todos los correos es: " + importeTotal);

        caja1.verDetalleCorreos();

        int correosInvalidos = caja1.obtenerCorreosInvalidos();
        System.out.println("La cantidad de correos inválidos es: " + correosInvalidos);
        
    }
}
