// https://leetcode.com/problems/first-bad-version/

fun firstBadVersion(n: Int) : Int {
    var start = 1
    var end = n
    var res = -1

    while(start <= end) {
        val mid = start + (end - start) / 2

        if(isBadVersion(mid)) {
            res = mid
            end = mid - 1
        } else {
            start = mid - 1
        }
    }

    return res
}