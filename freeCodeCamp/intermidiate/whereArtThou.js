function whatIsInAName(collection, source) {
    var arr = [];
    // Only change code below this line
    const srcKeys = Object.keys(source);
    arr = collection.filter(data => {
        return srcKeys.every(
            element =>
                data.hasOwnProperty(element) &&
                data[element] === source[element]
        );
    });
    // Only change code above this line
    return arr;
}

const test = whatIsInAName(
    [
        { first: "Romeo", last: "Montague" },
        { first: "Mercutio", last: null },
        { first: "Tybalt", last: "Capulet" }
    ],
    { last: "Capulet" }
);
console.log(test);
