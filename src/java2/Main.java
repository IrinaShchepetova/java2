package java2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер массива, соответствующий 4Х4");
        Scanner scan=new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        String[][] myArray = new String[i][j];
        System.out.println("Сумма массива равна:");
        try {
            fillSumArray(myArray);
            System.out.println(fillSumArray(myArray));
        }
        catch (MyArraySizeException e){
            System.out.println("Массив не соответствует размерам!");
        }
        catch (MyArrayDataException e){
            System.out.println("Массив заполнен неправильными значениями! Ошибка в: " + "["+ e.k + "]" + "["+e.l+"]");
        }
    }
    public static int fillSumArray(String[][] myArray) throws MyArraySizeException, MyArrayDataException {
        int sum=0;
        for (int k=0;k< myArray.length;k++){
            for (int l=0;l< myArray[k].length;l++){
                if (myArray.length !=4 || myArray[k].length !=4){
                    throw new MyArraySizeException();
                }
                myArray[k][l] = l + "1";
                try{
                    sum+= Integer.parseInt(myArray[k][l]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(k,l);
                }
            }
        }
        return sum;
    }
}
