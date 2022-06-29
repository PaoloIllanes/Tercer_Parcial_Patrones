package ejercicios.proxy;

public class Usuario {
    private int id;
    private String password;
    private String nombre;


    public Usuario(String nombre,int id, String password){
        this.password=password;
        this.id=id;
        this.nombre= nombre;
    }

    public void showInfo(){
        System.out.println("Id: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("----------------------");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
