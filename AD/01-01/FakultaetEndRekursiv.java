public class FakultaetEndRekursiv {

	public static void main(String[] args) {
		
		int erg = fakultaetEndRekursiv(4,1);
		System.out.println("Erg.: "+erg);
	}
	
	private static int fakultaetEndRekursiv(int x, int y){
		
		if(x==1){
			
			return y;
		}else{
			
			return fakultaetEndRekursiv(x-1, y*x);
		}
		
		
	}

}

