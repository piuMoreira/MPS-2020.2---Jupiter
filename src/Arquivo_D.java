public class Arquivo_D {
	private String message;

	public Arquivo_D() {
		this.message = "Este é o arquivo D";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

class RelatedClass {
	private Arquivo_D related;

	public Arquivo_D getRelated() {
		return related;
	}

	public void setRelated(Arquivo_D related) {
		this.related = related;
	}
	
}