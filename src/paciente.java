public class paciente extends user{
    private String birthday;
    private double weigth;
    private double heigth;
    private String blood;
    
    public paciente(int id, String nombre, String apellido, String adress, String phone){
        super(id, nombre, apellido, adress, phone);
        id = 0;
        nombre = "UNKNOW";
        apellido = "UNKNOW";
        adress = "UNKNOW";
        phone = "UNKNOW";
    }
    public void setbirthday(String birthday){
        this.birthday = birthday;
    }
    public String getbirthday(){
        return birthday;
    }
    public void setweigth(double weigth){
        this.weigth = weigth;
    }
    public double getweigth(){
        return weigth;
    }
    public void setheigth(double heigth){
        this.heigth = heigth;
    }
    public double getheigth(){
        return heigth;
    }
    public void setblood(String blood){
        this.blood = blood;
    }
    public String getblood(){
        return blood;
    }
    //public void showme(){
      //  System.out.println("Nombre: " + getNombre() + " Apellido: " + getApellido() + " Dirección: " + getadress() + " Teléfono: " + getphone() + " Cumpleaños: " + getbirthday() + " Peso: " + getweigth() + " Altura: " + getheigth() + " Sangre " + getblood());
    //}
}
