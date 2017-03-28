class ArrayCopyOfDemo {
    public static void main(String[] args){
	char[] copyFrom = {'a', 'b', 'c', 'd'};

	char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 0, 4);


	System.out.println(new String(copyTo));
    }
}
