package S2.AC3;

import java.util.ArrayList;
import java.util.List;

public class Caja {

    private List<Correo> correos;

    public Caja() {
        this.correos = new ArrayList<>();
    }

    public void agregarCorreo(Correo nuevoCorreo) {
        correos.add(nuevoCorreo);
    }

    public double calculateImporteTotalCorreos(){
        
        double total = 0;

        for (Correo correo : correos){
            total += correo.calculateImporteTotal();
        }
        return total;
    }

    public void verDetalleCorreos(){

        System.out.println("Detalle de los correos");
        for (Correo correo : correos){
            correo.verDetalle();
        }
    }

    public int obtenerCorreosInvalidos(){

        int ce = 0;
        for (Correo correo : correos){
            if (correo.isEsNoValido()==false) {
                ce++;
            }
        }
        return ce;
    }
}
