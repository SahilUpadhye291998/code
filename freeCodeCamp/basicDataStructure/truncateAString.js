function truncateString(str, num) {
    let newString = "";

    if (str.length > num) {
        newString = str
            .split("")
            .splice(0, num)
            .join("");
        newString += "...";
    }

    return newString;
}

console.log(truncateString("A-tisket a-tasket A green and yellow basket", 8));
