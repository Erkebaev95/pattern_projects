package structure.bridge;

public class StockExchanged extends Program {

    protected StockExchanged(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange development in progress...");
        developer.writeCode();
    }
}
