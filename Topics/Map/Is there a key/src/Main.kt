fun containsKeyAndValue(map: Map<String, String>, value: String): Boolean {

    if (map.containsKey(value) && map.containsValue(value)) return true

    return false

}