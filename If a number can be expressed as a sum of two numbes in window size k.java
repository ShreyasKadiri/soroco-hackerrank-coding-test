class Solution{
    public  static List<Integer> sumPairEquals(int numbers[], int k){
        ArrayList<Integer> validNumbers = new ArrayList<Integer>();
        if(numbers.length==0 || numbers.length<k){
            return validNumbers;
        }
       
        if(numbers.length==1 && k==1){
            validNumbers.add(numbers[0]);
        }
        //Main code
        for(int i=k+1; i<numbers.length; i++){
            if(sumPairExists(numbers , i-k, i-1, numbers[i])){
                validNumbers.add(numbers[i]);
            }
        }
        return validNumbers;
    }
   
   
    public static boolean sumPairExists(int numbers[], int startIndex, int endIndex, int currentNumber){
    HashMap<Integer,Integer> map = new  HashMap<Integer,Integer>();
    for(int i=startIndex; i<=endIndex; i++){
        map.put(numbers[i], map.getOrDefault(numbers[i],0)+1);
    }
   
    for(int i=startIndex; i<=endIndex; i++){
        int currentElement  = currentNumber - numbers[i];
        if(map.containsKey(currentElement)){
            return true;
        }
        break;
    }
        return false;
    }
