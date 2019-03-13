package xyz.cglzwz.designpattern.bp;

/**
 * 游戏角色创建者，充当抽象创建者
 * 
 * @author chgl16
 * @date 2019-03-13
 */

public abstract class ActorBuilder {
	// 让具体的创建者类调用这个对象
	protected Actor actor = new Actor();
	
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	
	/**
	 * 工厂方法，返回一个完整的游戏角色
	 * 
	 * @return
	 */
	public Actor createActor() {
		return actor;
	}
}
