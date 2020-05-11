function pairElement(str) {
  const map = {
    A: "T",
    T: "A",
    C: "G",
    G: "C",
  };
  let newDNA = [];
  let chars = str.split("");
  for (let i = 0; i < chars.length; ++i) {
    let temp = [chars[i], map[chars[i]]];
    newDNA.push(temp);
  }
  return newDNA;
}

pairElement("GCG");
