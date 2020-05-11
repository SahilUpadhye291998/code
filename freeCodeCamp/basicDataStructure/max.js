function largestOfFour(arr) {
    let newArray = [];
    let counter = 0;
    for (let i = 0; i < arr.length; i++) {
        let tempMax = Math.max(...arr[i]);
        newArray.push(tempMax);
    }
    return newArray;
}

let maxArray = largestOfFour([
    [4, 5, 1, 3],
    [13, 27, 18, 26],
    [32, 35, 37, 39],
    [1000, 1001, 857, 1]
]);

console.log(maxArray);
