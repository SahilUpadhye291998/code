function myReplace(str, before, after) {
  const isUpperCase = /[A-Z]/;
  if (isUpperCase.test(before[0])) {
    str = str.replace(before, after[0].toUpperCase() + after.slice(1));
    console.log(after[0].toUpperCase() + after.slice(1));
  } else {
    str = str.replace(before, after);
  }
  return str;
}

console.log(
  myReplace("A quick brown fox Jumped over the lazy dog", "Jumped", "leaped")
);
