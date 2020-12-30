//1323. Maximum 69 Number
//Given a positive integer num consisting only of digits 6 and 9.
//
//Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).



class Solution {
    public int maximum69Number (int num) {
        Integer numeroTrocado= new Integer(0);
        String numString = String.valueOf(num);
        List<Integer> listaNumerosTrocados = new ArrayList<Integer>();
        for(int i = 0; i< numString.length(); i++){
            if(54 == numString.charAt(i)){
                numeroTrocado = replaceCharacter(numString, i, '9');
            }else if(numString.charAt(i) == 57) {
                numeroTrocado = replaceCharacter(numString, i, '6');
            }
            listaNumerosTrocados.add(numeroTrocado);
        }
        Collections.sort(listaNumerosTrocados);
        if(listaNumerosTrocados.get(listaNumerosTrocados.size()-1) < num){
            return num;
        }
        return listaNumerosTrocados.get(listaNumerosTrocados.size()-1);
    }

    private Integer replaceCharacter(String numeroString, int index, char character){
        char[] myNameChars = numeroString.toCharArray();
        myNameChars[index] = character;
        return  Integer.valueOf(String.valueOf(myNameChars));
    }

}