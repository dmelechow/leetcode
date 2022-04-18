// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

// [7,1,5,3,6,4] 
fun main() {  
    // val prices = intArrayOf(7,6,4,3,1)
    // val prices = intArrayOf(7,1,5,3,6,4)
    val prices = intArrayOf(2, 4, 1)
    print(maxProfit(prices))
}

fun maxProfit(prices: IntArray): Int {
    
    var buyPrice = Int.MAX_VALUE
    var profit = 0

    for(price in prices){
        if(price < buyPrice){
            buyPrice = price
        }
        val currentProfit = price - buyPrice

        if(currentProfit > profit) {
            profit = currentProfit
        }

    }

    return profit
}


// fun maxProfit(prices: IntArray): Int {
//     var buyPrice = prices[0]
//     var sellPrice = prices[0]

//     for(price in prices){
//         if(buyPrice > price){
//             buyPrice = price
//             sellPrice = 0
//         } else if(sellPrice < price){
//             sellPrice = price
//         }
//     }

//     println(buyPrice)
//     println(sellPrice)

//     if(buyPrice >= sellPrice){
//         return 0
//     }

//     return sellPrice - buyPrice
// }