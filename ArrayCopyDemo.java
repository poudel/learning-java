class ArrayCopyDemo {
    public static void main(String[] args){
	char[] copyFrom = {'e', 'f', 'g', 'h'};
	char[] copyTo = new char[8];
	copyTo[0] = 'a';
	copyTo[1] = 'b';
	copyTo[2] = 'c';
	copyTo[3] = 'd';

	System.arraycopy(copyFrom, 0, copyTo, 4, 4);

	System.out.println(new String(copyTo));
    }
}
