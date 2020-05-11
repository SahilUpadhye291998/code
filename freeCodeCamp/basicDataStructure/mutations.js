function mutation(arr) {
    let words2Element = arr[1].slice(0).split("");
    for (let i = 0; i < words2Element.length; i++) {
        if (!arr[0].toLowerCase().includes(words2Element[i].toLowerCase())) {
            return false;
        }
    }
    return true;
}

const isMutated = mutation(["Mary", "Army"]);
console.log(isMutated);
