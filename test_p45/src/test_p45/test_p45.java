package test_p45;

public class test_p45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ŧiCar1");
		Car car1;
		car1=new Car();
		car1.setCar(1234,20.5);
		
		System.out.println("�ŧiCar2	");
		Car car2;
		
		System.out.println("�NCar1���w��Car2");
		car2=car1;
		
		System.out.println("Car1��");
		car1.show();
		
		System.out.println("Car2��");
		car2.show();
		
		System.out.println("����Car1���������");
		car1.setCar(2345,30.5);
		
		System.out.print("Car1��");
		car1.show();
		
		System.out.print("Car2��");
		car2.show();

	}

}
class Car
{
	private int num;
	private double gas;
	
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	
	public void show()
	{
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);	
	}
}