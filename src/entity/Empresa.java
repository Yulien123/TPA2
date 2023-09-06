package entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author julan
 */
public class Empresa {

    String razonSocial;
    int cuit;
    ArrayList<Empleado> empleados;
    
    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        empleados = new ArrayList<Empleado>();
    }
    
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void mostrarEmpleados() {
        for (Empleado e : empleados) {
            frames.Regristro.model.addRow(new Object[]{e.getEmpresa().GetRazonSocial(),
                e.getNombre(), e.getApellido(), e.getDni() + "", e.getCategoria()});
        }
    }

    public String GetRazonSocial() {
        return razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
    
    @Override
    public String toString() {
        return razonSocial;
    }
    
}
