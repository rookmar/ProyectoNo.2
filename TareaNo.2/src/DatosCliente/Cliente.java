package DatosCliente;

public class Cliente {

    public String dpi;
    public int saldo;
    public double interes;
    public int numeroDecuenta;



    public Cliente() {
        this.numeroDecuenta = numeroDecuenta;


    }
    //constructor
    public Cliente(String dpi, int saldo, int interes) {
        this.dpi = dpi;
        this.saldo = saldo;
        this.interes = interes;
    }
//metodos geter
    public String getDpi(String dpi) {
        return this.dpi;
    }

    public int getSaldo() {
        return saldo;
    }

    public double getInteres() {
        return interes;
    }

    public int getNumeroDecuenta() {
        return numeroDecuenta;
    }
    //metodos seter
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setNumeroDecuenta(int numeroDecuenta) {
        this.numeroDecuenta = numeroDecuenta;
    }

    //variables para llevar el control de las operaciones
    double total = 0;
    double total2=0;
    double total3=0;
    double nuevoSaldo=0;
    //metodos para realizar las operaciones

    //metodo que calcula el interes anual sobre el saldo
    public void actulizarSaldo(){
        total = (interes/365) * saldo;
        System.out.println("el interes que a generado esta cuenta es de ="+total);

    }
    //metodo que acredita Q200 a la cuenta
    public void IngresarNuevoSaldo(){
        total2= saldo + 200;
        System.out.println("Se a realizado un credito a su cuenta de Q200");
    }
    //metodo que retira Q300 de la cuenta
    public void RetirarSaldo(){
        if(saldo >=1){
            total3= saldo - 300;
            System.out.println("Se a realizado un retiro a su cuenta de Q300");
        }else{
            System.out.println("la cuenta no tiene fondos");
        }
    }
    //metodo que calcula el total de los intreses retiros y creditos
    public void SaldoActulizado(){
        nuevoSaldo= total+total2+total3;
        System.out.println("Nuevo saldo = "+nuevoSaldo);
    }
    //metodo que muestra el detalle de la cuenta
    public void MostrarSaldo(){
        System.out.println("Este son los detalles de la cuenta ");
        System.out.println("No. de cuenta= "+numeroDecuenta);
        System.out.println("Dpi de cliento "+dpi);
        System.out.println("saldo  anterio = " + saldo);
        System.out.println("Nuevo saldo  "+nuevoSaldo );
    }
}
