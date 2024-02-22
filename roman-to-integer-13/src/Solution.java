import java.util.Hashtable;

class Solution {
    public static int romanToInt(String s) {

        Hashtable<Character, Integer> symbols = new Hashtable<>();

        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);

        int resp = 0;

        for (int i = s.length() - 1; i >= 0; i--){
            Character caracterAtual = s.charAt(i);

            if(i == 0){
                resp += symbols.get(caracterAtual);
                break;
            }

            Character caracterAnterior = s.charAt(i - 1);

            if(caracterAtual.equals('M') || caracterAtual.equals('D')){
                if (caracterAnterior.equals('C')){
                    resp += symbols.get(caracterAtual) - symbols.get(caracterAnterior);
                    i--;
                    continue;
                }
                resp += symbols.get(caracterAtual);
                continue;
            } else if(caracterAtual.equals('L') || caracterAtual.equals('C')){
                if (caracterAnterior.equals('X')){
                    resp += symbols.get(caracterAtual) - symbols.get(caracterAnterior);
                    i--;
                    continue;
                }
                resp += symbols.get(caracterAtual);
                continue;
            }else if(caracterAtual.equals('X') || caracterAtual.equals('V')){
                if (caracterAnterior.equals('I')){
                    resp += symbols.get(caracterAtual) - symbols.get(caracterAnterior);
                    i--;
                    continue;
                }
                resp += symbols.get(caracterAtual);
                continue;
            }
            resp += symbols.get(caracterAtual);
        }
        return resp;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCVI"));//1996
        System.out.println(romanToInt("MMXXIV"));//2024
        System.out.println(romanToInt("MCML"));//1950
        System.out.println(romanToInt("MMCMXCIX"));//2999
    }
}