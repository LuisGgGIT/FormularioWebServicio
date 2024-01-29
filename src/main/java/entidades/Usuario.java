package entidades;


public class Usuario {

    private int usuario_id;
    private String usuario_uuid;
    private String contrasenia; 
    private String email;
    private String curp;
    
    private String edad;
    private String fecha_nacimiento; 
    private String fecha_registro;

    public Usuario(String email, String contrasenia, String curp, String edad, String fecha_nacimiento) {
        this.email = email;
        this.contrasenia = contrasenia;
        this.curp = curp;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Usuario(String usuario_uuid, String contrasenia, String email, String curp, String edad, String fecha_nacimiento) {
        this.usuario_uuid = usuario_uuid;
        this.contrasenia = contrasenia;
        this.email = email;
        this.curp = curp;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Usuario() {
        
    }

    public Usuario(String usuario_uuid) {
        this.usuario_uuid = usuario_uuid;
    }
   
    public String getUsuario_uuid() {
        return usuario_uuid;
    }

    public void setUsuario_uuid(String usuario_uuid) {
        this.usuario_uuid = usuario_uuid;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    

    
}
