package xyz.cglzwz.designpattern.bp;

/**
 * 恶魔角色创建者，充当具体创建者
 * 
 * @author chgl16
 * @date 2019-03-13
 */

public class DevilBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		// 调用父类的对象
		actor.setType("恶魔");
	}

	@Override
	public void buildSex() {
		actor.setSex("男");
	}

	@Override
	public void buildFace() {
		actor.setFace("恐怖");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("黑衣");
	}
}
