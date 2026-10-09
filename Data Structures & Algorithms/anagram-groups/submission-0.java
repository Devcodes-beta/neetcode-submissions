
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int[] arr = new int[26];

            // Count the frequency of each character
            for (int j = 0; j < strs[i].length(); j++) {
                char ch = strs[i].charAt(j);
                arr[ch - 'a']++;
            }

            // Generate a unique key from the frequency array
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < 26; k++) {
                sb.append(arr[k]).append('#');
            }

            String key = sb.toString();

            // Group anagrams using the key
            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}