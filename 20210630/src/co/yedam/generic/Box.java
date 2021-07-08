package co.yedam.generic;

public class Box<T> {
	private T obj; // 모든 유형의 클래스

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}
