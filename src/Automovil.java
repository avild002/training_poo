public class Automovil {
    //se recomienda una clase por archivo, la clase debe tener el mismo nombre que el archivo .java
    //clase private no se puede utilizar en ninguna parte

    String fabricante;
    String modelo;
    String color="gris";
    double cilindrada;

    public String detalle(){
        StringBuilder sb=new StringBuilder(); //clase para concatenar cadenas
        sb.append("auto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("auto.color = " + this.color);
        sb.append("auto.cilindrada = " + this.cilindrada);
        return sb.toString();
    }
}
