package ttttttest_test;

public class test {
	int taste, spicy, 
	black_Noodle=0, spicy_Noodle=0, 
	black_Price=4500, spicy_Price=6000,
	sum = black_Price+spicy_Price;

void black_NoodleUp() {
	black_Noodle += 1;
}

void black_NoodleDown() {
	black_Noodle -= 1;
}

void spicy_NoodleUp() {
	spicy_Noodle +=1;
}
void spicy_NoodleDown() {
	spicy_Noodle -=1;
}

void black_PriceUp(){
	black_Price +=4500;
}
void black_PriceDown(){
	black_Price -=4500;
}

void spicy_PriceUp(){
	black_Price +=6000;
}

void spicy_PriceDown(){
	black_Price -=6000;
}

}
