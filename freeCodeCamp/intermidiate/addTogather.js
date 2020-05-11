/***
 *
 *This is a wrongly done example
 *https://www.freecodecamp.org/learn/javascript-algorithms-and-data-structures/intermediate-algorithm-scripting/arguments-optional
 *
 *
 * */

function addTogether() {
    if (arguments.length === 1 && typeof arguments[0] == "number") {
        return function(y) {
            if (typeof y === "number") {
                return arguments[0] + y;
            } else {
                return undefined;
            }
        };
    } else if (
        arguments.length === 2 &&
        typeof arguments[0] == "number" &&
        typeof arguments[1] == "number"
    ) {
        return arguments[0] + arguments[1];
    } else {
        return undefined;
    }
}
const func = addTogether(1);
console.log(func([3]));

console.log(addTogether(1, [3]));
