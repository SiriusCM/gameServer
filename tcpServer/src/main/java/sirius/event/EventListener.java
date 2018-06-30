package sirius.event;

public interface EventListener {

    /**
     * 触发事件
     *
     * @return
     */
    boolean trigger();

    /**
     * 结束事件
     *
     * @return
     */
    boolean end();
}
