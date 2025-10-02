public class two_sum {
    public static boolean twosum(int arr[] , int target){
        for (int i = 0; i<arr.length-1; i++) {
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]+arr[j]==target){
                return true;
                }
                
                }
                
            
                
            }
            
        return false;
        }       
    
    public static void main(String[] args) {
        int arr[] = {2,4,67,9,4,2,5};
        int target = 4;
        //Thhis code is used to find two sum in an array.
        boolean s = twosum(arr, target);
        System.out.println(s);
    }
}
