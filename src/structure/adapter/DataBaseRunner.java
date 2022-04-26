package structure.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new Adapter();

        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();
    }
}
