package xyz.cglzwz.designpattern.bp;

/**
 * 天使角色创建者，充当具体创建者
 * 
 * @author chgl16
 * @date 2019-03-13
 */

public class AngelBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("天使");
	}

	@Override
	public void buildSex() {
		actor.setSex("女");
	}

	@Override
	public void buildFace() {
		actor.setFace("美丽");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("白裙");
	}
}
