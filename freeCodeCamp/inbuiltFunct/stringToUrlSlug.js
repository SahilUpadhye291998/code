// The global variable
var globalTitle = " Winter    Is Coming ";

// Only change code below this line
function urlSlug(title) {
    let newUrl = title.slice(0).toLowerCase();
    const newAr = newUrl
        .split(/\W/)
        .filter(data => {
            return data !== "";
        })
        .join("-");
    console.log(newAr);
}
// Only change code above this line

urlSlug(globalTitle);
