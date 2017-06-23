import java.io.*;

class BufferReaderExample{
	
	public static void main(String[] args) throws Exception{

	String str;
	int i;
	float f;
	double d;
	//long  l;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	str = br.readLine();
	i = Integer.parseInt(br.readLine());
	f = Float.parseFloat(br.readLine());
	d = Double.parseDouble(br.readLine());
	

	System.out.println(str+" "+i+" "+f+" "+d);



	}
}