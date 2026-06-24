# Initialize choice variable to start the loop
choice = "Y"

# Loop to allow entering marks for another student if choice is 'Y' or 'y'
while choice == "Y" or choice == "y":

# Ask user to enter three quiz marks and convert inputs to float
    quiz_1 = float(input("Enter Quiz 1 mark: "))
    quiz_2 = float(input("Enter Quiz 2 mark: "))
    quiz_3 = float(input("Enter Quiz 3 mark: "))

    # Calculate the average mark of the three quizzes
    average = (quiz_1 + quiz_2 + quiz_3) / 3

# Display the calculated average
    print("Average =", average)

# Determine whether the student passes or fails based on the average
    if average >= 50:
        print("Pass")
    else:
        print("Fail")

# Ask the user if they want to enter marks for another student
    choice = input("Continue? Select Y/N: ")

# Display message when the loop ends and program exits
print("Program Ended")
