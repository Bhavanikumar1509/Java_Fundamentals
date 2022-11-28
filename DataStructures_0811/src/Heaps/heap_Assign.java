package Heaps;

import java.util.Arrays;

class Heap {
	// 2i+1 for left node of i node
	// 2i+2 for right node of i node
	// (i-1)/2 for parent of i node

	private int[] items = new int[10];
	private int size = 0;

	public void insert(int val) {
		if (size == items.length)
			throw new IllegalStateException();
		if (size <= 0)
			items[size++] = val;
		else {
			items[size++] = val;
			bubbleUp();
		}
	}

	public void bubbleUp() {
		int index = size;
		while (size > 0 && items[index] > items[parent(size)]) {
			swap(index, parent(index));
			index = parent(index);
		}
	}

	public void swap(int first, int second) {
		int temp = items[first];
		items[first] = items[second];
		items[second] = temp;
	}

	public int parent(int index) {
		return (index - 1) / 2;
	}

	public void heapify(int index) {
		if (index <= 0) {
			return;
		}
		if (items[index] > items[parent(index)]) {
			swap(index, parent(index));
		}
		heapify(--index);
	}

	// Delete a element
	public void delete(int val) {
		if (size == 0)
			throw new IllegalStateException();

		int i = 0;
		while (items[i] != val) {
			i++;
		}
		swap(i, size - 1);
		items[size - 1] = 0;
		size--;
		heapify(size - 1);
		while (!isMaxHeap())
			heapify(size - 1);
	}

	public boolean isMaxHeap() {
		for (int index = size - 1; index >= 0; index--) {
			if (items[index] > items[parent(index)]) {
				return false;
			}
		}
		return true;
	}

	// Heap Sort
	public void heapSort() {
		int sortedItems[] = new int[size];
		int temp = size;
		int[] unsortedItems = items;
		int i = 0;
		while (size > 0) {
			sortedItems[i] = items[0];
			delete(items[0]);
			i++;
		}

		items = unsortedItems;
		size = temp;

		for (int num : sortedItems) {
			System.out.print(num + " ");
		}
	}

	public void traverse() {
		for (int i = 0; i < size; i++) {
			System.out.print(items[i] + " ");
		}
	}
//Kth Largest Element
	public void kthLargestElement(int pos) {
		int[] sortedElements = items;
		Arrays.sort(sortedElements);
		if (pos > size) {
			throw new IllegalStateException();
		}
		System.out.println(sortedElements[sortedElements.length - pos]);
	}
}

public class heap_Assign {
	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.insert(9);
		heap.insert(8);
		heap.insert(6);
		heap.insert(5);
		heap.insert(2);
		heap.insert(1);
		heap.insert(3);
//		heap.delete(9);
//		heap.delete(8);
		System.out.println("____Heap ____");
		heap.traverse();
		// System.out.println(heap.isMaxHeap());
		System.out.println("\n___Kth Largest Element___");
		heap.kthLargestElement(3);
	}
}