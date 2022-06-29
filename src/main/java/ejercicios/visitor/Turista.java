package ejercicios.visitor;

public class Turista implements ITurista{
    private int saldo;
    private int nombre;
    @Override
    public void viajar(IDepartamento departamento) {

        switch (departamento.getname()){
            case "santa cruz":
                System.out.println("Viajando a Santa Cruz...");

        }

    }
}
