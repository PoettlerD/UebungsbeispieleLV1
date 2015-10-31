
public class Metropolis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean captial = true;
		int Einwohner = 1_800_000;
		double SteuerProKopfundMonat = 50;
		System.out.println("Eine Hauptstadt " + captial + " und Einwohner " + Einwohner + " und SteuerProopf/monat ="
				+ SteuerProKopfundMonat + " ist Metropole " + isMetropolis(captial, Einwohner, SteuerProKopfundMonat));
		System.out.println("Eine Hauptstadt " + captial + " und Einwohner " + Einwohner + " und SteuerProopf/monat ="
				+ SteuerProKopfundMonat + " ist Metropole " + isMetropolis2(captial, Einwohner, SteuerProKopfundMonat));

		captial = true;
		Einwohner = 1_800;
		SteuerProKopfundMonat = 50;
		System.out.println("Eine Hauptstadt " + captial + " und Einwohner " + Einwohner + " und SteuerProopf/monat ="
				+ SteuerProKopfundMonat + " ist Metropole " + isMetropolis(captial, Einwohner, SteuerProKopfundMonat));
		System.out.println("Eine Hauptstadt " + captial + " und Einwohner " + Einwohner + " und SteuerProopf/monat ="
				+ SteuerProKopfundMonat + " ist Metropole " + isMetropolis2(captial, Einwohner, SteuerProKopfundMonat));

		captial = false;
		Einwohner = 500_000;
		SteuerProKopfundMonat = 100;
		System.out.println("Eine Hauptstadt " + captial + " und Einwohner " + Einwohner + " und SteuerProopf/monat ="
				+ SteuerProKopfundMonat + " ist Metropole " + isMetropolis(captial, Einwohner, SteuerProKopfundMonat));
		System.out.println("Eine Hauptstadt " + captial + " und Einwohner " + Einwohner + " und SteuerProopf/monat ="
				+ SteuerProKopfundMonat + " ist Metropole " + isMetropolis2(captial, Einwohner, SteuerProKopfundMonat));

	}

	public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {

		return (isCapital && inhabitants > 100_000)
				|| (inhabitants > 200_000 && (taxPerPersonAndMonth * 12.0 * inhabitants >= 720_000_000));

	}

	public static boolean isMetropolis2(boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {
		boolean resultA = isCapital && inhabitants > 100_000;

		double totalTaxes = inhabitants * taxPerPersonAndMonth * 12;
		boolean resultB = inhabitants > 200_000 && totalTaxes > 720_000_000;

		return resultA || resultB;
	}

}
