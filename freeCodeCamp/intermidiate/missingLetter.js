function fearNotLetter(str) {
  const letters = "abcdefghijklmnopqrstuvwxyz";
  let indexOfFirst = letters.indexOf(str[0]);
  for (let index = 0; index < str.length; ++index) {
    if (str[index] != letters[indexOfFirst]) {
      return letters[indexOfFirst];
    }
    indexOfFirst++;
  }
  return undefined;
}

console.log(fearNotLetter("bcdf"));
