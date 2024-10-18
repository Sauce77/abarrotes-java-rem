package Mapeos;
// Generated 27/10/2014 08:16:01 AM by Hibernate Tools 4.3.1



/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private Integer noEmpleado;
     private String nombreEmpleado;
     private String password;
     private String apellPatEmpleado;
     private String apellMatEmpleado;
     private String fechaNac;
     private String rfce;
     private int salario;
     private String estadoCivil;
     private String estatus;
     private String nivelEstudio;
     private String tipoUsuario;

    public Empleado() {
    }

	
    public Empleado(String rfce, int salario) {
        this.rfce = rfce;
        this.salario = salario;
    }
    public Empleado(String nombreEmpleado, String password, String apellPatEmpleado, String apellMatEmpleado, String fechaNac, String rfce, int salario, String estadoCivil, String estatus, String nivelEstudio, String tipoUsuario) {
       this.nombreEmpleado = nombreEmpleado;
       this.password = password;
       this.apellPatEmpleado = apellPatEmpleado;
       this.apellMatEmpleado = apellMatEmpleado;
       this.fechaNac = fechaNac;
       this.rfce = rfce;
       this.salario = salario;
       this.estadoCivil = estadoCivil;
       this.estatus = estatus;
       this.nivelEstudio = nivelEstudio;
       this.tipoUsuario = tipoUsuario;
    }
   
    public Integer getNoEmpleado() {
        return this.noEmpleado;
    }
    
    public void setNoEmpleado(Integer noEmpleado) {
        this.noEmpleado = noEmpleado;
    }
    public String getNombreEmpleado() {
        return this.nombreEmpleado;
    }
    
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getApellPatEmpleado() {
        return this.apellPatEmpleado;
    }
    
    public void setApellPatEmpleado(String apellPatEmpleado) {
        this.apellPatEmpleado = apellPatEmpleado;
    }
    public String getApellMatEmpleado() {
        return this.apellMatEmpleado;
    }
    
    public void setApellMatEmpleado(String apellMatEmpleado) {
        this.apellMatEmpleado = apellMatEmpleado;
    }
    public String getFechaNac() {
        return this.fechaNac;
    }
    
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getRfce() {
        return this.rfce;
    }
    
    public void setRfce(String rfce) {
        this.rfce = rfce;
    }
    public int getSalario() {
        return this.salario;
    }
    
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    public String getNivelEstudio() {
        return this.nivelEstudio;
    }
    
    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }
    public String getTipoUsuario() {
        return this.tipoUsuario;
    }
    
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }




}


