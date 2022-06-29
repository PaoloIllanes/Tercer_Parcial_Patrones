package ejercicios.bridge;

public class Client {
    public static void main(String[]args){

        String[]estudiantes1={"jose","juan","fernando"};
        String[]estudiantes2={"pedro","pablo","dylan"};
        String[]estudiantes3={"patricio","silvia","maria"};
        ISistemaInscripcion sistemaInscripcion1 = new SistemaEscuela("Sistema escuela",2000,estudiantes1,"ci, certificado de nacimiento, carnet de vacunacion");
        ISistemaInscripcion sistemaInscripcion2= new SistemaColegio("Sistema colegio",4000,estudiantes2,"ci, certificado de nacimiento, carnet de vacunacion, sexto grado cursado");
        ISistemaInscripcion sistemaInscripcion3 = new SistemaUniversidad("Sistema universidad",10000,estudiantes3,"ci, certificado de nacimiento, titulo de bachiller");


        IntegrationRedSocial facebook = new Facebook();

        sistemaInscripcion1.showInfo(facebook);

        //New Social net integration twitter and whatsapp

        IntegrationRedSocial whatsapp = new Whatsapp();
        IntegrationRedSocial twitter = new Twitter();

        sistemaInscripcion2.showInfo(whatsapp);
        sistemaInscripcion3.showInfo(twitter);
    }
}
