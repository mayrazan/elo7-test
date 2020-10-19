 
public enum Movimento {
    LEFT("L"), RIGTH("R"), MOVE("M");
  
	private final String movimento;

  	private Movimento(String movimento) {
    	this.movimento = movimento;
  	}

	public String getMovimento() {
		return this.movimento;
	}

  	public String toString(){
    	return movimento;
  	}
}