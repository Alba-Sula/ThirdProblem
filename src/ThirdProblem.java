public class ThirdProblem {
    public static void main(String[] args) {
        int[] a = {24 , -1 , 12 , -1 , 24};
        int sum=0;
        int min = Integer.MIN_VALUE;
        int startIndex=0;
        int endIndex=0;
            for(int  i=0;i<a.length;i++){
                for(int j=i;j<a.length;j++){
                    for(int k=i;k<=j;k++){
                        sum += a[k];
                    }
                    if(sum>=min){
                        min=sum;
                        startIndex=i;
                        endIndex=j;
                    }
                    sum=0;
                }
        }
        System.out.println("Start index is  " + startIndex +", end index "+ endIndex + " and the sum is " + min);
    }
}

