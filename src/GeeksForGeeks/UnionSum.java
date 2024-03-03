package GeeksForGeeks;

public class UnionSum {

    public static int doUnion(int a[], int n, int b[], int m)
    {
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i] == b[j]){
                    sum = sum + a[i];
                    break;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int A[] = new int[]{1,2,3,4,5,};
        int B[] = new int[]{1,2,3};
        System.out.println(doUnion(A,5,B,3));
    }
}
