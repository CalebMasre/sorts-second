public class Main<T extends Comparable<T>> {

	public static void main(String[] args) {
		MergeSort<Integer> ms = new MergeSort<>();
		HeapSort<Integer> hs = new HeapSort<>();
		QuickSort<Integer> qs = new QuickSort<>();
		ShellSort<Integer> ss = new ShellSort<>();

		System.out.println("MERGE SORT");
		Integer[] msArray = { 5, 4, 3, 2, 1 };
		System.out.println("Array before sorting");
		print(msArray);
		ms.mergeSort(msArray);
		System.out.println("Array after sorting");
		print(msArray);
		verify(msArray);

		System.out.println("HEAP SORT");
		Integer[] hsArray = { 81,1,2,3,4,5,6,7,8,9,0};;
		System.out.println("Array before sorting");
		print(hsArray);
		hs.sort(hsArray);
		System.out.println("Array after sorting");
		print(hsArray);
		verify(hsArray);
		 
				
		System.out.println("QUICK SORT");
		Integer[] qsArray = { 5, 4, 3, 2, 1 };
		System.out.println("Array before sorting");
		print(qsArray);
		qs.quickSort(qsArray);
		System.out.println("Array after sorting");
		print(qsArray);
		verify(qsArray);

		System.out.println("SHELL SORT");
		Integer[] ssArray = { 5, 4, 3, 2, 1 };
		System.out.println("Array before sorting");
		print(ssArray);
		ss.sort(ssArray);
		System.out.println("Array after sorting");
		print(ssArray);
		verify(ssArray);
	}

	public static <T> void print(T arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	@SuppressWarnings("unchecked")
	public static <T> void verify(T arr[]) {

		int count = 0;
		while (count < arr.length - 1) {
			T obj = arr[count];
			if (((Comparable<T>) arr[count]).compareTo(arr[count + 1]) > 0) {
				System.out.println("NOT SORTED");
				return;
			}
			count++;
		}

		System.out.println("SORTED");

	}

}