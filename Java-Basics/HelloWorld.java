class HelloWorld {
	private String helloWorld;

	public String getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}
}

class MainClass {
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setHelloWorld("Hello World, ");
		System.out.println(helloWorld.getHelloWorld() + " Sooriya");
	}
	
}

