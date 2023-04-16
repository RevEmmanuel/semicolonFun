package main

import "fmt"


func main() {
	printHelloWorld()
	printSemicolon()
	printVentures()
	fmt.Println(secondLargest(2, 4, 70, 12, 55, 90, 532, 45, 12)) // prints 90
	findOccurrences() // 4 occurrences each
	fmt.Println(sumDivisibleBy3()) // prints 165
	guessBirthDate() // correct date is 15
	infiniteSeries()
}

// number 0
func printHelloWorld() {
	fmt.Println("Hello World")
}

// number 1
func secondLargest(numbers ...int) int {
	highest := 0
	secondHighest := 0
	for _, num := range numbers {
		if (num > highest) {
			secondHighest = highest
			highest = num
		}
	}
	return secondHighest;
}

// number 2
func printSemicolon() {
	semicolon := "SEMICOLON"
	for _, char := range semicolon {
		fmt.Println(string(char))
	}
}

// number 3
func printVentures() {
	ventures := "VENTURES"
	for i := 0; i < len(ventures); i++ {
		fmt.Printf("%c %c\n", ventures[i], ventures[i+1])
		i++
	}
}

// number 4
func findOccurrences() {
	word := "Mississippi"
	countForS := 0
	countForI := 0
	for _, char := range word {
		if char == 's' {
			countForS++
		} else if char == 'i' {
			countForI++
		}
	}
	fmt.Println("Number of 's':", countForS)
	fmt.Println("Number of 'i':", countForI)
}

// number 5
func sumDivisibleBy3() int {
	sum := 0;
	for i := 1; i <= 30; i++ {
		if (i % 3 == 0) {
			sum += i
		}
	}
	return sum;
}

// number 6
func guessBirthDate() {
	birthday := 15
	var answer int
	for answer != birthday {
		fmt.Print("Enter a guess: ")
		fmt.Scanf("%d", &answer)
		if answer != birthday {
			fmt.Println("Incorrect Guess!")
			fmt.Scanln()
		}
	}
	fmt.Println("Correct Guess!")
}

// number 7
func infiniteSeries() {
	pie := 4.0
	denominator := 3.0
	found := false
	terms := 1
	for !found {
		if terms % 2 == 0 {
			pie += 4.0 / denominator
		} else {
			pie -= 4.0 / denominator
		}
		denominator += 2.0
		fmt.Printf("%-10d%.7f\n", terms, pie)
		terms++

		if fmt.Sprintf("%.7f", pie) == "3.1415900" {
			found = true
		}
	}

	fmt.Println("Pie:", pie)
	fmt.Println("Number of terms:", terms)
}

