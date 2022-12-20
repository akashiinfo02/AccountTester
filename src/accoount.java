
public class accoount {

	int accno;
	String name ;
	float amount;
	
	void insert( int a , String nam , float amt) {
		
		this.accno = a;
		this.name = nam;
		this.amount = amt;
		System.out.println(  " account no " + accno + " name is  " + name +" amount is " + amount );
	}
	
	void deposit ( float amt ) {
		
		amount = amount + amt;
		System.out.println( " the deposit is " + amount);
	}
	
	void withdraw (float amt ) {
		
		if ( amount < amt ) {
			System.out.println( " insuffucient balance ");
		}
		else {
			
			amount = amount - amt;
			System.out.println( " debited " + amount);
		}
		
	}
	
	void checkbalance () {
		System.out.println( "  final balance is " + amount);
	}
	
	void display () {
		System.out.println( " acc no " + accno +" " + name +" " + amount);
	}
	
	
}

 