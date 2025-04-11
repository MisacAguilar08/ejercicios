package seccion12.poo;

import java.util.Arrays;

public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Tanque tanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private TipoAutomovil tipoAutomovil;

    private static String colorDefault;
    private static int ultimoId;

    //static y final son mas de comportamiento de estructura
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    final public static int VELOCIDAD_MAX_CIUDAD = 60;

    public Automovil(){this.id  = ++ultimoId;}

    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    };

    public Automovil(String fabricante, Motor motor, Color color, String modelo) {
        this(fabricante, modelo);
        this.fabricante = fabricante;
        this.motor = motor;
        this.color = color;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, motor,color, modelo);
        this.tanque = tanque;
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String isDeportivo(Motor motor){
        return "...";
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                ", motor=" + motor +
                ", tanque=" + tanque +
                ", conductor=" + conductor +
                ", ruedas=" + Arrays.toString(ruedas) +
                ", tipoAutomovil=" + tipoAutomovil +
                '}';
    }
}
