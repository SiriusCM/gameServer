package sirius.state;

import sirius.sprite.Sprite;

/**
 * @author 高连棣
 * @date 2018/7/2 16:03
 */
public interface State {

	boolean inState(Sprite sprite);
}
