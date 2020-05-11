function getIndexToIns(arr, num) {
    return arr
        .concat(num)
        .sort((a, b) => a - b)
        .indexOf(num);
}

const index = getIndexToIns([10, 20, 30, 40, 50], 30);
console.log(index);
