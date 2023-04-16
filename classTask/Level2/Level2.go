package main

import (
	"fmt"
	"strconv"
	"math"
)

func main() {
	first := [] int {1, 3, 4, 5}
	second := [] int {2, 6, 7, 8}
	product := [] float64 {1, 2, 3, 4}
	repeat := [] int {9, 2, 3, 2, 6, 6, 8}
	rotate := [] int {1, 2, 3, 4, 5}
	reArr := [] int {10, -1, 20, 4, 5, -9, -6}
	fmt.Println(mergeTwoSortedArrays(first, second))
	fmt.Println(convertToInt(11011)) // should print 27
	fmt.Println(convertToInt(11)) // should print 3
	fmt.Println(convertToInt(1)) // should print 1
	fmt.Println(productOfAllElements(product)) // should print [24, 12, 8, 6]
	fmt.Println(nonRepeatingNumber(repeat)) // should print 9
	fmt.Println(rightRotate(rotate)) // should print [5, 1, 2, 3, 4]
	fmt.Println(rearrangePositiveNegative(reArr)) // should print [-1, -9, -6, 4, 5, 10, 20]
}

func mergeTwoSortedArrays(array1 []int, array2 []int) []int {
	sortedBothArrays := make([]int, len(array1)+len(array2))
	i, j, k := 0, 0, 0
	for i < len(array1) && j < len(array2) {
		if array1[i] < array2[j] {
			sortedBothArrays[k] = array1[i]
			i++
		} else {
			sortedBothArrays[k] = array2[j]
			j++
		}
		k++
	}
	for i < len(array1) {
		sortedBothArrays[k] = array1[i]
		i++
		k++
	}
	for j < len(array2) {
		sortedBothArrays[k] = array2[j]
		j++
		k++
	}
	return sortedBothArrays
}

func convertToInt(newNumber int) int {
	sum, counter := 0, 0
	for length := len(strconv.Itoa(newNumber)); length != 0; newNumber /= 10 {
		r := newNumber % 10
		decimal := r * int(math.Pow(2, float64(counter)))
		sum += decimal
		counter++
		length--
	}
	return sum
}

func productOfAllElements(initialList []float64) []float64 {
	result := make([]float64, len(initialList))
	for i := 0; i < len(result); i++ {
		multiply := 1.0
		for j := 0; j < len(initialList); j++ {
			if i == j {
				continue
			}
			multiply *= initialList[j]
		}
		result[i] = multiply
	}
	return result
}

func nonRepeatingNumber(numbers []int) int {
    result := 0
    for i := 0; i < len(numbers)-1; i++ {
        digit := numbers[i]
        exists := false
        for j := i + 1; j < len(numbers); j++ {
            if digit == numbers[j] {
                exists = true
                break
            }
        }
        if !exists {
            result = digit
            break
        }
    }
    return result
}

func rightRotate(digits []int) []int {
	result := make([]int, len(digits))
	result[0] = digits[len(digits)-1]
	for i := 1; i < len(digits); i++ {
		result[i] = digits[i-1]
	}
	return result
}

func rearrangePositiveNegative(digits []int) []int {
    for i := 0; i < len(digits); i++ {
        for j := i + 1; j < len(digits); j++ {
            if (digits[i] >= 0 && digits[j] < 0) {
                temp := digits[i]
                digits[i] = digits[j]
                digits[j] = temp
            }
        }
    }
    return digits
}


func maximumSublistSum(numbers []int) float64 {
    sumOfNumbers := 0.0
    sums := []float64{}
    for _, number := range numbers {
        if number < 0 {
            sums = append(sums, sumOfNumbers)
            sumOfNumbers = 0
        } else {
            sumOfNumbers += float64(number)
        }
    }
    sums = append(sums, sumOfNumbers)
    highest := 0.0
    for _, number := range sums {
        if number > highest {
            highest = number
        }
    }
    return highest
}
