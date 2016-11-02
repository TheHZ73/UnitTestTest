import java.util.Scanner;

public class CalcMain {
	static Scanner sc=new Scanner(System.in);
		
	public static void main(String[] args) {
		try
		{
			String FirstNumber=EnterFirstNumber();
			String op=EnterSign();	
			if (op.equals("sqrt")==true)
			{
				System.out.println("Результат:"+Calc.metodSqrt(Integer.parseInt(FirstNumber)));
			}
			else{
				String SecondNumber=EnterSecondNumber();					
				System.out.println("Результат:"+Calc.metodCalc(Integer.parseInt(FirstNumber),op,Integer.parseInt(SecondNumber)));
			}
			sc.close();
		}
		catch (ArithmeticException exception)
		{
			System.out.println("Делить на ноль нельзя, корень из отрицательного числа брать нельзя");
		}
		
	}
	//ввод первого числа 		
	static String EnterFirstNumber(){
		System.out.println("Введите первое число:");
		String n1=sc.next();
		if (checkString (n1)==false) {
			System.out.println("Введенная строка не число");
			n1=EnterFirstNumber();
		}
		return n1;
	}
	//ввод знака
	static String EnterSign(){
		System.out.println("Введите знак операции:");
		String op=sc.next();
		if ((op.equals("*")==true)||(op.equals("/")==true)||(op.equals("-")==true)||(op.equals("+")==true)||(op.equals("sqrt")==true)) return op;
		else{
			System.out.println("Введен не верный знак операции, пожалуйста введите *,/,+,- или sqrt");
			op=EnterSign();
		}
		return op;
	}
	//ввод второго числа
	static String EnterSecondNumber(){
		System.out.println("Введите второе число:");
		String n2=sc.next();
		if (checkString (n2)==false) {
			System.out.println("Введенная строка не число");
			n2=EnterSecondNumber();
		}
		return n2;
	}
	//Проверка является ли строка числом
	public static boolean checkString (String string){
		try{
			Integer.parseInt(string);			
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
