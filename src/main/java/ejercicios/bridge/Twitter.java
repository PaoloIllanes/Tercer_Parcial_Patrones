package ejercicios.bridge;

public class Twitter implements IntegrationRedSocial{
    private String name= "Twitter";
    @Override
    public void showInfo() {
        System.out.println("Socialnet: "+name);
        System.out.println("Mostrando datos en feed de Twitter...");
    }
}
