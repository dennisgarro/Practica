public class objVenta {
    private int NumeroFactura;
    private String NombreCliente;
    private String NombreVendedor;
    private Double TotalVenta;
    private int CantidadProductos;
    private int EstadoVenta; // registrada 1 o cancelada 0.

    public objVenta(int numeroFactura, String nombreCliente, String nombreVendedor, Double totalVenta,
            int cantidadProductos, int estadoVenta) {
        NumeroFactura = numeroFactura;
        NombreCliente = nombreCliente;
        NombreVendedor = nombreVendedor;
        TotalVenta = totalVenta;
        CantidadProductos = cantidadProductos;
        EstadoVenta = estadoVenta;
    }                                                                       

    public objVenta() {
    }

    public int getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        NumeroFactura = numeroFactura;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    public String getNombreVendedor() {
        return NombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        NombreVendedor = nombreVendedor;
    }

    public Double getTotalVenta() {
        return TotalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        TotalVenta = totalVenta;
    }

    public int getCantidadProductos() {
        return CantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        CantidadProductos = cantidadProductos;
    }

    public int getEstadoVenta() {
        return EstadoVenta;
    }

    public void setEstadoVenta(int estadoVenta) {
        EstadoVenta = estadoVenta;
    }

}
