package _03_Intro_to_Enums;

enum StatesOfMatter {
SOLID, LIQUID, GAS;


private double celsiusTemp;

public void setTemp(double celsiusTemp) {
	this.celsiusTemp = celsiusTemp;
}

public double getCelsiusTemp() {
	return celsiusTemp;

}

public double convertToFahrenheit(double celsiusTemp){
	return (celsiusTemp *9/5) +32;
}

}