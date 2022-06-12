package clases;

/**
 * Superclase para los nombres
 * @author raul203al
 *
 */
public abstract class ElementWName {

	String name;

	public ElementWName(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + name;
	}

}
