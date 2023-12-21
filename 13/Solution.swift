class Solution {

    let romanNumbers: [Character: Int] = [
        "I": 1,
        "V": 5,
        "X": 10,
        "L": 50,
        "C": 100,
        "D": 500,
        "M": 1000
    ]

    func romanToInt(_ s: String) -> Int {
        var result = 0, prev = 0
        for char in s {
            let current = romanNumbers[char]!
            result = (prev < current) ? result - prev * 2 + current : result + current
            prev = current
        }
        return result
    }
}