This is a short tool to sort the values of the pixels from an image.
It will create a new image with the sorted pixels.


You can use the test.jpg and test2.jpg in src/ to give it a try :-)


USAGE:

First method: No Jar-File
1) Open your command line and change to src/
2) Compile the tool: javac *.java 
3) Execute: java -cp . Launcher yourPicture.xxx yourDestiny.xxx

This method gives information about the count of different colours 


Second method: Eclipse and Runnable Jar-File
1) Open Eclipse and export as runnable Jar-File (could name it "sortmypic.jar")
2) Open your command line and change to the directory with the new sortmypic.jar
3) Ececute: java -jar sortmypic.jar yourPicture.xxx yourDestiny.xxx

This method does not give the information about the count (first method)