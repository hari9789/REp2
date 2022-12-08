package defaulpack;
class parent
{
	int i=7;
	int add()
	{
		System.out.println(i);
		return i;
	}
}
public class DefauCla {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent obj=new parent();
		System.out.println(obj.i);
		obj.add();
		}

}
