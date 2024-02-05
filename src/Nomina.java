public class Nomina {
    public double sueldo;
    public double totalpercibir;

    Nomina (double cantidad){
        sueldo=cantidad;
    }

    void calculartotalpercibir(){
        //Descontamos el 20% de IRPF
        double nomina=sueldo-(sueldo*20/100);
        //Descontamos la seguridad social
        if (nomina>2000)
            nomina=nomina-256;
        else
            nomina=nomina-128;
        totalpercibir=nomina;
    }

    double retencionIRPFanual(){
        double irpf=sueldo*20/100;
        return irpf*14;
    }
}
