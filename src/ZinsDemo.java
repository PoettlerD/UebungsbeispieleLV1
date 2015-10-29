
public class ZinsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Kontostand = 1429;
		float Zinssatz = 2.25f;
		System.out.println("Bei einem Kontostand von "+Kontostand+"€");
		System.out.println("und einem Zinssatz von "+Zinssatz+"%");
		System.out.println("betragen die Zinsen "+Zinsen(Kontostand,Zinssatz)+"€");
	}

public static float Zinsen(int Kontostand,float Zinssatz){
float zinsen = (Kontostand*Zinssatz)/100;
return zinsen;
}
}
