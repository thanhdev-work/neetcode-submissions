class Solution {

    public String encode(List<String> strs) {
        //["Hello", "World"] -> "Hello#Word" -> base on #
        // ["#","Hello", "Word"] -> "#HelloWord" when decode
        // ["1#","5Hello#", "Word"]
        // ["#", "#", "#"] -> "1##1##1##"
        StringBuilder encodedString = new StringBuilder();
        for(String s: strs){
            encodedString.append(String.format("%d%s%s", s.length(), "#", s));
        }
        return encodedString.toString();
    }
    //1##1##1## 0 split # i = 2 1 3 5
    //5#Hello4#World
    public List<String> decode(String str) {
        int i = 0, j = 0;
        List<String> output = new ArrayList<>();
        while (i < str.length()){
            StringBuilder lengthFlagS = new StringBuilder("");
            while(Character.isDigit(str.charAt(i))){
                lengthFlagS.append(str.charAt(i));
                i++;
            }
            j = i;
            while(str.charAt(j) !=  '#') {
                j++;
                break;
            }
            int lengthFlagN = Integer.parseInt(lengthFlagS.toString());
            String decoded = str.substring(j + 1, j + 1 + lengthFlagN);
            i = j + 1 + lengthFlagN;
            output.add(decoded);
        }
        return output;
    }
}
