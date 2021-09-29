import java.math.BigDecimal;
public class BigDecimalExample{

	public static void main(String args[]){
	
		BigDecimal[] Arr = {new BigDecimal("1.78"),
							new BigDecimal("1.89"),
							new BigDecimal("1.34"),
							new BigDecimal("1.75"),
							new BigDecimal("1.09"),
							new BigDecimal("1.56"),
							new BigDecimal("1.74"),
							new BigDecimal("1.49"),
							new BigDecimal("1.22"),
							new BigDecimal("1.86")};
		
		BigDecimal sum = BigDecimal.ZERO;
		int count =0;
							
		for(BigDecimal i:Arr){
			sum = sum.add(i);
            count++;
		}
		
		System.out.println(sum.divide(new BigDecimal(count), BigDecimal.ROUND_HALF_UP));

	}
}