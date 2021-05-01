
public class unhealthy extends human {
	int muscle =25;
	int fat = 50;
	int stresslevel = 4;
	double weight ;
	String activities[] = new String[100];
	int i=0;
public unhealthy(){
	
}
unhealthy(String name,int age){
	this.name = name;
	this.age = age;
}
double getweight() {
	return weight;
}
int getfat() {
	return fat;
}
int getmuscle() {
	return muscle;
}
int getstresslevel() {
	return stresslevel;

}
double updateweight(){
	
	return fat *0.3 + muscle *0.6;
}
public void eat(Food food){
	muscle = muscle -food.muscle;
	fat = fat +food.fat;
	stresslevel = stresslevel-2;
	activities[i] = food.name;
	i++;
	
}
public void workout(Exercise excercise){
	muscle = muscle -excercise.muscle;
	fat = fat +excercise.fat;
	stresslevel = stresslevel+2;
	activities[i] = excercise.name;
	i++;
}
}
