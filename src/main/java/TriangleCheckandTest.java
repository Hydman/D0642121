package q1;

public class TriangleCheckandTest {
	public static void main(String[] args) {
//      do nothing
	}
	public void checkTriangle(int a, int b, int c) {
		try {
		this.checkTriangleSize(a, b, c);
		}catch(Exception e) {
			System.out.println(e);
			// System.out.println(e.getMessage());
			System.exit(1);
		}
		if(a == b && a == c) {
			System.out.println("���T����");
		}
		else if(((a*a)+(b*b))-(c*c)==0 || ((a*a)+(c*c))-(b*b)==0
		|| ((b*b)+(c*c))-(a*a)==0) {
			System.out.println("�����T����");
		}
		else if(a == b || a == c || b == c) {
			System.out.println("���y�T����");
		}
		else {
			System.out.println("���q�T����");
		}
	}
	public void checkTriangleSize(int a, int b, int c)throws Exception{
		if(a+b <= c || a+c <= b|| b+c<=a || a<0 || b<0 || c<0) {
			throw new Exception("����Φ��T����");
		}
	}
}