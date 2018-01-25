public class Launcher {
	
	/**
	 * starts the tool
	 * @param args = command line parameters, means your file and your aim 
	 */
	public static void main(String[] args) {
			
			if(args.length != 2) {
				System.err.println("Usage: java sortmypic imagePath.xxx imgDestinyPath.xxx");
				System.exit(1);
			}
			
			Start s = new Start(args);
			s.work();
	}
}
