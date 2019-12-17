package cn.nukkit.item;

public class ItemShulkerBox extends Item {

    public ItemShulkerBox() {
        this(0, 1);
    }

    public ItemShulkerBox(Integer meta) {
        this(meta, 1);
    }

    public ItemShulkerBox(Integer meta, int count) {
        super(SHULKER_BOX, meta, count, "Shulker Box");
    }

}
