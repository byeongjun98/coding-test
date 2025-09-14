function solution(number) {
    const bigNumber = BigInt(number)
    return Number(bigNumber % 9n)
}
