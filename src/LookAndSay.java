

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LookAndSay {

		public static String nextLook(String previousLook) {
			int count = 1;
			StringBuilder res = new StringBuilder();
			try {
				if(previousLook.length() > 1) {
			        for( int i = 1; i<previousLook.length(); i++) {
				        	if(previousLook.charAt(i) == previousLook.charAt(i-1))
				        		count++;	
				        	else{
				        		res = res.append(Integer.toString(count) + String.valueOf(previousLook.charAt(i-1)));
				        		count = 1;
				            }
				        	if(i == previousLook.length()-1)
			        			res.append(Integer.toString(count) + String.valueOf(previousLook.charAt(previousLook.length()-1)));	
			        }   
			    }
				else 
		          res.append(Integer.toString(1) + String.valueOf(previousLook.charAt(previousLook.length()-1)));
		   }
		   catch(StringIndexOutOfBoundsException s) {
        		System.out.println(s.getMessage());
           }
		   return res.toString();   
		}
		
		public static String getNLookSequence(int n)
		{
			List<String>  sequence = Stream.of("1")
		            .collect(Collectors.toCollection(ArrayList::new));
			
			for(int i = 1; i < n; i++)
			   sequence.add(nextLook(sequence.get(i-1)));
			
		    return String.join(", ", sequence);
		    
		    
		}
		
		
}
