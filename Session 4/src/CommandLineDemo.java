
public class CommandLineDemo {
	public static void main(String[] commandLineArguments) {
		System.out.println("Number of Paramenters are "+commandLineArguments.length);
		
		for(String param:commandLineArguments){
			System.out.println(param);
		}
		System.out.println("-------------------");
		for(int i=0;i<commandLineArguments.length;i++)
			System.out.println(commandLineArguments[i]);
	}
}
