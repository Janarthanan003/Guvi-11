package oopsconcept;

	abstract class Tea {
		  abstract void prepareTea();
		}
		class GreenTea extends Tea {
		  void prepareTea() {
		    System.out.println("Brewing Green Tea for 3 minutes");
		  }
		}
		class BlackTea extends Tea {	  
		  void prepareTea() {
		    System.out.println("Brewing Black Tea for 5 minutes");
		  }
		}
		class HerbalTea extends Tea {
		  void prepareTea() {
		    System.out.println("Brewing Herbal Tea for 7 minutes");
		  }
		}
		public class TypesOfTea {
		  public static void main(String[] args) {
		    GreenTea greenTea = new GreenTea();
		    BlackTea blackTea = new BlackTea();
		    HerbalTea herbalTea = new HerbalTea();
		    greenTea.prepareTea();
		    blackTea.prepareTea();
		    herbalTea.prepareTea();
		  }
		}