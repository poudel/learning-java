class MultiDimensionalArrayDemo {
    public static void main(String[] args){
	String[][] names = {
	    {"Mr. ", "Mrs. ", "Ms. "},
	    {"Smith", "Joes"}
	};

	int mainCounter = 0;

	for (String[] innerArr : names){
	    mainCounter++;

	    System.out.println("Iteration: " + mainCounter);

	    int count = 0;

	    while (count < innerArr.length){
		System.out.println("  " + innerArr[count]);
		count++;
	    }
	} 

    }
}
