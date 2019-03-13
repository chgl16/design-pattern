package xyz.cglzwz.designpattern.bp;

/**
 * 角色控制器，充当指挥者
 * 
 * @author chgl16
 * @date 2019-03-13
 */

public class ActorController {
	/**
	 * 逐步构造复杂产品对象
	 * 
	 * @param actorBuilder
	 * @return
	 */
	public Actor construct(ActorBuilder actorBuilder) {
		actorBuilder.buildType();
		actorBuilder.buildSex();
		actorBuilder.buildFace();
		actorBuilder.buildCostume();
		
		return actorBuilder.createActor();
	}
}
