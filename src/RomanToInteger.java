public class RomanToInteger {
    public static int romanToInt(String s) {
        int sum = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == 'I'){
                if(s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'){
                    sum--;
                }
                else{
                    sum++;
                }
            }
            else if(s.charAt(i) == 'X'){
                if(s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'){
                    sum -= 10;
                }
                else{
                    sum += 10;
                }
            }
            else if(s.charAt(i) == 'C'){
                if(s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'){
                    sum -= 100;
                }
                else{
                    sum += 100;
                }
            }
            else if(s.charAt(i) == 'V'){
                sum += 5;
            }
            else if(s.charAt(i) == 'L'){
                sum += 50;
            }
            else if(s.charAt(i) == 'D'){
                sum += 500;
            }
            else if(s.charAt(i) == 'M'){
                sum += 1000;
            }
        }
        if(s.charAt(s.length()-1) == 'I'){
            sum++;
        }
        else if(s.charAt(s.length()-1) == 'V'){
            sum += 5;
        }
        else if(s.charAt(s.length()-1) == 'X'){
            sum += 10;
        }
        else if(s.charAt(s.length()-1) == 'L'){
            sum += 50;
        }
        else if(s.charAt(s.length()-1) == 'C'){
            sum += 100;
        }
        else if(s.charAt(s.length()-1) == 'D'){
            sum += 500;
        }
        else if(s.charAt(s.length()-1) == 'M'){
            sum += 1000;
        }
        return sum;
    }

    public static void main(String[] args){
        String roman = "MCMXCIV";
        int result = romanToInt(roman);
        System.out.println(result);
    }
}
