package _03_Intro_to_Enums;

enum StatesOfMatter {
SOLID(0), LIQUID(25.55), GAS(100);

int celsiusTemp;

public void setValue(int celsiusTemp) {
	this.celsiusTemp = celsiusTemp;
}



public int getTemp(int celsuisTemp) {
	this.celsiusTemp = celsuisTemp;
	
	
	
}

public int convertToFahrenheit(int celsiusTemp){
	return (celsiusTemp *9/5) +32;
}

}