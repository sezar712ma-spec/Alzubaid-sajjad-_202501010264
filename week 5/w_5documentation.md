# Week 5: Tutorial 5 - Cafe Bill Calculator[cite: 1]

## 1. Problem Analysis
* **Problem Statement:** Automate manual bill calculations for Coffee (RM 8.50), Tea (RM 6.00), and Sandwich (RM 12.00).
* **Inputs:** Customer name, quantities of Coffee, Tea, and Sandwich.
* **Outputs:** Printed receipt with customer name, item quantities, and total RM.
* **Process Flow:** Get inputs -> Calculate total -> Print receipt.
* **Constraints:** Quantities cannot be negative; prices are fixed.

## 2. Problem Decomposition
1. **Input:** Get customer name and order quantities.
2. **Logic:** Calculate total cost based on fixed prices.
3. **Output:** Display the formatted receipt.

## 3. Pseudocode
```text
START
    Input name, coffee_qty, tea_qty, sandwich_qty
    total = (coffee_qty * 8.50) + (tea_qty * 6.00) + (sandwich_qty * 12.00)
    Print receipt details and total RM
END