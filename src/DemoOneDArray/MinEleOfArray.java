package DemoOneDArray;

public class MinEleOfArray {


        //creating a method which receives an array as a parameter
        static void min(int arr[]){
            int min=arr[0];
            for(int i=1;i<arr.length;i++)
                if(min>arr[i])
                    min=arr[i];

            System.out.println(min);
        }

        static void max(int arr1[]){
            int max= arr1[0];

                    for(int j=1;j<arr1.length;j++)
                        if(max < arr1[j])
                            max=arr1[j];
            System.out.println(max);
        }

        public static void main(String args[]){
            int a[]={33,3,4,5};//declaring and initializing an array
            int b[]={110,20,45,190};//
            min(a);//passing array to method
            max(b);

        }
}

