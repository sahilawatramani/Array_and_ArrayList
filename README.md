# **Array Functions in Java**

## **Project Overview**
This project is a demonstration of essential operations on arrays and ArrayLists in Java. It is designed to help understand the differences between arrays and ArrayLists, their usage, and conversion techniques. The program performs several operations, such as segregating even and odd numbers, finding the smallest difference between elements in an array, and converting between arrays and ArrayLists.

This project is structured into three separate Java files, following best practices for modularity and maintainability.

---

## **Key Features**
- **Display Even and Odd Elements:** Separate input integers into even and odd lists and display them.
- **Find Smallest Difference:** Identify the first index of the pair of elements with the smallest absolute difference.
- **Array to ArrayList Conversion:** Convert a standard Java array to an ArrayList and display the result.
- **ArrayList to Array Conversion:** Convert an ArrayList back to a standard Java array and display it.

---

## **Directory Structure**
```
ArrayFunctionsProject/
├── ArrayFunctions.java   # Contains the core logic for array operations
├── Input.java            # Handles user input for arrays
└── Main.java             # Entry point of the application
```

---

## **Getting Started**

### **Prerequisites**
- Java Development Kit (JDK) installed (version 8 or higher)
- A code editor or IDE (Eclipse, IntelliJ IDEA, or VS Code recommended)
- Command Line or Terminal access

---

### **Setup Instructions**
1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd ArrayFunctionsProject
   ```

2. **Compile the Java files:**
   ```bash
   javac *.java
   ```

3. **Run the project:**
   ```bash
   java Main
   ```

---

## **Usage Instructions**
1. **User Input:**  
   Upon execution, the program prompts the user to input five integers.

2. **Execution Flow:**  
   - The entered array is processed to separate even and odd numbers.
   - The program finds the smallest absolute difference between any two numbers and prints the index of the first number in the pair.
   - The input array is converted to an ArrayList and displayed.
   - The ArrayList is then converted back to an array and displayed.

---

## **Sample Output**
```
Enter 5 numbers:
7
2
9
12
5
Array is: [2, 12]
Array is: [7, 9, 5]
Minimum Index = 1
Array List = [7, 2, 9, 12, 5]
Array: [7, 2, 9, 12, 5]
```

---

## **Detailed Explanation of Core Functions**
### **1. display(ArrayList<Integer> array)**  
- Prints the given ArrayList in a readable format.

### **2. evenOdd()**  
- Accepts user input to create an integer array.
- Splits the numbers into separate lists of even and odd integers.
- Displays the resulting lists using the `display()` method.

### **3. smallestDifference()**  
- Finds the pair of elements with the smallest absolute difference from the input array.
- Prints the index of the first element in the identified pair.

### **4. arrayToArrayList(int[] array)**  
- Converts a given array to an ArrayList and displays it.

### **5. arrayListToArray(ArrayList<Integer> arrayList)**  
- Converts a given ArrayList to a standard Java array and displays it.

---

## **Class Descriptions**
### **1. ArrayFunctions.java**
Contains methods to perform the main array and ArrayList operations.

### **2. Input.java**
Handles input from the user and returns an integer array.

### **3. Main.java**
The entry point for the application, where all functions are called to demonstrate the project's features.

---

## **License**
This project is licensed under the MIT License. See the LICENSE section below for details.

---

### **MIT License**
```
MIT License

Copyright (c) 2025 Sahil Awatramani

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
