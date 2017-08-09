package ru.ezhov.lessons.homework.suvorov_vm.Glava1;
import java.util.Scanner;
class Var2_1 {
    public static void main (String[] args){
        System.out.println("Введите через пробел целые числа");
        Scanner scan = new Scanner(System.in);
        String valStr = scan.nextLine();
        String[] massValStr = valStr.split(" ");
        viborOperation(massValStr);
    }

    public static void viborOperation(String[] val)
    {
        try
        {
            int[] intArrVal = arrInt(val);
            System.out.println("Выберите пункт для действий " +
                    "\n1..... " +
                    "\n2.....");
            Scanner scan = new Scanner(System.in);
            String vibrannyPunct = scan.next();
            try{
                int vibor = Integer.parseInt(vibrannyPunct);
                switch(vibor) {
                    case 1:
                        chetn(intArrVal);
                        break;
                    case 2:
                        nechetn(intArrVal);
                        break;
                    default:
                        System.out.println("Такой функции еще не добавлено");
                }
            }
            catch(Exception e)
            {
                System.out.println("Ввести нужно только одну цифру");
            }
        }
        catch(Exception e)
        {
            System.out.println("Ввели не корректные данные");
        }
    }

    public static int[] arrInt(String[] val)
    {
        int[] valInt = new int[val.length];
        for(int i = 0; i < val.length; i++)
        {
            valInt[i] = Integer.parseInt(val[i]);
        }
        return valInt;
    }

    public static void chetn(int[] val)
    {
        for(int i = 0; i < val.length ; i++)
        {

            if((val[i] % 2) ==0)
            {
                System.out.print(val[i] + " ");
            }

        }
    }

    public static void nechetn(int[] val)
    {
        for(int i = 0; i < val.length; i++)
        {
            if((val[i] % 2) != 0)
            {
                System.out.print(val[i] + " ");
            }

        }

    }

}