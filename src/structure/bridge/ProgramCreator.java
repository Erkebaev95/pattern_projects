package structure.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDev()),
                new StockExchanged(new CPPDev())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
