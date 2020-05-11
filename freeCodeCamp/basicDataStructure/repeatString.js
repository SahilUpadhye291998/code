function repeatStringNumTimes(str, num) {
    let tmp = str;
    for (let i = 0; i < num - 1; i++) {
        str += tmp;
    }
    return str;
}

console.log(repeatStringNumTimes("abc", 4));
