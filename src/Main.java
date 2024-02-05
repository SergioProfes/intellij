// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double s;
        s=3200.50;
        Nomina n=new Nomina(s);
        String texto=new String("El sueldo bruto es: "+s);
        System.out.println(texto);
        n.calculartotalpercibir();
        texto=new String("El sueldo neto es: "+n.totalpercibir);
        System.out.println(texto);
        texto=new String("El IRPF anual es: "+n.retencionIRPFanual());
        System.out.println(texto);

        }
    }
