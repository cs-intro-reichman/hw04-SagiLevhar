import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class ArrayOps {
    public static void main(String[] args) {

        System.out.println(secondMaxValue(new int[] {8, -2, 7, -8, -5}));

    }

    public static int findMissingInt (int [] array) {
        int n = array.length;
        int MissingInt = 0;
        int CurrentSum = 0;
        int ExpectedSum = (n * (n + 1)) / 2; 
        for (int i = 0; i < n; i++) {
            CurrentSum += array[i];
        }
        MissingInt = ExpectedSum - CurrentSum;
        return MissingInt;
    }
    
    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int min = array[0];
        int secondMaxValue=0;
        int j = 0;
        boolean flag = true;
        for(int i=0; i<array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
            if ( array[i]< min){
                min = array[i];
            }
        }
        while (flag) {
            if (array[j] == max){
                array[j] = min;
                secondMaxValue = min;
                flag = false;
            }
            j++;            
        }
        for(int k=0; k<array.length; k++){
            if (array[k] > secondMaxValue){
                secondMaxValue = array[k];
            }
        }

        /*int[] MaxToMin = new int[array.length];
        int TempMax = 0;
        boolean flag = false;
        int index =0;
        for (int i =0; i < array.length; i++){
            for (int j=i; j < array.length; j++){
                TempMax = array[j];
                if (array[j] >= TempMax) {
                    TempMax = array[j]; 
                    MaxToMin[j] = TempMax;

                }
            } 
        }
        int secondMaxValue= MaxToMin[0];
        while (!flag && index < array.length){
            if (MaxToMin[index+1] < MaxToMin[index]){
                flag = true;
                secondMaxValue = MaxToMin[index+1];
            }
            index++;
        }   
        return MaxToMin[1];*/
        return secondMaxValue;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int count1 = 0, count2 = 0;
        
        boolean[] found1 = new boolean[array1.length];
        for (int i=0; i<found1.length; i++){
            found1[i] = false;
        }
        boolean[] found2 = new boolean[array2.length];
        for (int i=0; i<found2.length; i++){
            found2[i] = false;
        }
        for (int i=0; i<array1.length; i++){
            for (int j=0; j<array2.length; j++){
                if (array1[i] == array2[j]){
                    found1[i] = true;
                }
            }
        }
        for (int i=0; i<array2.length; i++){
            for (int j=0; j<array1.length; j++){
                if (array2[i] == array1[j]){
                    found2[i] = true;
                }
            }
        }
        for (int j=0;j<found1.length;j++){
            if (found1[j] == true){
                count1++;
            }
        }
        for (int j=0;j<found2.length;j++){
            if (found2[j] == true){
                count2++;
            }
        }
        return ((count1 == array1.length) && (count2 == array2.length));
    }

    public static boolean isSorted(int [] array) {
        boolean isSorted = true;
        if (array[0] < array[array.length-1]){
            for (int i=0; i<array.length - 1; i++){
                if (array[i] > array[i + 1]){
                    isSorted = false;
                }
            }

        } else if (array[0] > array[array.length-1]){
            for (int i=0; i<array.length - 1; i++){
                if (array[i] < array[i + 1]){
                    isSorted = false;
                }
            }
        }
        return isSorted;
    }

}
