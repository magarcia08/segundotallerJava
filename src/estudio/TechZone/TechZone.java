package estudio.TechZone;


public class TechZone {
    public static void main(String[] args) {

        final double TASA_IVA = 0.19;

        String nombreProducto = "Audifonos Bluetooth";
        double precioVenta = 189_900.50;
        int cantidadStock = 47;
        boolean oferta = false;
        char estadoProducto = 'A';
        String codigoProducto = "ELT-BT-001";

        // calculos de techzone

        double precioCosto  = precioVenta * 0.60;
        double precioConIva = precioVenta * (1 + TASA_IVA);
        double valorInventario = precioCosto * cantidadStock;


        System.out.printf("SKU      : %s%n", codigoProducto);
        System.out.printf("Producto : %s%n", nombreProducto);
        System.out.printf("Estado   : %c | En oferta: %s%n",
                estadoProducto, oferta ? "SÍ" : "NO");
        System.out.printf("Precio   : $%,.2f%n", precioVenta);
        System.out.printf("Con IVA  : $%,.2f%n", precioConIva);
        System.out.printf("Stock    : %d uds | Val. bodega: $%,.2f%n",
                cantidadStock, valorInventario);

    }


}
