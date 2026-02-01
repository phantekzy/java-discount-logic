# Java Discount Logic System

A command-line interface application that simulates a Point-of-Sale (POS) terminal. The system calculates specialized discounts for students and senior citizens using validated user input.

## Technical Specifications

* **Language**: Java
* **Input Handling**: Utilizes Scanner with input validation to prevent runtime exceptions.
* **Logic Architecture**: Implements conditional branching to determine discount eligibility based on multiple user attributes.
* **Formatted Output**: Uses printf for precise decimal alignment and ASCII-based UI components.

## Business Logic

The system applies the following discount tiers:
* **Student and Senior**: 30% reduction
* **Student Only**: 20% reduction
* **Senior Only**: 10% reduction
* **Standard**: No reduction

## Installation and Execution

1. Clone the repository:
   git clone https://github.com/phantekzy/java-discount-logic.git

2. Compile the source:
   javac Main.java

3. Run the application:
   java Main
