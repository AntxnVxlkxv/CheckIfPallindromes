import java.util.*;

public class Main {

	public static void main(String[] args) {
		int exp = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello and welcome");
		System.out.println("Please choose between these figures");
		System.out.println(
				"1 - square; 2 - rectangle; 3 - triangle; 4 - rectangular triangle; 5 - circle; 6 - parallelogram; 7 - trapezoid;");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("What do you want to calculate? 1 - S; 2 - P");
			int choiceSquare = sc.nextInt();

			// Square
			switch (choiceSquare) {
			case 1:
				try {
					System.out.println("Type in A: ");
					double aSquare = sc.nextDouble();
					System.out.println("The area of square is: " + Math.pow(aSquare, exp));
				} catch (Exception e) {
					System.err.println("an error has occured ");
				}
				break;
			case 2:
				try {
					System.out.println("Type in A: ");
					double a1Square = sc.nextDouble();
					System.out.println("The perimeter is " + 4 * a1Square);
				} catch (Exception e) {
					System.err.println("an error has occured ");
				}
				break;
			}
			// Rectangular
		case 2:

			System.out.println("What do you want to calculate? 1 - S; 2 - P");
			int choiceRectangular = sc.nextInt();

			switch (choiceRectangular) {
			case 1:
				try {
					System.out.println("Type in A: ");
					double aRectangular = sc.nextDouble();
					System.out.println("Type in B: ");
					double bRectangular = sc.nextDouble();
					System.out.println("The area is: " + aRectangular * bRectangular);
				} catch (Exception e) {
					System.err.println("an error has occured");
				}
				break;
			case 2:
				try {
					System.out.println("Type in A: ");
					double a1Rectangular = sc.nextDouble();
					System.out.println("Type in B: ");
					double b1Rectangular = sc.nextDouble();
					System.out.println("The perimeter is: " + (a1Rectangular + b1Rectangular) * 2);
				} catch (Exception e) {
					System.err.println("an error has occured");
				}
				break;
			}
			// triangle
		case 3:
			System.out.println("What do you want to calculate? 1 - S; 2 - P; 3 - height");
			int choiceTriangle = sc.nextInt();

			switch (choiceTriangle) {
			case 1:
				try {
					System.out.println("Type in A: ");
					double aTriangle = sc.nextDouble();
					System.out.println("Type in Height on A: ");
					double Va = sc.nextDouble();
					System.out.println("The area is: " + (aTriangle * Va) / 2);
				} catch (Exception e) {
					System.err.println("an error has occured");
				}
				break;
			case 2:
				try {
					System.out.println("Type in A: ");
					double aTriangle = sc.nextDouble();
					System.out.println("Type in B: ");
					double bTriangle = sc.nextDouble();
					System.out.println("Type in C: ");
					double cTriangle = sc.nextDouble();
					System.out.println("The perimeter is: " + aTriangle + bTriangle + cTriangle);
				} catch (Exception e) {
					System.err.println("an error has occured");
				}
				break;
			case 3:
				try {
					System.out.println("Do you have b(1) or c(2)");
					int bc = sc.nextInt();
					switch (bc) {
					case 1:
						try {
							System.out.println("Type in B: ");
							double bTriangle = sc.nextDouble();
							System.out.println("Type in Gamma: ");
							double gamma = sc.nextDouble();
							gamma = Math.toRadians(gamma);
							System.out.println("Height is: " + bTriangle * Math.sin(gamma));
						} catch (Exception e) {
							System.err.println("an error has occured");
						}
					case 2:
						try {
							System.out.println("Type in C: ");
							double cTriangle = sc.nextDouble();
							System.out.println("Type in Beta: ");
							double Beta = sc.nextDouble();
							Beta = Math.toRadians(Beta);
							System.out.println("Height is: " + cTriangle * Math.sin(Beta));
						} catch (Exception e) {
							System.err.println("an error has occured");
						}
					}
				} catch (Exception e) {
					System.err.println("an error has occured");
				}
				break;
			}
			// Rectangular triangle
		case 4:
			System.out.println("What do you want to calculate? 1 - S; 2 - P; 3 - side");
			int choiceRTriangle = sc.nextInt();
			switch (choiceRTriangle) {
			case 1:
				try {
					System.out.println("Type in A: ");
					double aRTriangle = sc.nextDouble();
					System.out.println("Type in B: ");
					double bRTriangle = sc.nextDouble();
					System.out.println("Area is: " + (aRTriangle * bRTriangle) / 2);
				} catch (Exception e) {
					System.err.println("an error has occured");
				}
			case 2:
				try {
					System.out.println("Type in A: ");
					double aRTriangle = sc.nextDouble();
					System.out.println("Type in B: ");
					double bRTriangle = sc.nextDouble();
					System.out.println("Type in C: ");
					double cRTriangle = sc.nextDouble();
					System.out.println("The perimeter is: " + aRTriangle + bRTriangle + cRTriangle);
				} catch (Exception e) {
					System.err.println("an error has occured");
				}
			case 3:
				// c2=a2+b2
				System.out.println("Which side do you want to find? 1 - a; 2 - b; 3 - c");
				int choicePyth = sc.nextInt();
				switch (choicePyth) {
				case 1:
					try {
						System.out.println("Type in b: ");
						double b = sc.nextDouble();
						System.out.println("Type in c: ");
						double c = sc.nextDouble();
						double a2 = Math.pow(c, exp) - Math.pow(b, exp);
						a2 = Math.sqrt(a2);
						System.out.println(a2);
					} catch (Exception e) {
						System.err.println("an error has occured");
					}
				case 2:
					try {
						System.out.println("Type in a: ");
						double a = sc.nextDouble();
						System.out.println("Type in c: ");
						double c = sc.nextDouble();
						double b2 = Math.pow(c, exp) - Math.pow(a, exp);
						b2 = Math.sqrt(b2);
						System.out.println(b2);
					} catch (Exception e) {
						System.err.println("an error has occured");
					}
				case 3:
					try {
						System.out.println("Type in b: ");
						double b = sc.nextDouble();
						System.out.println("Type in a: ");
						double a = sc.nextDouble();
						double c2 = Math.pow(a, exp) + Math.pow(b, exp);
						c2 = Math.sqrt(c2);
						System.out.println(c2);
					} catch (Exception e) {
						System.err.println("an error has occured");
					}
				}

			}// circle
		case 5:
			System.out.println("What do you want to calculate? 1 - S; 2 - o");
			int choiceCircle = sc.nextInt();
			switch (choiceCircle) {
			case 1:
				System.out.println("Do you wish to proceed with r or d? 1 - r; 2 - d ");
				int choicein = sc.nextInt();
				switch (choicein) {
				case 1:
					try {
					System.out.println("Type in r: ");
					double r = sc.nextDouble();
					System.out.println("The area is: " + Math.PI * Math.pow(r, exp));
				}catch(Exception e ) {
					System.err.println("An error has occured");
				}
				case 2:
					try {
					System.out.println("Type in d: ");
					double d = sc.nextDouble();
					System.out.println("The area is: " + (Math.PI * Math.pow(d, exp) / 4));
				}catch(Exception e ) {
					System.err.println("An error has occured");
				}
				}
			case 2: 
				System.out.println("Do you wish to proceed with r or d? 1 - r; 2 - d ");
				int choicein2 = sc.nextInt();
				switch(choicein2) {
				case 1:
					try {
					System.out.println("Type in r: ");
					double r = sc.nextDouble();
					System.out.println("Circumference is: " + exp*Math.PI*r);
					}catch(Exception e ) {
						System.err.println("An error has occured");
					}
				case 2:
					try {
					System.out.println("Type in d: ");
					double d = sc.nextDouble();
					System.out.println("Circumference is: " + Math.PI*d);
				}catch(Exception e ) {
					System.err.println("An error has occured");
				}
				}
				//parallelogram
			case 6:
				System.out.println("What do you want to calculate? 1 - S; 2 - o; 3 - height");
				int choiceParallelogram = sc.nextInt();
				switch(choiceParallelogram) {
				case 1:
					System.out.println("What do you have? 1 - a and height a; 2 - b and height b");
					int choiceWithin = sc.nextInt();
					switch(choiceWithin) {
					case 1: 
						try {
						System.out.println("Type in A: ");
						double aPar = sc.nextDouble();
						System.out.println("Type in height a: ");
						double heightA = sc.nextDouble();
						System.out.println("The area is: " + aPar*heightA);
						}catch(Exception e ) {
							System.err.println("an error has occured");
						}
						case 2:
							try {
						System.out.println("Type in B: ");
						double bPar = sc.nextDouble();
						System.out.println("Type in height b: ");
						double heightB = sc.nextDouble();
						System.out.println("The area is: " + bPar*heightB);
							}catch(Exception e ) {
								System.err.println("an error has occured");
							}
							}
				case 2: try {
					System.out.println("Type in A: ");
					double aPara = sc.nextDouble();
					System.out.println("Type in B: ");
					double bPara = sc.nextDouble();
					System.out.println("The Circumference is: " + exp*(aPara+bPara));
				}catch(Exception e) { 
					System.err.println("An error has occured ");
				}
				case 3: 
					System.out.println("Which height? 1 - Va; 2 - Vb");
					int choiceHeight = sc.nextInt();
					switch(choiceHeight) {
					case 1:
						try {
						System.out.println("Type in B: ");
						double b = sc.nextDouble();
						System.out.println("Type in Alfa: ");
						double Alfa = sc.nextDouble();
						Alfa = Math.toDegrees(Alfa);
						System.out.println("Height is: "+ b*Math.sin(Alfa));
						}catch(Exception e) { 
							System.err.println("an error has occured");
						}
						case 2:
							try {
						
						System.out.println("Type in A: ");
						double a = sc.nextDouble();
						System.out.println("Type in Beta: ");
						double Beta = sc.nextDouble();
						Beta = Math.toDegrees(Beta);
						System.out.println("Height is: "+ a*Math.sin(Beta));
							}catch(Exception e) {
								System.err.println("an error has occured");
							}
							}
					//trapezoid
				case 7:
					System.out.println("What do you want to calculate? 1 - S; 2 - o; 3 - height");
					int choiceTrapezoid = sc.nextInt();
					switch(choiceTrapezoid) {
					case 1:
						System.out.println();
					}
				}
			}
		}

	}
}
