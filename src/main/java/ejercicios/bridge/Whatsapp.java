package ejercicios.bridge;

public class Whatsapp implements IntegrationRedSocial{
    private String name= "Whatsapp";
    @Override
    public void showInfo() {
        System.out.println("Socialnet: "+name);
        System.out.println("Mostrando datos en grupo de Whatsapp...");
    }
}
