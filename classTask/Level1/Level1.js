printHelloWorld();
printSemicolon();
printVentures();
console.log(secondLargest(2, 4, 70, 12, 55, 90, 532, 45, 12)); // prints 90
findOccurrences(); // 4 occurrences each
console.log(sumDivisibleBy3()); // prints 165
// guessBirthDate()
infiniteSeries();


// number 0
function printHelloWorld() {
    console.log("Hello World");
}

// number 1
function secondLargest(...numbers){
    let highest = 0;
    let secondHighest = 0;
    for (let i = 0; i < numbers.length; i++) {
        if (numbers[i] > highest) highest = numbers[i];
    }
    for (let i = 0; i < numbers.length; i++) {
        if (numbers[i] === highest) continue;
        if (numbers[i] > secondHighest) secondHighest = numbers[i];
    }
    return secondHighest;
}

// number 2
function printSemicolon() {
    let semicolon = "SEMICOLON";
    for (let i = 0; i < semicolon.length; i++) {
        console.log(semicolon.charAt(i));
    }
}

// number 3
function printVentures() {
    let ventures = "VENTURES";
    for (let i = 0; i < ventures.length; i++) {
        console.log(ventures.charAt(i) + " " + ventures.charAt(++i));
    }
}

// number 4
function findOccurrences() {
    let word = "Mississippi";
    let countForS = 0, countForI = 0;
    for (let i = 0; i < word.length; i++) {
        if (word.charAt(i) === 's') {
            countForS++;
        } else if (word.charAt(i) === 'i') {
            countForI++;
        }
    }
    console.log("Number of 's': " + countForS);
    console.log("Number of 'i': " + countForI);
}


// number 5
function sumDivisibleBy3() {
    let sum = 0;
    for (let i = 1; i <= 30; i++) {
        if (i % 3 === 0) sum += i;
    }
    return sum;
}

// number 6
function guessBirthDate() {
    let birthday = 15;
    let answer = 0;
    while (answer !== birthday) {
        console.log("Enter a guess: ");
        // answer = scanner.nextInt();
        if (answer !== birthday) console.log("Incorrect Guess!");
    }
    console.log("Correct Guess!");
}

// number 7
function infiniteSeries() {
    let pie = 0;
    let signToMultiply = 1;
    let numberOfTerms = 0;
    for (let i = 1; i <= 200000; i += 2) {
        let term = 4 / i * signToMultiply;
        pie += term;
        console.log(`${numberOfTerms.toString().padEnd(10)}${pie.toFixed(5)}`);
        signToMultiply *= -1;
        numberOfTerms++;
        let pieString = pie.toString();
        if (pieString.startsWith("3.14159")) {
            console.log(`${numberOfTerms.toString().padEnd(10)}${pie.toFixed(5)}`);
            console.log("Pie starts with " + pieString + " after " + numberOfTerms + " terms");
            break;
        }
    }
}
