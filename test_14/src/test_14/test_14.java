package test_14;


public class test_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		car1.setNum(1234);
		car1.setGas(20.5);
	}

}
class Car{
	int num;
	double gas;
	void setNum(int n)
	{
		num=n;
		System.out.println("�N�����]��"+num);
	}
	void  setGas(double g)
	{
		gas=g;
		System.out.println("�N�T�o�q�]��"+gas);
	}
	
}