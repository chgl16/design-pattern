package xyz.cglzwz.designpattern.bp;

public class App {	
	public static void main(String[] args) {
		ActorBuilder actorBuilder = new HeroBuilder();
		ActorController ac = new ActorController();
		Actor actor = ac.construct(actorBuilder);
		
		System.out.println(actor.getType());
		System.out.println(actor.getSex());
		System.out.println(actor.getFace());
		System.out.println(actor.getCostume());
		System.out.println("--------------");
		
		// 切换为创建天使
		actorBuilder = new AngelBuilder();
		actor = ac.construct(actorBuilder);
		
		System.out.println(actor.getType());
		System.out.println(actor.getSex());
		System.out.println(actor.getFace());
		System.out.println(actor.getCostume());
	}
}
