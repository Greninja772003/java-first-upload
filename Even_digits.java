class Even_digits {
    public static void main(String[] args) {
        int[] nums = {12,3465,2,6,7845,534121}; 
        System.out.println(findNumbers(nums));
        
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
    return count;
    
    }
    //function to check whether a number contains even digits or not
    static boolean even(int num){
        int numofDigits = digits(num);
        return numofDigits % 2 == 0;
    }
    //cou8nt no. of digits in a number
    static int digits(int num){
        int count = 0 ;
        while(num>0){
            count++;
            num = num/ 10; //num/= 10
        }
        return count;
    }
    
}
