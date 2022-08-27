public class nurse extends user{
    private String speciality;
    
    public nurse(int id, String nombre, String apellido, String adress, String phone){
        super(id, nombre, apellido, adress, phone);
        id = 0;
        nombre = "UNKNOW";
        apellido = "UNKNOW";
        adress = "UNKNOW";
        phone = "UNKNOW";
    }
    public void setspeciality(String speciality){
        this.speciality = speciality;
    }
    public String getspeciality(){
        return speciality;
    }

    //public void showme(){
      //  System.out.println("Nombre: " + getNombre() + " Apellido: " + getApellido() + " Dirección: " + getadress() + " Teléfono: " + getphone() + " Especialidad: " + getspeciality());
    //}
}
