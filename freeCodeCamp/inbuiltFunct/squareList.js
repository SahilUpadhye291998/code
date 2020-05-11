const squareList = arr => {
    // Only change code below this line
    const newArray = arr
        .filter(num => {
            return num > 0 && parseInt(num) === num;
        })
        .map(num => {
            return num * num;
        });
    return newArray;
    // Only change code above this line
};

const squaredIntegers = squareList([-3, 4.8, 5, 3, -3.2]);
console.log(squaredIntegers);
