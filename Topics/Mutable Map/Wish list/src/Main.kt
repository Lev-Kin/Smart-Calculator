fun makeMyWishList(wishList: Map<String, Int>, limit: Int): MutableMap<String, Int> {
    val filteredMap = wishList.filterValues { it <= limit }
    val mutableMap = mutableMapOf<String, Int>()

    for (map in filteredMap) {
        mutableMap[map.key] = map.value
    }
    return mutableMap
}
