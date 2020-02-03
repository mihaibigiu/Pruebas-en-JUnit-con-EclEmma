package examen;




public class Subscription {
	 
	private int precio ; 
	 // precio total de la subscripci�n euro-cent     
	 private int periodo ; 
	 // periodo de subscripcion en meses
	  /**     
	   * El constructor para crear una subscripci�n.    
	   */   

	public Subscription(int p, int n) {       
			 precio = p ;        
			 periodo = n ;     } 
	 
	
	   /**       
	    *  Calcula el precio de la subscripci�n mensual en euros,        
	    *  redonde�ndolo por arriba al c�ntimo m�s cercano.       
	    */       

	public void cancel() {             
			 periodo = 0 ;           
			 } 
		 
	public double precioPorMes() {
		if (periodo<=0 || precio<=0) 
			 return 0 ;          
		 double r = (double) precio / (double) periodo ;          
		 double resto = r%1;                   
		 if (resto > 0)  
			 return (int)r+1;             
		 else   
			 return r;        
		 }      

     /**           
      * Este m�todo cancela la subscripci�n.          
      */    
	  
}