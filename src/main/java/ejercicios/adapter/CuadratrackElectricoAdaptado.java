package ejercicios.adapter;

public class CuadratrackElectricoAdaptado implements ICuadratrackCombustible{
    private ICuadratrackElectrico cuadratrackElectrico;

    public CuadratrackElectricoAdaptado(ICuadratrackElectrico cuadratrackElectrico){
        System.out.println("Adaptando cuadratrack electrico a combustible...");
        this.cuadratrackElectrico=cuadratrackElectrico;

    }
    @Override
    public void llenarGasolina(int gasolina) {
        cuadratrackElectrico.cargarBateria(10);
    }

    @Override
    public void estadoCombustible() {
        cuadratrackElectrico.estadoElectricidad();

    }
}
