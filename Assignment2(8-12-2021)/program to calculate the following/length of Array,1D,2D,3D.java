public class Arrays {

	public static void main(String[] args)
	{
		//Find the length of int array
		
		System.out.println("*******length of int array**********");
		int arr1[]= {0,1,2,3,4,5,6,7,8,9};
		System.out.println(arr1.length);
		
		//Find the length of char array
		
		System.out.println("*******length of char array**********");
		char arr2[]= {'P','U','G','A','Z','H','E','N','D','H','I'};
		System.out.println(arr2.length);
		
		//Find the length of String array
		
		System.out.println("********length of String array********");
		String arr3[]= {"puga","suman","john"};
		System.out.println(arr3.length);
		
		//Demonstrate a one-dimensional array
		
		int[] x = { 10, 20, 30, 40, 50};
        System.out.println("*******Print one-dimensional Array*****");
        for(int i = 0; i < x.length; i++)
        {
            System.out.println("Values on index "+ i + ": " + x[i]);
        }
        
      //Demonstrate a Two-dimensional array
        
        System.out.println("*******Print two-dimensional Array*****");
        int[][] a = {{1, 2, 3}, {4, 5, 6, 9} };
		
        System.out.println("Length of row 1: " + a[0][1]);
        System.out.println("Length of row 2: " + a[1].length);
       
        
      //Demonstrate a Multi-dimensional array
        
        System.out.println("*******Print Multi-dimensional Array*****");
        int[][][] num = {{{0,0,0},{1,1,1},{2,2,2}}};
        for(int x1 = 0; x1 < num.length; x1++)
        {
           for(int y = 0; y < num[x1].length; y++)
           {
              for(int z = 0; z < num[x1][y].length; z++)
              {
                 System.out.print(num[x1][y][z]);
              }
              System.out.println();
           }
        }
        
        
	}

}