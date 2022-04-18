// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

fun main() {  
    val prices = intArrayOf(7,1,5,3,6,4)
    print(maxProfit(prices))
}

fun maxProfit(prices: IntArray): Int {
    var buyPrice = Int.MAX_VALUE
    var profit = 0

    for(price in prices){
        if(price < buyPrice){
            buyPrice = price
        }

        if(buyPrice < price){
            profit+= price - buyPrice
            buyPrice = price
        }
    }

    return profit
}
