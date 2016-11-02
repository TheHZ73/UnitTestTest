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
				System.out.println("���������:"+Calc.metodSqrt(Integer.parseInt(FirstNumber)));
			}
			else{
				String SecondNumber=EnterSecondNumber();					
				System.out.println("���������:"+Calc.metodCalc(Integer.parseInt(FirstNumber),op,Integer.parseInt(SecondNumber)));
			}
			sc.close();
		}
		catch (ArithmeticException exception)
		{
			System.out.println("������ �� ���� ������, ������ �� �������������� ����� ����� ������");
		}
		
	}
	//���� ������� ����� 		
	static String EnterFirstNumber(){
		System.out.println("������� ������ �����:");
		String n1=sc.next();
		if (checkString (n1)==false) {
			System.out.println("��������� ������ �� �����");
			n1=EnterFirstNumber();
		}
		return n1;
	}
	//���� �����
	static String EnterSign(){
		System.out.println("������� ���� ��������:");
		String op=sc.next();
		if ((op.equals("*")==true)||(op.equals("/")==true)||(op.equals("-")==true)||(op.equals("+")==true)||(op.equals("sqrt")==true)) return op;
		else{
			System.out.println("������ �� ������ ���� ��������, ���������� ������� *,/,+,- ��� sqrt");
			op=EnterSign();
		}
		return op;
	}
	//���� ������� �����
	static String EnterSecondNumber(){
		System.out.println("������� ������ �����:");
		String n2=sc.next();
		if (checkString (n2)==false) {
			System.out.println("��������� ������ �� �����");
			n2=EnterSecondNumber();
		}
		return n2;
	}
	//�������� �������� �� ������ ������
	public static boolean checkString (String string){
		try{
			Integer.parseInt(string);			
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
