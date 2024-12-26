public class jaggedArray
 {
 public static void main(String[] args) {
     int[][] jaggedArray = new int[3][];

     jaggedArray[0] = new int[3];
     jaggedArray[1] = new int[2];
     jaggedArray[2] = new int[4];

     jaggedArray[0][0] = 1;
     jaggedArray[0][1] = 2;
     jaggedArray[0][2] = 3;
     jaggedArray[0][0] = 4;
     jaggedArray[1][1] = 5;

     jaggedArray[2][0] = 6;
     jaggedArray[2][1] = 7;
     jaggedArray[2][2] = 8;
     jaggedArray[2][3] = 9;

     for(int i = 0; i < jaggedArray.length; i++){
        for(int j = 0; j < jaggedArray[i].length;j++){
            System.out.println(jaggedArray[i][j]+ " ");
        }
        System.out.println();
     }
     }      
}
