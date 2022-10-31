public class Heap {
	private int[] Heap;
	private int size;
	private int maxsize;

	public Heap(int maxsize){
		this.maxsize = maxsize;
		this.size = 0;
		Heap = new int[this.maxsize];
	}

	private int parent(int pos){
        return (pos - 1) / 2; 
    }

	private int leftChild(int pos){ 
        return (2 * pos) + 1; 
    }

	private int rightChild(int pos){ 
        return (2 * pos) + 2; 
    }

	
	private void swap(int fpos, int spos){
		int tmp;
		tmp = Heap[fpos];
		Heap[fpos] = Heap[spos];
		Heap[spos] = tmp;
	}

	public void insert(int element){
		Heap[size] = element;

		int current = size;
		while (Heap[current] > Heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
		size++;
	}

	public void print(){
	for(int i=0;i<size/2;i++){
		System.out.print("Parent Node : " + Heap[i] );
			
		if(leftChild(i)<size) 
		System.out.print( " Left Child Node: " + Heap[leftChild(i)]);
			
		if(rightChild(i)<size) 
		System.out.print(" Right Child Node: "+ Heap[rightChild(i)]);
			
		System.out.println();
    }
}
}


