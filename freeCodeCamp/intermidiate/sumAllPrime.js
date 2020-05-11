function sumPrimes(num) {
    let sum = 0;
    for (let i = 1; i <= num; ++i) {
        if (isPrime(i)) {
            sum += i;
        }
    }
    function isPrime(isPrimeNumber) {
        for (var j = 2; j < isPrimeNumber; j++) {
            if (isPrimeNumber % j === 0) {
                return false;
            }
        }
        return true;
    }
    return sum - 1;
}

console.log(sumPrimes(977));
