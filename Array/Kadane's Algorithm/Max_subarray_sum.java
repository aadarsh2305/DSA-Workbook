class Max_subarray_sum{

    /* // Brute force approach O(n^3)
    public static int maxSubaraySum(int[] arr,int len){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                maxSum=Math.max(maxSum, sum);
            }
        }
        return maxSum;
    } */

    
    // Better approach 2 pointer approach O(n^2)
    public static int maxSubaraySum(int[] arr,int len){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            int sum=0;
            for(int j=i;j<len;j++){
                sum+=arr[j];
                maxSum=Math.max(maxSum, sum);
            }
        }
        return maxSum;
    } 
    
    public static void main(String[] args) {
        
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int len=arr.length;
        int maxsum=maxSubaraySum(arr,len);
        System.out.println("The maximum subarray sum is :" +maxsum);
    }
}