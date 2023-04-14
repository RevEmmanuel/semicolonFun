# number 0
def print_hello_world():
    print("Hello World")


# number 1
def second_largest(*numbers):
    highest = 0
    second_highest = 0
    for number in numbers:
        if number > highest:
            highest = number
    for number in numbers:
        if number == highest:
            continue
        if number > second_highest:
            second_highest = number
    return second_highest


# number 2
def print_semicolon():
    semicolon = "SEMICOLON"
    for letter in semicolon:
        print(letter)


# number 3
def print_ventures():
    ventures = "VENTURES"
    count = 0
    for letter in ventures:
        if count % 2 == 0:
            print()
        print(letter, end=' ')
        count += 1
    print()


# number 4
def find_occurrences():
    word = "Mississippi"

    count_for_s = word.count('s')
    count_for_i = word.count('i')
    print("Number of 's': " + str(count_for_s))
    print("Number of 'i': " + str(count_for_i))


# number 5
def sum_divisible_by_3():
    sum_of_dividers = 0
    for i in range(1, 31):
        if i % 3 == 0:
            sum_of_dividers += i
    return sum_of_dividers


# number 6
def guess_birth_date():
    birthday = 15
    answer = 0
    while answer != birthday:
        answer = int(input("Enter a guess: "))
        if answer != birthday:
            print("Incorrect Guess!")
    print("Correct Guess!")


# number 7
def infinite_series():
    pie = 0
    sign_to_multiply = 1
    number_of_terms = 0
    for i in range(1, 200000, 2):
        term = 4 / i * sign_to_multiply
        pie += term
        print(f'{number_of_terms}:  {round(pie, 5)}')
        sign_to_multiply *= -1
        number_of_terms += 1
        pie_string = str(pie)
        if pie_string.startswith('3.14159'):
            print(f'{number_of_terms}:  {round(pie, 5)}')
            print(f"Pie starts with {pie_string} after {number_of_terms} terms")
            break


if __name__ == "__main__":
    print_hello_world()
    print_semicolon()
    print_ventures()
    print(second_largest(2, 4, 70, 12, 55, 90, 532, 45, 12))  # prints 90
    find_occurrences()  # 4 occurrences each
    print(sum_divisible_by_3())  # prints 165
    guess_birth_date()
    infinite_series()
