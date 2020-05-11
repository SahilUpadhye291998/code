function frankenSplice(arr1, arr2, n) {
    let newArr = arr2.slice(0);
    newArr.splice(n, 0, ...arr1);
    console.log(newArr);

    return newArr;
}

let arr1 = [1, 2, 3];
let arr2 = [4, 5, 6];
const newArr = frankenSplice(arr1, arr2, 1);
console.log(arr2);
console.log(newArr);
