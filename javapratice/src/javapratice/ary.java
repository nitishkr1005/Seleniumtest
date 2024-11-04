package javapratice;

public class ary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean found = false;
		int [] subject = {20,33,22,44,88,99,44};
		for(int i = 0;i<subject.length;i++) {
		if (subject[i]==78) {
			found=true;
			break;
			}
		}
		if(found) {
			System.out.print("True");
		}else {
			System.out.print("Falseaaa");
		}
	}
	}
