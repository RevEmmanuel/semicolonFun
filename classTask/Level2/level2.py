def merge_two_sorted_arrays(array1, array2):
    sorted_both_arrays = []
    i = j = k = 0
    while i < len(array1) and j < len(array2):
        if array1[i] < array2[j]:
            sorted_both_arrays.append(array1[i])
            i += 1
        else:
            sorted_both_arrays.append(array2[j])
            j += 1
        k += 1
    while i < len(array1):
        sorted_both_arrays.append(array1[i])
        i += 1
        k += 1
    while j < len(array2):
        sorted_both_arrays.append(array2[j])
        j += 1
        k += 1
    return sorted_both_arrays


def convert_to_int(new_number):
    sums = 0
    counter = 0
    length = len(str(new_number))
    while length != 0:
        r = new_number % 10
        decimal = r * (2 ** counter)
        sums += decimal
        counter += 1
        new_number //= 10
        length -= 1
    return sums


def product_of_all_elements(initial_list):
    new_result = [1] * len(initial_list)
    for i in range(len(initial_list)):
        value = 1
        for j in range(len(initial_list)):
            if i == j:
                continue
            value *= initial_list[j]
        new_result[i] = value
    return new_result


def non_repeating_number(numbers):
    result_3 = 0
    for i in range(len(numbers) - 1):
        digit = numbers[i]
        exists = False
        for j in range(i + 1, len(numbers)):
            if digit == numbers[j]:
                exists = True
                break
        if not exists:
            result_3 = digit
            break
    return result_3


def right_rotate(digits):
    result = [digits[-1]]
    for i in range(1, len(digits)):
        result.append(digits[i - 1])
    return result


def rearrange_positive_negative(digits):
    i = 0
    while i < digits.length:
        j = 0
        while j < digits.length:
            if digits[i] < digits[j]:
                temp = digits[i]
                digits[i] = digits[j]
                digits[j] = temp
        j += 1
    i += 1
    return digits


if __name__ == '__main__':
    first = [1, 3, 4, 5]
    second = [2, 6, 7, 8]
    print(merge_two_sorted_arrays(first, second))
    print(convert_to_int(11011))  # should print 27
    print(convert_to_int(11))  # should print 3
    print(convert_to_int(1))  # should print 1
    print(product_of_all_elements([1, 2, 3, 4]))  # should print [24, 12, 8, 6]
    print(non_repeating_number([9, 2, 3, 2, 6, 6, 8]))  # should print 9
    print(right_rotate([1, 2, 3, 4, 5]))  # should print [5, 1, 2, 3, 4]
