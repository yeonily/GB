package arrayListTask;

public class Test {

	public static void main(String[] args) {
		Fruit apple = new Fruit();
		Fruit banana = new Fruit();
		
		Market market = new Market();
		
		apple.setName("사과");
		apple.setPrice(1000);
		
		banana.setName("바나나");
		banana.setPrice(800);
		
		market.plus(apple);
		market.plus(banana);
		
		System.out.println(apple);
		System.out.println(market.getAverage());
		
		
		
		apple.getName();
		
		System.out.println("-------------");
		Love love = new Love();
		Love love2 = new Love();
		DateApp dateApp = new DateApp();
		
		love.setName("한동석");
		love.setAge(50);
		love.setIndex(1);
		
		love2.setName("한석동");
		love2.setAge(25);
		love2.setIndex(2);
		
		dateApp.plus(love);
		dateApp.plus(love2);
		System.out.println(DateApp.loves);
//		
//		love.setAge(30);
//		dateApp.update(love);
//
//		System.out.println(DateApp.loves);
		
		dateApp.sort();
		System.out.println(DateApp.loves);
		
		System.out.println("-------------");
		
//		Food jjajangmen = new Food();
//		Food ramen = new Food();
//		Food sushi = new Food();
//		Food kimbob = new Food();
//		Food pasta = new Food();
//		
//		ramen.setKind("일식");
//		ramen.setName("라멘");
//		ramen.setPrice(9000);
//		
//		sushi.setKind("일식");
//		sushi.setName("초밥");
//		sushi.setPrice(12000);
//		
//		kimbob.setKind("한식");
//		kimbob.setName("김밥");
//		kimbob.setPrice(1000);
//		
//		pasta.setKind("양식");
//		pasta.setName("파스타");
//		pasta.setPrice(7000);
//		
//		jjajangmen.setKind("중식");
//		jjajangmen.setName("짜장면");
//		jjajangmen.setPrice(3000);
//		
//		
//		
		Restaurant restaurant = new Restaurant();
//		restaurant.add(ramen);
//		restaurant.add(pasta);
//		restaurant.add(jjajangmen);
//		restaurant.add(kimbob);
//		restaurant.add(sushi);
//		System.out.println(Restaurant.foods);
//		
//		System.out.println(pasta);
//		System.out.println(restaurant.check("파스타"));
//		System.out.println(restaurant.check("김밥"));
//		
//		System.out.println(restaurant.listSearch("일식"));
//		
//		kimbob.setKind("중식");
//		restaurant.update(kimbob);
//		System.out.println(Restaurant.foods);
//		
//		System.out.println(restaurant.countCheck("중식")+"개");
		
		System.out.println("-------------");
		
		Food food = new Food();
		
		food.setName("치즈돈까스");
		food.setPrice(8500);
		food.setKind("양식");
		
		Restaurant.foods.add(food);
		
		food = new Food();
		
		food.setName("한우갈비찜");
		food.setPrice(12000);
		food.setKind("한식");
		
		Restaurant.foods.add(food);
		
		food = new Food();
		
		food.setName("찜닭");
		food.setPrice(1800);
		food.setKind("한식");
		
		Restaurant.foods.add(food);
	
		//리턴이 arraylist<Food>
		for (Food selected : restaurant.getFoods("한식")) {
			System.out.println(selected);
		}
		
		System.out.println(restaurant.getCount("한식")+"개");
		
		
		
		
		
		
		
		
		
		
		
	}

}
