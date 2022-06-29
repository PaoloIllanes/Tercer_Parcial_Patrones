package ejercicios.adapter;

public class Client {
    public static void main (String[] args){
        ICuadratrackCombustible gasolina =  new CuadratrackGasolina(20,"5252");
        ICuadratrackCombustible diesel =  new CuadratrackDiesel(30,"2314");
        ICuadratrackCombustible especial =  new CuadratrackGasolinaEspecial(40,"1511");
        ICuadratrackElectrico electrico =  new CuadratrackElectrico(10,"324234");
        ICuadratrackCombustible electricoAdaptado = new CuadratrackElectricoAdaptado(electrico);

        //Cargando gasolina || electricidad
        //estado combustible || electricidad
        gasolina.llenarGasolina(10);
        gasolina.estadoCombustible();
        diesel.llenarGasolina(16);
        diesel.estadoCombustible();
        especial.llenarGasolina(15);
        especial.estadoCombustible();
        electrico.cargarBateria(2);
        electrico.estadoElectricidad();
        electricoAdaptado.llenarGasolina(20);
        electricoAdaptado.estadoCombustible();







    }

}
