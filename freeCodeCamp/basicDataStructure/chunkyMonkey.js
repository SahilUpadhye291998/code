function chunkArrayInGroups(arr, size) {
    const newArray = [];
    const numOfArray = arr.length / size;
    for (let i = 0; i < numOfArray; i++) {
        newArray.push(arr.slice(0, size));
        arr.splice(0, size);
    }
    return newArray;
}

const temp = chunkArrayInGroups([0, 1, 2, 3, 4, 5, 6, 7, 8], 2);
console.log(temp);
