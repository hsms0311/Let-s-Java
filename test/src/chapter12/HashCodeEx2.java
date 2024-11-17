package chapter12;

public class HashCodeEx2 {

	public static void main(String[] args) {
		Hash h1 = new Hash(20);
		Hash h2 = new Hash(20);
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println("h1 객체 진짜 해시 값 : "
							+ System.identityHashCode(h1));
		System.out.println("h2 객체 진짜 해시 값 : "
							+ System.identityHashCode(h2));
	}

}

class Hash {
	int value;
	Hash(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Hash) {
			Hash h = (Hash)obj;
			return value == h.value;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return value;
	}
}