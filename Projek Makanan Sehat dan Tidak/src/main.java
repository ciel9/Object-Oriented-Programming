import java.util.*;
public class main {
	
static void detail() {
		 System.out.println("---------------------------");
		 System.out.println("         Living Life       ");
		 System.out.println("---------------------------");
		 System.out.println("1.Healthy");
		 System.out.println("2.Unhealthy");
		 System.out.println("Choose your character: ");
	}

static void food() {
	    System.out.println("---------------------------");
	    System.out.println(" Foods");
	    System.out.println("-----------");
		System.out.println("ID: 1");
		System.out.println("Name: Pizza");
		System.out.println("Muscle: 3");
		System.out.println("Fat: 10");
		System.out.println("---------------------------");
		System.out.println("ID: 2");
		System.out.println("Name: Risotto");
		System.out.println("Muscle: 2");
		System.out.println("Fat: 4");
		System.out.println("---------------------------");
		System.out.println("ID: 3");
		System.out.println("Name: Burger");
		System.out.println("Muscle: 4");
		System.out.println("Fat: 9");
		System.out.println("---------------------------");
		System.out.println("ID: 4");
		System.out.println("Name: Noodle");
		System.out.println("Muscle: 3");
		System.out.println("Fat: 5");
		System.out.println("---------------------------");
		System.out.println("ID: 5");
		System.out.println("Name: Salad");
		System.out.println("Muscle: 1");
		System.out.println("Fat: 1");
		System.out.println("---------------------------");
		System.out.print("Choose your food: ");
}

 static void menu() {
		 System.out.println("---------------------------");
		 System.out.println("         Living Life       ");
		 System.out.println("---------------------------");
		 System.out.println("1.Your Detail");
		 System.out.println("2.Eat");
		 System.out.println("3.Workout");
		 System.out.println("4.List of activities");
		 System.out.println("5.credits");
		 System.out.println("0.Exit");
		 System.out.print("Input: ");
	 }
 
 static void excercise() {
	    System.out.println("---------------------------");
	    System.out.println(" Excercises");
	    System.out.println("-----------");
		System.out.println("ID: 1");
		System.out.println("Name: Plank");
		System.out.println("Muscle: 1");
		System.out.println("Fat: 2");
		System.out.println("---------------------------");
		System.out.println("ID: 2");
		System.out.println("Name: Crunch");
		System.out.println("Muscle: 2");
		System.out.println("Fat: 3");
		System.out.println("---------------------------");
		System.out.println("ID: 3");
		System.out.println("Name: Squat");
		System.out.println("Muscle: 3");
		System.out.println("Fat: 3");
		System.out.println("---------------------------");
		System.out.println("ID: 4");
		System.out.println("Name: Pull up");
		System.out.println("Muscle: 2");
		System.out.println("Fat: 2");
		System.out.println("---------------------------");
		System.out.println("ID: 5");
		System.out.println("Name: Comandos");
		System.out.println("Muscle: 5");
		System.out.println("Fat: 2");
		System.out.println("---------------------------");
		System.out.print("Choose your workout: ");
		

	}
 

	public static void main(String[] args) {
		String nama = null;
		int muscle = 0;
		int fat = 0;
		// TODO Auto-generated method stub
	 Scanner scan = new Scanner (System.in);
	 System.out.println("---------------------------");
	 System.out.println("         Living Life       ");
	 System.out.println("---------------------------");
	 
	 System.out.println("Healthy");
	 System.out.print("Name: ");
	 String nameh = scan.next();
	 System.out.print("Age: ");
	 int ageh = scan.nextInt();
	 System.out.println("Healthy character is added");
	 healthy healthy = new healthy(nameh,ageh);
	 
	 
	 System.out.println("Unhealthy");
	 System.out.print("Name: ");
	 String nameu = scan.next();
	 System.out.print("Age: ");
	 int ageu = scan.nextInt();
	 System.out.println("Unhealthy character is added");
	 unhealthy unhealthy = new unhealthy(nameu,ageu);
	 while (true) {
	menu();
	int input = scan.nextInt();
	switch(input) {
	case 1 : 
		detail();
		int input_detail = scan.nextInt();
		if(input_detail == 1) {
			System.out.println("Name: "+healthy.name);
			System.out.println("Age: "+healthy.age);
			System.out.println("Weight: "+healthy.updateweight());
			System.out.println("Muscle: "+healthy.muscle);
			System.out.println("Fat: "+healthy.fat);
			System.out.println("Stress Level: "+healthy.stresslevel);
			
		}else if(input_detail == 2) {
			System.out.println("Name: "+unhealthy.name);
			System.out.println("Age: "+unhealthy.age);
			System.out.println("Weight: "+unhealthy.updateweight());
			System.out.println("Muscle: "+unhealthy.muscle);
			System.out.println("Fat: "+unhealthy.fat);
			System.out.println("Stress Level: "+unhealthy.stresslevel);
			
		}
		
		;break;
	case 2:
		
		food();
		int input_food = scan.nextInt();
		if(input_food == 1) {
			nama ="Pizza";
			muscle = 3;
			fat = 10;
		}else if(input_food == 2) {
			nama = "Risotto";
		    muscle =2;
			fat =4;
		}else if(input_food==3) {
			nama ="Burger";
			muscle = 4;
			fat = 9;
		}else if(input_food==4) {
			nama="Noodle";
			muscle=3;
			fat=5;
		}else if (input_food ==5) {
			nama="Salad";
			muscle=1;
			fat=1;
		}
		Food foods = new Food(nama,muscle,fat);
		detail();
		int input_eat = scan.nextInt();
		
		if(input_eat == 1) {
			if(healthy.stresslevel<= 10) {
				System.out.println(healthy.name+" doesn't really like it");
				healthy.eat(foods);
				
			}else if(healthy.stresslevel>10) {
				System.out.println(healthy.name+" is stressed out");
			}
		}else if(input_eat==2) {
			if(unhealthy.muscle >= foods.muscle) {
				System.out.println(unhealthy.name+" loves it");
				unhealthy.eat(foods);
				
			}else if(healthy.muscle<foods.muscle) {
				System.out.println(unhealthy.name+" is way too unhealthy");
			}
	
			
		};break;
	case 3:
		
		excercise();
		int input_excercise = scan.nextInt();
		if(input_excercise == 1) {
			nama ="Plank";
			muscle = 1;
			fat = 2;
		}else if(input_excercise  == 2) {
			nama = "Crunch";
		    muscle =2;
			fat =3;
		}else if(input_excercise ==3) {
			nama ="Squat";
			muscle = 3;
			fat = 3;
		}else if(input_excercise ==4) {
			nama="Pull up";
			muscle=2;
			fat=2;
		}else if (input_excercise  ==5) {
			nama="Comandos";
			muscle=5;
			fat=2;
		}
		Exercise excercises = new Exercise(nama,muscle,fat);
		detail();
		int input_workout = scan.nextInt();
		if (input_workout == 1) {
			if(healthy.fat >= fat) {
				System.out.println(healthy.name +"loves it");
				healthy.workout(excercises);
			}else if(healthy.fat<fat) {
				System.out.println(healthy.name +"is way too healthy");
			}
			
			
		}
		else if(input_workout == 2) {
			if(unhealthy.stresslevel <= 10) {
				System.out.println(unhealthy.name +"doesn't really like it");
				unhealthy.workout(excercises);
			}else if(healthy.stresslevel>10) {
				System.out.println(healthy.name +"is stressed out");
			}
			
		};break;
	case 4:
		detail();
		int input_detail_kegiatan = scan.nextInt();
		if(input_detail_kegiatan == 1) {
			for(int i=0;i<healthy.activities.length;i++) {
			if(healthy.activities[i] != null) {
				System.out.println(healthy.activities[i]);
				}
			
			}
		}else if(input_detail_kegiatan == 2) {
			for(int i=0;i<unhealthy.activities.length;i++) {
				if(unhealthy.activities[i] != null) {
					System.out.println(unhealthy.activities[i]);
					}
				
				}
		};break;
		
	
	 case 5:
		 System.out.println("Yohana Cindy Elsanjaya");
		 break;
	}
	
    if (input != 0) {
        continue;
    } else if(input == 0) {
       System.out.println("Goodbye!");
       break;
    	}
	}
	}
}
