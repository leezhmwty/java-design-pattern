package simple.factory;

public enum FruitTypeEnum {
    APPLE("apple", "苹果"),
    GRAPE("grape", "葡萄"),
    STRAWBERRY("strawberry", "草莓");


    private String type;
    private String remark;

    FruitTypeEnum(String type, String remark) {
        this.type = type;
        this.remark = remark;
    }

    public String getType() {
        return type;
    }

    public String getRemark() {
        return remark;
    }
}
