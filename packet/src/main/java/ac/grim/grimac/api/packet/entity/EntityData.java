package ac.grim.grimac.api.packet.entity;

public interface EntityData<T> {
    int getIndex();

    void setIndex(int index);

    EntityDataType<T> getType();

    public void setType(EntityDataType<T> type);

    T getValue();

    void setValue(T value);
}
