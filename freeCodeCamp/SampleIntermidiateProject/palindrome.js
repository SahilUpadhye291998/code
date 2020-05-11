function palindrome(str) {
    const temp = str.toLowerCase().replace(/[^a-zA-Z0-9]/g, "");
    str = str
        .toLowerCase()
        .replace(/[^a-zA-Z0-9]/g, "")
        .split("")
        .reverse()
        .join("");
    return temp === str;
}

palindrome("_eye");
