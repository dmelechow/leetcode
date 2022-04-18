// https://leetcode.com/problems/longest-substring-without-repeating-characters/

fun main() {  
    println(lengthOfLongestSubstring("dvdf"))
    // println(lengthOfLongestSubstring("abcabcbb"))
}

fun lengthOfLongestSubstring(s: String): Int {
    if(s.length == 0) return 0

    var maxDistance = 0

    var map = HashMap<Char, Int>()

    var startIndex: Int = 0
    
    for(endIndex in s.indices) {

        var isDuplicated = map.containsKey(s[endIndex])

        maxDistance = Math.max(maxDistance, endIndex - startIndex)

        if(isDuplicated) {         
   
            val repeatedIndex = map.get(s[endIndex])!!

            for(i in startIndex..repeatedIndex){
                map.remove(s[i])
            }

            startIndex = repeatedIndex+1
        } 

        map[s[endIndex]] = endIndex
    }

    return Math.max(maxDistance, map.size)
}


// fun lengthOfLongestSubstring(s: String): Int {
//     var res = 0
//     var maxDistance = 0

//     var map = HashSet<Char>()
    
//     for(i in s.indices) {
//         if(map.contains(s[i])){
//             map.clear()
//             maxDistance = 0  
//         } 

//         map.add(s[i])
//         maxDistance++

//         if(maxDistance > res){
//             res = maxDistance
//         }        
//     }

//     return res
// }