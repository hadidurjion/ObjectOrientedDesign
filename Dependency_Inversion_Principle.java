//****************************************************************************
// Title: Demonstrating the Dependency Inversion Principle (DIP)
// Author: Hadidur Rahman Jion,Undergraduate Student,Khulna University.
//****************************************************************************

/**
 * Represents the abstraction of a data repository.
 * This interface defines the contract for classes that provide data retrieval functionality.
 */
interface DataRepository {
    /**
     * Fetches data from the repository.
     *
     * @return The fetched data.
     */
    String fetchData();
}

/**
 * Represents a concrete implementation of a data repository that fetches data from a database.
 * This class implements the DataRepository interface and retrieves data from a database source.
 */
class DatabaseRepository implements DataRepository {
    /**
     * Fetches data from the database.
     *
     * @return The fetched data.
     */
    @Override
    public String fetchData() {
        return "Data from database";
    }
}

/**
 * Represents the business logic module that depends on a data repository.
 * This class encapsulates the logic for retrieving data using a provided data repository.
 */
class BusinessLogic {
    private DataRepository dataRepository;

    /**
     * Constructs a BusinessLogic object with a data repository dependency.
     *
     * @param dataRepository The data repository dependency.
     */
    public BusinessLogic(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    /**
     * Retrieves data using the injected data repository.
     *
     * @return The retrieved data.
     */
    public String retrieveData() {
        return dataRepository.fetchData();
    }
}

/**
 * Demonstrates the usage of the Dependency Inversion Principle (DIP).
 * This class contains the main method to demonstrate the DIP by creating instances of BusinessLogic and DataRepository.
 */
public class DIP {
    /**
     * Main method to demonstrate the Dependency Inversion Principle.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a database repository and use it with BusinessLogic
        DataRepository databaseRepository = new DatabaseRepository();
        BusinessLogic businessLogic = new BusinessLogic(databaseRepository);
        System.out.println("Data retrieved: " + businessLogic.retrieveData());
    }
}
