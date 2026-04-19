class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        //O(n)
        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            map.putIfAbsent(new String(charArray), new ArrayList<String>());
            map.get(new String(charArray)).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
