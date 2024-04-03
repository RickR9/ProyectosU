package S2.AC3;

import java.util.ArrayList;
import java.util.List;

public class Caja {

    private List<Correo> bandeja;

    public Caja() {
        this.bandeja = new ArrayList<>();
    }

    public void agregarCorreo(Correo nuevoCorreo) {
        bandeja.add(nuevoCorreo);
    }

    public double calculateImporteTotalCorreos(){
        
        double total = 0;

        for (Correo correo : bandeja){
            total += correo.calculateImporteTotal();
        }
        return total;
    }

    public void verDetalleCorreos(){

        System.out.println("Detalle de los correos");
        for (Correo correo : bandeja){
            correo.verDetalle();
        }
    }

    public int obtenerCorreosInvalidos(){

        int ce = 0;
        for (Correo correo : bandeja){
            if (correo.isEsNoValido()==false) {
                ce++;
            }
        }
        return ce;
    }
}
