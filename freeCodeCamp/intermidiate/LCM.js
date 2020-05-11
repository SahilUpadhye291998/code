function smallestCommons(arr) {
    let min = Math.min(arr[0], arr[1]);
    while (true) {
        if (min % arr[0] == 0 && min % arr[1] == 0) {
            break;
        }
        ++min;
    }
    console.log(min);
    return arr;
}

smallestCommons([1, 5]);
