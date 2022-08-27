public class user {
    private int id;
    private String nombre;
    private String apellido;
    private String adress;
    private String phone;

    public user(int id, String nombre, String apellido, String adress, String phone){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.adress = adress;
        this.phone = phone;
    }

    public int getid(){
        return id;  
    }
    public String getNombre(){
        return nombre;  
    }
    public String getApellido(){
        return apellido;
    }
    public String getadress(){
        return adress;
    }
    public String getphone(){
        return phone;  
    }

}
