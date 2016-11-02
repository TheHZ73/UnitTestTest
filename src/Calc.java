//класс вычислений
public class Calc {
	public static int metodCalc(int a1, String op, int a2)
	{
		int res=0;
		if (a2==0&&op=="/")
		{
			throw new ArithmeticException();
		}
		else
		{
			switch(op)
			{
				case "+": res=a1+a2; break;
				case "-": res=a1-a2; break;
				case "*": res=a1*a2; break;
				case "/": res=a1/a2; break;
			}
		}
		return res;
	}
	public static double metodSqrt (int a1)
	{
		double res=0;
		if (a1<0)
		{
			throw new ArithmeticException();
		}
		else
		{
			res=Math.sqrt(a1);
		}
		return res;
	}

}
