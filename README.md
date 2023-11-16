# Heart Rates project in 2 different patterns

This repository contains two Java projects that showcase the implementation of two design patterns: Factory Method Pattern and Builder Pattern. These design patterns are used to manage heart rate information for individuals.

## Factory Method Pattern Project

### Overview

The Factory Method Pattern is a creational design pattern used to create instances of the `HeartRates` class through a common interface. The project structure includes the following key components:

- **`HeartRates`**: Represents heart rate information for an individual. It includes methods for calculating age, maximum heart rate, and target heart rate range.

- **`HeartRatesFactory`**: An interface that declares a factory method for creating `HeartRates` objects.

- **`DefaultHeartRatesFactory`**: A concrete implementation of the `HeartRatesFactory` interface, providing a factory method for creating instances of the `HeartRates` class.

### Usage

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/FactoryMethodPatternProject.git
    ```

2. Compile the Java files:

    ```bash
    javac HeartRates.java HeartRatesFactory.java DefaultHeartRatesFactory.java
    ```

3. Run the `HeartRatesTest` class:

    ```bash
    java HeartRatesTest
    ```

4. Follow the prompts to enter your personal information and view heart rate details.

## Builder Pattern Project

### Overview

The Builder Pattern is a creational design pattern used to construct instances of the `HeartRates` class in a flexible and readable manner. The project structure includes the following key components:

- **`HeartRates`**: Represents heart rate information for an individual. It includes methods for calculating age, maximum heart rate, and target heart rate range.

- **`Builder` (Static Inner Class)**: Serves as the builder for creating instances of the `HeartRates` class. It allows step-by-step construction of a `HeartRates` instance with different attributes.

### Usage

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/BuilderPatternProject.git
    ```

2. Compile the Java files:

    ```bash
    javac HeartRates.java HeartRatesTest.java
    ```

3. Run the `HeartRatesTest` class:

    ```bash
    java HeartRatesTest
    ```

4. Follow the prompts to enter your personal information and view heart rate details.

## Contributing

Feel free to contribute to the projects by opening issues or submitting pull requests. Your feedback and contributions are welcome!

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
