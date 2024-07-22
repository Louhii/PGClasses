
class HelloWorld {
    public static int Example1(int[] arrayOfInts,int n){
        int currmin=arrayOfInts[0];
        for(int i=0;i<n;i++){
            if(arrayOfInts[i]<currmin){
                currmin=arrayOfInts[i];
            }
        }
        return currmin;
    }
    public static void Example2(int[] arrayOfInts){
        Console.WriteLine("The values in the Array are:");

        for(int i=0;i<arrayOfInts.Length;i++){
            Console.Write(arrayOfInts[i].ToString()+" ");
        }
        Console.WriteLine();

    }

    public static void Example3(int[] arrayOfInts){
        int a=10;
        int b=5;
        bool found =false;
        for(int i=0;i<arrayOfInts.Length;i++){
            if(a==arrayOfInts[i]){
                Console.WriteLine("The value of a was found in the array.");
                found=true;
            }
            else if(b==arrayOfInts[i]){

                Console.WriteLine("The value of b was found in the array.");
                found=true;
            }

        }
        if(found==false){
            Console.WriteLine("None of the search values were found.");

        }

    }
    static void Main() {

        for(int i=0;i<2;i++){
            Console.Write("Enter size of the array:");
            int n = Convert.ToInt32(Console.ReadLine());
            int[] arrayOfInts=new int[n];
            for(int j=0;j<n;j++){
                int x=Convert.ToInt32(Console.ReadLine());
                arrayOfInts[j]=x;
            }


            int minimum=Example1(arrayOfInts,n);
            Console.WriteLine("Minimum value in the array is:"+minimum);
            Example2(arrayOfInts);
            Console.WriteLine("Search for values 'a=10' and 'b=5' in the array:");
            Example3(arrayOfInts);
        }



    }
}
