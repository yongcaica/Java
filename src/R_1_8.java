/*
public class R_1_8 {
    public int numOfVowels(String text){
        int total = 0;
        for(int j=0;j<text.length();j++){
            switch(text.charAt(j)){
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'O':
                case 'o':
                case 'I':
                case 'i':
                case 'U':
                case 'u':
                    total += 1;
            }
        return total;
        }
    }
}
*/

class R2{
    public int totalOfVowels(String text){
        int total = 0;
        for(int j=0;j<=text.length();j++){
            switch(text.charAt(j)){
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'O':
                case 'o':
                case 'I':
                case 'i':
                case 'U':
                case 'u':
                    total += 1;
            }
        }
        return total;
    }
}


















