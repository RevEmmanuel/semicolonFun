console.log(mergeTwoSortedArrays([1, 3, 4, 5], [2, 6, 7, 8]))
console.log(convertToInt(11011)) // should print 27
console.log(convertToInt(11)) // should print 3
console.log(convertToInt(1)) // should print 1
console.log(productOfAllElements([1, 2, 3, 4])) // should print [24, 12, 8, 6]
console.log(nonRepeatingNumber([9, 2, 3, 2, 6, 6, 8])) // should print 9
console.log(rightRotate([1, 2, 3, 4, 5])) // should print [5, 1, 2, 3, 4]
console.log(rearrangePositiveNegative([10, -1, 20, 4, 5, -9, -6])) // should print [-9, -6, -1, 4, 5, 10, 20]

function mergeTwoSortedArrays(array1, array2) {
    let sortedBothArrays = [];
    let i = 0, j = 0, k = 0;
    while (i < array1.length && j < array2.length) {
        if (array1[i] < array2[j]) {
            sortedBothArrays[k++] = array1[i++];
        } else {
            sortedBothArrays[k++] = array2[j++];
        }
    }
    while (i < array1.length) {
        sortedBothArrays[k++] = array1[i++];
    }
    while (j < array2.length) {
        sortedBothArrays[k++] = array2[j++];
    }
    return sortedBothArrays;
}

function convertToInt(newNumber) {
    let sum = 0;
    let counter = 0;
    let length = newNumber.toString().length;
    while (length !== 0) {
        const r = newNumber % 10;
        const decimal = r * Math.pow(2, counter);
        sum += decimal;
        counter++;
        newNumber = Math.floor(newNumber / 10);
        length--;
    }
    return sum;
}


function productOfAllElements(initialList) {
    let result = new Array(initialList.length).fill(0);
    for (let i = 0; i < result.length; i++) {
        let multiply = 1;
        for (let j = 0; j < initialList.length; j++) {
            if (i === j) continue;
            multiply *= initialList[j];
        }
        result[i] = multiply;
    }
    return result;
}

function nonRepeatingNumber(numbers) {
    let result = 0;
    for (let i = 0; i < numbers.length - 1; i++) {
        let digit = numbers[i];
        let exists = false;
        for (let j = i + 1; j < numbers.length; j++) {
            if (digit === numbers[j]) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            result = digit;
            break;
        }
    }
    return result;
}

function rightRotate(digits) {
    let result = new Array(digits.length).fill(0);
    result[0] = digits[digits.length - 1];
    for (let i = 1; i < result.length; i++) {
        result[i] = digits[i - 1];
    }
    return result;
}

function rearrangePositiveNegative(digits) {
    for (let i = 0; i < digits.length; i++) {
        for (let j = 0; j < digits.length; j++) {
            if (digits[i] < digits[j]) {
                let temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;
            }
        }
    }
    return digits;
}
