class ArraySel{
	private long[] a;  //ref to array a
	private int nElems;		//number of data items

	public ArraySel(int max){
		a = new long[max];
		nElems = 0;
	}

	public void  insert(long value){
			a[nElems] = value;		//insert it
			nElems++;			//increment size
	}
		
	public void display(){
			for(int j=0; j<nElems; j++ ) 		//for each element
					System.out.print(a[j] + " ");
			System.out.println(" ");
			
	}

	public void selectSort(){
		int out,in,min;
		for ( out=0; out<nElems-1 ; out++ ) {
			min = out;
			for ( in=out+1; in<nElems ; in++) {
				if(a[in]<a[min])
					min = in;
				
			swap(out,min);
			}
		}
	}
	public void swap(int one, int two){
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}

class selectSort{
	public static void main(String[] args){
			int maxSize = 100;
			ArraySel arr;
			arr = new ArraySel(maxSize);

			arr.insert(77);
			arr.insert(99);
			arr.insert(44);
			arr.insert(55);
			arr.insert(22);
			arr.insert(88);
			arr.insert(11);
			arr.insert(00);
			arr.insert(66);
			arr.insert(33);
			
			arr.display();

			arr.selectSort();
			arr.display();
		}
}