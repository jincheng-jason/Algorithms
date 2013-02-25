class ArrayBub{
		private long[] a;  //ref to array a
		private int nElems;		//number of data items
		
		public ArrayBub(int max){
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
			
		public void bubbleSort(){
				int out,in;
				
				for(out = nElems-1 ; out>1; out--){	//outter loop (backward)
					for (in=0; in<out ; in++ ) {		//inner loop (forward)
						if( a[in] > a[in+1]){			//out of order?
							swap(in,in+1);				//swap them
						}
						System.out.print("1: ");
						display();
						if ( in>0 && a[in]<a[in-1]) {
							swap(in,in-1);
						}
						System.out.print("2: ");
						display();
						
					}
					
				
				}
		}

		public void swap(int one, int two){
			long temp = a[one];
			a[one] = a[two];
			a[two] = temp;
		}
	}

	class BubbleSortApp{
		public static void main(String[] args){
			int maxSize = 100;
			ArrayBub arr;
			arr = new ArrayBub(maxSize);

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

			arr.bubbleSort();
			arr.display();
		}
	}