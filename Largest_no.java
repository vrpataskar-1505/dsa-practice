public class Largest_no {
    public static void main(String[] args) {
       int arr[] = {1,3,9,3,7,4};
       int max=arr[0];
       int n= arr.length;
       
       for(int i=1;i<n;i++){
        if(max<arr[i]){
            max=arr[i];
        }

       }System.out.println(max);
    }

}
