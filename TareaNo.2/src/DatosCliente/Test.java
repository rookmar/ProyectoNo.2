package DatosCliente;//importar el paquete


public class Test {
    public static void main(String[] args) {
    int cuenta =10001;
    String dpi = "1231313455"; // variable que contiene el dpi
    int saldo=3000;// variable que contiene el saldo de la cuenta
    int interes = 15;//varible del porcentaje de interes que genera anualmente
    //cuenta No.1
    Cliente cuenta1 = new Cliente();//llamar al constructor
    cuenta1.setNumeroDecuenta(cuenta);
    cuenta1.setDpi(dpi); //metodo setter que almacena el dato de la variable dpi
    cuenta1.setSaldo(saldo);//metodo setter que almacena el dato de la variable saldo
    cuenta1.setInteres(interes);//metodo setter que almacena el dato de la variable ineteres
    cuenta1.IngresarNuevoSaldo();//metodo que realiza un credito a la cuenta
    cuenta1.actulizarSaldo();//metodo que calcula el interes del saldo actual
    cuenta1.SaldoActulizado();//metodo que suma el total de lass transacciones
    cuenta1.MostrarSaldo();//metodo que mestra el detalle de la cuenta
    //cuenta No.2
    cuenta = 10002;
    dpi="147899144";// variable que contiene el dpi
    saldo=4000;// variable que contiene el saldo de la cuenta
    interes=15;//varible del porcentaje de interes que genera anualmente

    Cliente cuenta2 = new Cliente();//llamar al constructoo
    cuenta2.setNumeroDecuenta(cuenta);
    cuenta2.setDpi(dpi);//metodo setter que almacena el dato de la variable dpi
    cuenta2.setSaldo(saldo);//metodo setter que almacena el dato de la variable saldo
    cuenta2.setInteres(interes);//metodo setter que almacena el dato de la variable ineteres
    cuenta2.RetirarSaldo();//metodo que hace un retiro de la cuenta
    cuenta2.actulizarSaldo();//metodo que calcula el interes del saldo actual
    cuenta2.SaldoActulizado();//metodo que suma el total de lass transacciones
    cuenta2.MostrarSaldo();//metodo que mestra el detalle de la cuenta

   //cuenta No.3
    cuenta = 10003;
    dpi = "1234564898";// variable que contiene el dpi
    saldo=5000;// variable que contiene el saldo de la cuenta
    interes= 15;//varible del porcentaje de interes que genera anualmente

    Cliente cuenta3 = new Cliente();//llamar al constructor
    cuenta3.setNumeroDecuenta(cuenta);
    cuenta3.setDpi(dpi);//metodo setter que almacena el dato de la variable dpi
    cuenta3.setSaldo(saldo);//metodo setter que almacena el dato de la variable saldo
    cuenta3.setInteres(interes);//metodo setter que almacena el dato de la variable interes
    cuenta3.IngresarNuevoSaldo();// metodo que realiza un credito a la cuenta
    cuenta3.actulizarSaldo();//metodo que calcula el interes del saldo actual
    cuenta3.SaldoActulizado();//metodo que suma el total de lass transacciones
    cuenta3.MostrarSaldo();//metodo que mestra el detalle de la cuenta






    }

}
