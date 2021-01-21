package Maven.com;

public class Sample 
{

	public static void main(String[] args) 
	{
		System.out.println("Learning Maven");
		String path = "/home/anu/workspace/New_Eclipse/MyMaven/Data.xlsx";
		Xls_Reader xls=new Xls_Reader(path);
		System.out.println(xls.getRowCount("LoginTest"));
	}

}
