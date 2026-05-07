class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();
        for(String s: strs){
            char[] cArr = s.toCharArray();
            Arrays.sort(cArr);
            hashMap.putIfAbsent(new String(cArr), new ArrayList());
            hashMap.get(new String(cArr)).add(s);
        }
        return new ArrayList<>(hashMap.values());
    }
}
