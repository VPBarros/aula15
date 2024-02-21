
public class Conversor {
    public static double IOF = 0.06;
	
	public static double dolarReal(double quantidade,double dolarPreco) {
		return quantidade * dolarPreco * (1.0 +IOF);
	}


}
