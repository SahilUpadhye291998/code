// time complexity would be O(n*n) and space complexity = O(1)
function destroyer(arr, ...numberToBeDeleted) {
    console.log(numberToBeDeleted);
    console.log(arr);
    const t = arr
        .filter(data => {
            return !numberToBeDeleted.includes(data);
        })
        .map(data => {
            return data;
        });
    return t;
}

// time complexity should be O(3n) and space complexity O(3);
function destroyer_v2(arr, ...numberToBeDeleted) {
    // this should be a better function
    // we will use hashmap for this aka key value pair;
    // we will store arr in key value pair
    let map = {};
    for (let i = 0; i < arr.length; ++i) {
        if (!map.hasOwnProperty(arr[i])) {
            let temp = arr[i];
            map[temp] = 1;
        } else {
            let temp = arr[i];
            map[temp] += 1;
        }
    }
    for (let i = 0; i < numberToBeDeleted.length; ++i) {
        delete map[numberToBeDeleted[i]];
    }
    //iterate over a map and make a new array
    console.log(map);
}

//destroyer([1, 2, 3, 1, 2, 3], 2, 3);
destroyer_v2([1, 2, 3, 1, 2, 3], 2, 3);
