import org.graalvm.polyglot.*; 

public class HelloGraalVM {

  public static void main(String[] args) {
    Context polyglot = Context.create();
    
    Value array = polyglot.eval("js","['Hello', 'GraalVM', new Date()]");
    
    String message = array.getArrayElement(0).asString()   
         + " " + array.getArrayElement(1).asString()
         + " " + array.getArrayElement(2).asDate(); 
    
    System.out.println(message);
  }
}  
