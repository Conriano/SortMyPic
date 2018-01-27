public class Launcher {
	
	/**
	 * starts the tool
	 * @param args = command line parameters, means your file and your aim 
	 */
	public static void main(String[] args) {
			long time1 = System.currentTimeMillis();
		
			if(args.length != 2) {
				System.err.println("Usage: java sortmypic imagePath.xxx imgDestinyPath.xxx");
				System.exit(1);
			}
			
			Start s = new Start(args);
			s.work();
			
			long time2 = System.currentTimeMillis() -time1;
			
			System.out.println("Time needed: " + time2 + " ms");
	}
}
