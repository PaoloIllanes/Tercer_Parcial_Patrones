package ejercicios.bridge;

public class Facebook implements IntegrationRedSocial{
    private String name= "Facebook";
    @Override
    public void showInfo() {
        System.out.println("Socialnet: "+name);
        System.out.println("Mostrando datos en muro de Facebook...");
    }
}
