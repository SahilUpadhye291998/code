function diffArray(arr1, arr2) {
    let newArray = [];
    arr1.map(data => {
        if (arr2.indexOf(data) === -1) {
            newArray.push(data);
        }
    });

    arr2.map(data => {
        if (arr1.indexOf(data) === -1) {
            newArray.push(data);
        }
    });

    return newArray;
}

//const test = diffArray([1, 2, 3, 5], [1, 2, 3, 4, 5]);
const temp = diffArray(
    ["andesite", "grass", "dirt", "pink wool", "dead shrub"],
    ["diorite", "andesite", "grass", "dirt", "dead shrub"]
);
console.log(temp);
