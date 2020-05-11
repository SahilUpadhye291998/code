function findLongestSubString(str) {
    let counter = 0;
    let words = str.split(" ").length;
    for (let i = 0; i < str.split(" ").length; i++) {
        if (counter < str.split(" ")[i].length) {
            counter = str.split(" ")[i].length;
        }
    }
    return counter;
}

const test = findLongestSubString("The quick brown fox jumped over a lazy dog");
