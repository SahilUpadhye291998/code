function rot13(str) {
    let input = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    let output = "NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm";
    let outputString = "";
    for (let i = 0; i < str.length; ++i) {
        if (output.indexOf(str[i]) === -1) {
            outputString += str[i];
            continue;
        } else {
            outputString += input[output.indexOf(str[i])];
        }
    }
    console.log(outputString);

    return str;
}

rot13("SERR PBQR PNZC");
