function bouncer(arr) {
    const newArray = arr
        .filter(data => {
            if (data == false) {
                return;
            }
            return data;
        })
        .map(data => {
            return data;
        });
    return newArray;
}

//bouncer([7, "ate", "", false, 9]);
console.log(bouncer([null, NaN, 1, 2, undefined]));
