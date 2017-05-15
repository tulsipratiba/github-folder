
public class Addtwonumbers {

	public static void main(String[] args) 
	{
		
		System.out.println(" Sum of 30 Add 100 is : " + Add(30, 100));
		

	}


public static int Add(int a, int b)
{
    if(b == 0) return a;
    int sum = a ^ b; 
    int carry = (a & b) << 1;  
    return Add(sum, carry);
}

}