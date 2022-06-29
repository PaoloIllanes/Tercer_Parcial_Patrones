package ejercicios.adapter;

public class CuadratrackGasolina  implements ICuadratrackCombustible {
    private int gaslevel;
    private String id;

    public CuadratrackGasolina(int gaslevel, String id) {
        this.gaslevel = gaslevel;
        this.id = id;
    }

    public int getGaslevel() {
        return gaslevel;
    }

    public void setGaslevel(int gaslevel) {
        this.gaslevel = gaslevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void llenarGasolina(int gasolina) {
        setGaslevel(gasolina);
        System.out.println("Diesel en :" + gasolina );
    }

    @Override
    public void estadoCombustible() {
        int t = (int) (Math.random() * 50 - 1);
        System.out.println("Estado : " + t);
    }
}

