public class Prog53 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        makeZeroArray(n);
        System.out.println("要素が全て0の配列を作成します");
        int[] makeZeroArray = new int[n];
      for(int i = 0; i < makeZeroArray.length; i++){
          System.out.print(makeZeroArray[0] + " ");
          makeZeroArray[i] = 0;
      }
      System.out.println();
      
      int[] addOne = new int[n];
      System.out.println("配列の各要素に1を加えます");
      int[] array= new int[n];
      for(int j = 0; j < array.length; j++){
          System.out.print(array[0] + 1 +" ");
          array[j] = 0;
    }
    System.out.println();
}
public static int[] makeZeroArray(int n) {
 int[] makeZeroArray = new int[n];
 return makeZeroArray;
    }
public static void addOne (int[] array){
 int[] addOne = array;
 for(int j = 0; j < array.length; j++){
     array[j]++;
    }
    }
}

