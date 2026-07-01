# main.py
from utils import calculate_total, print_receipt

def main():
    name = input("Customer name: ")
    coffee_qty = int(input("Coffee quantity: "))
    tea_qty = int(input("Tea quantity: "))
    sandwich_qty = int(input("Sandwich quantity: "))
    
    total_bill = calculate_total(coffee_qty, tea_qty, sandwich_qty)
    
    print_receipt(name, coffee_qty, tea_qty, sandwich_qty, total_bill)

if __name__ == "__main__":
    main()