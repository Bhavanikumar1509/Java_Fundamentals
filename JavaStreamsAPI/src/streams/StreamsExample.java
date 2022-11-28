package streams;
import java.lang.module.ModuleDescriptor.Builder;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamsExample {
	public static void main(String[] args) {
		//Empty Stream
		Stream<String> stream=Stream.empty();
	//Printing the empty stream
		stream.forEach(element->{
			System.out.println(element);
		});
		System.out.println("____Strings_______");
		//creating stream with string elements
		Stream<String>stringStream=Stream.of("Nani","lucky");
		//printing the stream elements
		stringStream.forEach(element->{
			System.out.println(element);
		});
		System.out.println("____Integers_______");
		Stream<Integer>intStream=Stream.of(11,13,15,17);
		//printing the stream elements
		intStream.forEach(element->{
			System.out.println(element);
		});
		System.out.println("____array_______");
		Stream<Integer>arrayStream=Stream.of(new Integer[] {10,11,12,13,14});
		//printing the stream elements
		arrayStream.forEach(element->{
			System.out.println(element);
		});
		
		System.out.println("_____array______");
		Integer[] numberArray=new Integer[] {10,20,30,40,50};
		Stream<Integer>arrayStream1=Stream.of(numberArray);
		//printing the stream elements
		arrayStream1.forEach(element->{
			System.out.println(element);
		});
		System.out.println("_____arraylist______");
		//collections arraylist
		List<Integer>integrList=new ArrayList<>();
		integrList.add(100);
		integrList.add(200);
		integrList.add(300);
		integrList.add(400);
		Stream<Integer>collectionStream=integrList.stream();
		//printing the stream elements
		collectionStream.forEach(element->{
			System.out.println(element);
		});
		System.out.println("______string builder_______");
		//create string builder using stream
		Stream<String>builderStream=Stream.<String>builder().add("nani").add("Lucky").build();
		//printing
		builderStream.forEach(element->{
			System.out.println(element);
		});
		System.out.println("________Exclusive Range______");
		
		//Range
		IntStream rangeStream=IntStream.range(3,6);
		rangeStream.forEach(element->{
			System.out.println(element);
		});
		
	}

}
