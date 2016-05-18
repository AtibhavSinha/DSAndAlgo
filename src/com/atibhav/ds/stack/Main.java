package com.atibhav.ds.stack;

public class Main {

	public static void main(String[] args) {

//		StackOfStringArrayImpl stackOfStringArrayImpl = new StackOfStringArrayImpl(2);
//		System.out.println("Pop an element:" + stackOfStringArrayImpl.pop());
//		
//		stackOfStringArrayImpl.push("atibhav");
//		System.out.println("Is empty:" + stackOfStringArrayImpl.isEmpty());
//		stackOfStringArrayImpl.push("test");
//		stackOfStringArrayImpl.push("sinha");
//		
//		System.out.println("Pop an element:" + stackOfStringArrayImpl.pop());
//		System.out.println("Pop an element:" + stackOfStringArrayImpl.pop());
//		System.out.println("Pop an element:" + stackOfStringArrayImpl.pop());
//		System.out.println("Is empty:" + stackOfStringArrayImpl.isEmpty());
		
//		
//		ResizingArrayImpl resizingArrayImpl = new ResizingArrayImpl();
//	//	System.out.println("Pop an element:" + resizingArrayImpl.pop());
//		
//		resizingArrayImpl.push("atibhav");
//		System.out.println(resizingArrayImpl.toString());
//		resizingArrayImpl.push("test");
//		System.out.println(resizingArrayImpl.toString());
//		resizingArrayImpl.push("sinha");
//		System.out.println(resizingArrayImpl.toString());
//		resizingArrayImpl.push("KK");
//		System.out.println(resizingArrayImpl.toString());
//		resizingArrayImpl.push("atibhav");
//		resizingArrayImpl.push("atibhav");
//		resizingArrayImpl.push("atibhav");
//		
//		System.out.println("Pop an element:" + resizingArrayImpl.pop());
//		System.out.println(resizingArrayImpl.toString());
//		System.out.println("Pop an element:" + resizingArrayImpl.pop());
//		System.out.println(resizingArrayImpl.toString());
//		System.out.println("Pop an element:" + resizingArrayImpl.pop());
//		System.out.println(resizingArrayImpl.toString());
//		//System.out.println("Is empty:" + resizingArrayImpl.isEmpty());
		
		GenericStack<Book> stackOfBooks = new GenericStack<>();
		Book book1 = new Book("Atibhav","I will win");
		Book book2 = new Book("Atibhav","I will persist until I succeed.");
		
		stackOfBooks.push(book1);
		stackOfBooks.push(book2);
		
		for (Book book : stackOfBooks) {
			System.out.println("Book in the stack: "+book);
		}
		
		DijikstraAlgo dijikstraAlgo = new DijikstraAlgo();
		String expression = "(1 + ( ( 2 + 3) * (4 * 5) ) )";
		int expressionResult = dijikstraAlgo.evaluateExpression(expression);
		 
		System.out.println("Result ="+ expressionResult);
	}

}
