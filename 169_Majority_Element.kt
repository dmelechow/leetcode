// https://leetcode.com/problems/majority-element/
// https://ru.wikipedia.org/wiki/%D0%90%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC_%D0%B1%D0%BE%D0%BB%D1%8C%D1%88%D0%B8%D0%BD%D1%81%D1%82%D0%B2%D0%B0_%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2_%D0%91%D0%BE%D0%B9%D0%B5%D1%80%D0%B0_%E2%80%94_%D0%9C%D1%83%D1%80%D0%B0
// Алгоритм большинства голосов Бойера — Мура

fun majorityElement(nums: IntArray): Int {
    var counter: Int = 0
    var majorityElement: Int = 0

    for(num in nums) {
        if(counter == 0) {
            majorityElement = num
        } 
        
        if(num == majorityElement) {
            counter++
        }else {
            counter--
        }
    }  

    return majorityElement
}