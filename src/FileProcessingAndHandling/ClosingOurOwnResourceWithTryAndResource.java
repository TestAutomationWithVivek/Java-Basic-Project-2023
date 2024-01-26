package FileProcessingAndHandling;

class ResourceClass implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing the resource file");
	}
	
}

public class ClosingOurOwnResourceWithTryAndResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(ResourceClass resourceClass = new ResourceClass();){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
