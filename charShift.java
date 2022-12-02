class charshift{
    public static void main(String[] args) {
        char i = 'a';
        char j = 'A';

        //System.out.println(Integer.toBinaryString(a))   
        printAlphabet(i); 
        printAlphabet(j);   
    }

    public static void printAlphabet(char start){
        int sum,carry;
        for(int j = 0;j<26;j++){
            System.out.println(start);
            carry = start & 1;
            sum = start^1;
            
            while(carry != 0){
                int shiftBit = carry << 1;
                carry = sum & shiftBit;
                sum = sum ^ shiftBit;
            }
            start = (char) sum; 
        }

    }
}