class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if(words.length!= pattern.length()){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for(int i =0;i<words.length;i++){
            char current_char = pattern.charAt(i);
            if(map.containsKey(current_char)){
                if(!map.get(current_char).equals(words[i])){
                    return false;
                }
            }else{
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(current_char , words[i]);
            }
        }
        return true;
    }
}