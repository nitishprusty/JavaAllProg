package Question4;

abstract class Processor {
	
	public int data;
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	abstract void process();
	
	void showdata() {
		System.out.println("Data : " + data);
	}

}
