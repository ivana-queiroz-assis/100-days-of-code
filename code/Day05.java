//389. Find the Difference
//You are given two strings s and t.
//
//String t is generated by random shuffling string s and then add one more letter at a random position.
//
//Return the letter that was added to t.
class Solution {
    public char findTheDifference(String s, String t) {
        String aux = new String(t);
        for (int i=0; i< s.length(); i++){

            if(t.contains(String.valueOf(s.charAt(i)))){
                int indexToELiminate = t.indexOf(s.charAt(i));

                aux = t.substring(0, indexToELiminate) + t.substring(indexToELiminate+1);
                t = new String(aux);
            }
        }
        return aux.charAt(0);
    }
}