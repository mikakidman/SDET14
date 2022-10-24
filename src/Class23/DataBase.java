package Class23;

public abstract class DataBase {
    abstract void openDatabase();
    abstract void readData();
    abstract void writeData();
    abstract void closeDatabase();
    }
    class MicrosoftDataBase extends DataBase{

        @Override
        void openDatabase() {
            System.out.println("Opening the Microsoft Database");
        }

        @Override
        void readData() {
            System.out.println("Reading the Data from MSDataBase");
        }

        @Override
        void writeData() {
            System.out.println("Writing the Data from MSDataBase");
        }

        @Override
        void closeDatabase() {
            System.out.println("Closing the  MSDataBase");
        }
    }
abstract class Oracle extends DataBase{

    @Override
    void openDatabase() {
        System.out.println("Opening the Oracle Database");
    }

    @Override
    void readData() {
        System.out.println("Reading the Data from Oracle");
    }
}
class Test extends Oracle{

    @Override
    void writeData() {
        System.out.println("Writing the Data from Oracle");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing Oracle");
    }
}
