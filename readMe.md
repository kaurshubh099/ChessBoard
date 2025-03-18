# Chessboard Simulator

## Overview

The Chessboard Simulator is a command-line application that allows users to simulate chess moves for various types of chess pieces. Built using Java and Spring Boot, this application supports interactive input to determine and display possible moves.


## Assumptions

- The chessboard is represented with the top-left corner (A8) as the coordinate (0,0).
- The coordinates are mapped as follows:
  - A8: (0,0)
  - H8: (0,7)
  - H1: (7,7)
  - A1: (7,0)
- The application assumes that the user is playing from the A8 side where all black pieces are placed.
- There will always be only one piece at a time.

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
Enter the type of chess piece and initial position (e.g., King, D5): 
King, D5
King possible moves from D5: E5, D4, E6, C4, D6, C5, C6, E4
Do you want to try again? (yes/no): 
yes
Enter the type of chess piece and initial position (e.g., King, D5): 
Queen, D2
Queen possible moves from D2: H2, G2, F2, E1, E2, D1, E3, F4, G5, H6, C1, C2, D3, B2, D4, C3, A2, D5, D6, B4, D7, D8, A5
Do you want to try again? (yes/no): 
no
Thank you for using the Chessboard Simulator!
```

## Running Tests

To run the tests, use the following command:

```sh
./gradlew test
```

## Code Coverage

To check the test code coverage, use the following command:

```sh
./gradlew test jacocoTestReport
```

The code coverage report will be generated in the `build/reports/jacoco/test/html` directory. Open the `index.html` file in a web browser to view the detailed coverage report.

## Project Structure

- `src/main/java/com/example/chessboard`: Contains the main application code.
- `src/main/java/com/example/chessboard/model`: Contains the chess piece models.
- `src/main/java/com/example/chessboard/utils`: Contains utility classes.
- `src/test/java/com/example/chessboard`: Contains the test cases.
