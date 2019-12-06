package DefangingIp;
/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".
 */

class Solution {
    public String defangIPaddr(String address) {
        String answer = "";
        int i;
        for(i = 0; i < address.length(); i++) {
            String letter = Character.toString(address.charAt(i));
            if(letter.equals(".")) {
                answer = answer + "[.]";
            } else {
                answer = answer + letter;
            }
        }
        return answer;
    }
}