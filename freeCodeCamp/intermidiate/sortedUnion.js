function uniteUnique() {
    const newArray = [];
    for (let i = 0; i < arguments.length; ++i) {
        newArray.push(...arguments[i]);
    }
    const temp = [...new Set(newArray)];
    return temp;
}

console.log(uniteUnique([1, 3, 2], [5, 2, 1, 4], [2, 1]));
