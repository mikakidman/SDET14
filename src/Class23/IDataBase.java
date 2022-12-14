package Class23;

public interface IDataBase {
    //public static final int age=10;  ---> all methods are default like this
    void openDatabase();
    void readData();
    void writeData();
}
class IBM implements IDataBase{

    @Override
    public void openDatabase() {
        System.out.println("Opening the IBM database");
    }

    @Override
    public void readData() {
        System.out.println("Reading the data from the IBM database");

    }

    @Override
    public void writeData() {
        System.out.println("Writing the data to the database");

    }
}
