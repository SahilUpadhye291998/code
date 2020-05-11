function dropElements(arr, func) {
    let count = 0;
    while (!func(arr[count])) {
        arr.shift();
        console.log(arr[count]);
    }
    return arr;
}

console.log(
    dropElements([0, 1, 0, 1], function(n) {
        return n === 1;
    })
);
