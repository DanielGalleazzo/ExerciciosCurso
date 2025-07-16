public enum OrderStatus {
    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    protected final int numero;
    OrderStatus(int numero  ) {
        this.numero = numero;
    }

    public int getCode() {
        return numero;
    }
}