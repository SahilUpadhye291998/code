function titleCase(str) {
    let newString = str.toLowerCase().split(" ");
    for (let i = 0; i < newString.length; ++i) {
        newString[i] =
            newString[i].charAt(0).toUpperCase() + newString[i].slice(1);
    }
    return newString.join(" ");
}

const newString = titleCase("I'm a little tea pot");
console.log(newString);
