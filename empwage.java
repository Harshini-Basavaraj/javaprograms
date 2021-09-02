 public class empwage {

	public static void main(String[] args) {
       	 int IS_FULL_TIME = 1;
         double empcheck = Math.floor(Math.random() * 10) % 2;
         if (empcheck == IS_FULL_TIME)
            System.out.println("Emp is present");
         else
     	    System.out.println("Emp is absent");
	    System.out.println("Hi employee");
	}
}
