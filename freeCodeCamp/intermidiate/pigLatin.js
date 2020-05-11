function translatePigLatin(str) {
    let testForVowel = /a|e|i|o|u/gi;
    if (testForVowel.test(str[0])) {
        str += "way";
        return str;
    }
    let character = str.split("");
    let dataTobeAppendedAtBack = [];
    dataTobeAppendedAtBack.push(character[0]);
    for (let i = 1; i < character.length; ++i) {
        if (testForVowel.test(character[i])) {
            break;
        }
        dataTobeAppendedAtBack.push(character[i].toString());
    }
    character.splice(0, dataTobeAppendedAtBack.length);
    return character.join("") + dataTobeAppendedAtBack.join("") + "ay";
}

console.log(translatePigLatin("california"));
//console.log(translatePigLatin("alphabet"));
