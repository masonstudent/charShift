class charshift{
    public static void main(String[] args) {
        char i = 'a';
        int sum,carry;

        //System.out.println(Integer.toBinaryString(a))


        for(int j = 0;j<26;j++){
            System.out.println(i);
            carry = i & 1;
            sum = i^1;
            
            while(carry != 0){
                int shiftBit = carry << 1;
                carry = sum & shiftBit;
                sum = sum ^ shiftBit;
            }
            i = (char) sum; 
        }
            
            
    }
}