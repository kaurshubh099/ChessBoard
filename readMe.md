# Chessboard Simulator

## Overview

The Chessboard Simulator is a command-line application that allows users to simulate chess moves for various types of chess pieces. Built using Java and Spring Boot, this application supports interactive input to determine and display possible moves.

## Prerequisites

- **Java 17** or higher
- **Gradle 7.0** or higher

## Building the Project

To build the project, navigate to the project directory and execute the following command:

```sh
./gradlew build
```

## Running the Application

You can run the application using the bootRun task or by running the generated JAR file.  
Using bootRun
To run the application using Gradle's bootRun task, use the following command:

```sh
./gradlew bootRun
```

### Using the JAR File

Build the project as described above.
Run the generated JAR file:

```sh
java -jar build/libs/chessboard-simulator.jar
```

Replace `chessboard-simulator.jar` with the actual name of the generated JAR file in the `build/libs` directory.  

### Usage

Once the application is running, follow the on-screen prompts to enter the type of chess piece and its initial position. The application will display the possible moves for the given piece from the specified position.

```
Example:

Welcome to the Chessboard Simulator!
Enter the type of chess piece (Pawn, King, Queen): queen
Enter the initial position (e.g., D5): D5
Queen possible moves from D5: D6, D7, D8, E5, F5, G5, H5, C5, B5, A5, E6, F7, G8, C6, B7, A8, E4, F3, G2, H1, C4, B3, A2
Do you want to try again? (yes/no): no
Thank you for using the Chessboard Simulator!
```

## Running Tests

To run the tests, use the following command:
```sh
./gradlew test
```

## Project Structure

- `src/main/java/com/example/chessboard`: Contains the main application code.
- `src/main/java/com/example/chessboard/model`: Contains the chess piece models.
- `src/main/java/com/example/chessboard/utils`: Contains utility classes.
- `src/test/java/com/example/chessboard`: Contains the test cases.
