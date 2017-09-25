package ar.edu.unlam.pb2.Disco;

public class Disco {
	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie;

	public Disco(Double radioInterior, Double radioExterior) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}

	public Double getPerimetroInterior() {
		perimetroInterior = 2 * 3.141592 * radioInterior;
		return perimetroInterior;
	}

	public Double getPerimetroExterior() {
		perimetroExterior = 2 * 3.141592 * radioExterior;
		return perimetroExterior;
	}

	public Double getSuperficie() {
		Double radioTotal = radioInterior + radioExterior;
		superficie = 3.141592 * radioTotal * radioTotal;
		return superficie;
	}
}

