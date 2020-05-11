function convertHTML(str) {
    let temp = str.replace(/&/g, "&amp;");
    temp = temp.replace(/</g, "&lt;");
    temp = temp.replace(/>/g, "&gt;");
    temp = temp.replace(/\"/g, "&quot;");
    temp = temp.replace(/\'/g, "&apos;");
    console.log(temp);
    return temp;
}
console.log(convertHTML("<>"));
//console.log(convertHTML("Dolce < Gabbana < temp"));
